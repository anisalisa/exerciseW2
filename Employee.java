public class Employee {
    private String name;
    private double baseSalary;
    private double healthAllowance;
    private double transportAllowance;
    private double totalSalary;
    private double bonus;
    private double totalAllowances;

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
        double totalSalary = baseSalary + healthAllowance + transportAllowance + bonus;
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
    //method for allowance
    public double totalOfAllowances(){
        double totalAllowances = healthAllowance + transportAllowance + bonus;
        return totalAllowances;
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
        return bonus;
    } 
    
}
