public class Employee {
    private String name;
    private double baseSalary;
    private double healthAllowance;
    private double transportAllowance;
    private double totalSalary;
    private double totalBonus;

    //constructor
    public Employee(String name, double baseSalary, double healthAllowance, double transportAllowance){
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
    //getter for name
    public String getName(){
        return name;
    }
    //setter for name
    public void setName (String name){
        this.name = name;
    }
    //getter for baseSalary
    public double getBaseSalary(){
        return baseSalary;
    }
    //setter for baseSalary
    public void setBaseSalary (double baseSalary){
        this.baseSalary = baseSalary;
    }
    //method for assignBonus
    public double assignBonus(){
        double bonus = 0.0;

        if (baseSalary>=50000){
            bonus = 0.10;
        } else if (baseSalary>=30000){
            bonus = 0.05;
        } else {
            bonus = 0.0;
        }
        double totalBonus = baseSalary + (bonus * baseSalary);
        return totalBonus;
    } 
    public void displayEmployee(){
        System.out.println("Employee's name: " + name);
        System.out.println(name + "'s bonus: RM " + assignBonus());
        System.out.println(name + "'s total salary: RM " + totalSalary);
    }
    public static void main(String[] args) {
        Employee[] employees = new Employee [5];

        employees[0] = new Employee("Anis", 70000, 890, 890);
        employees[1] = new Employee("Alisa", 90000, 890, 890);
        employees[2] = new Employee("Nor", 100000, 890, 890);
        employees[3] = new Employee("Azhar", 500000, 890, 890);
        employees[4] = new Employee("Alia", 20000, 890, 890);

        for (Employee employ: employees){
            employ.displayEmployee();
        }

        try{
            int[] arrays = new int[5];
            System.out.println(arrays[10]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught bad "+ e.getMessage());
        } finally{
            System.out.println("It will executed anyway");
        }
        System.out.println("The program is continue");
    }
    } 
    
