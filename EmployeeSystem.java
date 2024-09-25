import java.util.ArrayList; 
import java.util.function.Predicate;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter; 

public class EmployeeSystem {
    private String name;
    private double baseSalary;
    private double healthAllowance;
    private double transportAllowance;
    private double totalSalary;

    //constructor
    public EmployeeSystem(String name, double baseSalary, double healthAllowance, double transportAllowance){
        this.name = name;
        this.baseSalary = baseSalary;
        this.healthAllowance = healthAllowance;
        this.transportAllowance = transportAllowance;
        this.totalSalary = calculateTotalSalary(); //calculate the total salary
    }
    //method for totalSalary
    public double calculateTotalSalary() {
        double totalSalary = baseSalary + healthAllowance + transportAllowance + assignBonus();
        return totalSalary;
    }
    //method for assignBonus
    public double assignBonus(){
        double bonus = 0.0;

        if (baseSalary>=5000){
            bonus = 0.10;
        } else if (baseSalary>=3000){
            bonus = 0.05;
        } else {
            bonus = 0.0;
        }
        double totalBonus = baseSalary + (bonus * baseSalary);
        return totalBonus;
    } 
    public void displayEmployee(){
        System.out.println("Employee's name: " + name);
        System.out.println("Employee's bonus: RM " + assignBonus());
        Predicate<Double> newBonus = (num) -> num > 1000;
        
        if (newBonus.test(assignBonus())){
            System.out.println("Congratulations on your bonus!");
        } else {
            System.out.println("Sorry, try again");
        }
        //System.out.println(name + "'s total salary: RM " + totalSalary);
    }
    public static void main(String[] args) {
        ArrayList<EmployeeSystem>employee = new ArrayList<>();
        LocalDate startDate = LocalDate.of(2024, 8,1);
        LocalDate endDate = LocalDate.of(2024, 8, 31);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("------Employee Payslip-------");
        System.out.println();
        System.out.println("Start Date: " + startDate.format(formatter) + " until  End Date: " + endDate.format(formatter));
        System.out.println();
        employee.add(new EmployeeSystem ("Anis", 7000, 890, 890));
        employee.add(new EmployeeSystem ("Alisa", 9000, 890, 890));
        employee.add(new EmployeeSystem ("Nor", 1000, 890, 890));

        for (EmployeeSystem employ: employee){
            employ.displayEmployee();
            System.out.println();
    } 
    } }
    
