import java.util.Scanner; 

public class EmployeeSalary {

    public static void main(String[] args) {
        Employee[] employee = new Employee [5];
        Scanner scanner = new Scanner(System.in);

        //loop to populate the array of employees
        for (int i=0; i<employee.length; i++){
            System.out.println("Employee details");
            System.out.println("Employee name: ");
            String name = scanner.nextLine();
            System.out.println("Enter base salary: ");
            double baseSalary = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Enter health allowance: ");
            double healthAllowance = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Enter transport allowance: ");
            double transportAllowance = scanner.nextDouble();
            scanner.nextLine();

            employee[i] = new Employee(name, baseSalary, healthAllowance, transportAllowance);
        }
        //decision contruct
        System.out.println("Employee details");
        for (Employee employee2: employee){
            System.out.println("Employee name: " + employee2.getName());
            System.out.println("Your bonus: " + employee2.assignBonus());
            System.out.println("Your total salary: " + employee2.calculateTotalSalary());
            
    }
    scanner.close();
}
}