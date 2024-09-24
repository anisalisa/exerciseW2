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
    //getter for h-allowance
    public double getHealthAllowance(){
        return healthAllowance;
    }
    //setter for h-allowance
    public void setHealthAllowance (double healthAllowance){
        this.healthAllowance = healthAllowance;
    }
    //getter for t-allowance
    public double getTransportAllowance(){
        return transportAllowance;
    }
    //setter for t-allowance
    public void setTransportAllowance (double transportAllowance){
        this.transportAllowance = transportAllowance;
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
    
}
