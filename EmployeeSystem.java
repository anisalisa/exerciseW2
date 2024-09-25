import java.util.ArrayList; 
import java.util.function.Predicate; 
import java.time.LocalDateTime; 

public class EmployeeSystem {
    
    public static void main(String[] args) {
        ArrayList<String>employees = new ArrayList<>();
        Predicate<Double> baseSalary = (salary) -> salary > 1000;
        double salary = 2000;

        employees.add("Anis");
        employees.add("Alisa");

        if (baseSalary.test(salary)){
            System.out.println("Your salary is: RM " + salary + " Congrats!");
        } else {
            System.out.println(salary + " Try again");
        }
    for (String employee: employees){
        System.out.println("Employee name: " + employees.get(0));
        if (baseSalary.test(salary)){
            System.out.println("Your salary is: RM " + salary + " Congrats!");
        } else {
            System.out.println(employee);
            System.out.println(salary + " Try again");
        }
        
    }
}}
