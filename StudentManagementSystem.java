import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        //scanner object to take input
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<students.length; i++){
            System.out.println("Enter below details "+ (i+1));
            System.out.println("Enter student name: ");
            String setStudentName = scanner.nextLine();
            System.out.println("Enter math score: ");
            int setMathScore = scanner.nextInt();
            System.out.println("Enter science score: " );
            int setScienceScore = scanner.nextInt();
            System.out.println("Enter english score: " );
            int setEnglishScore = scanner.nextInt();
            scanner.nextLine();
            //new student object and add to the array
            students[i] = new Student(setStudentName, setMathScore, setScienceScore, setEnglishScore);

        }
        System.out.println("Students grades:");
        for (Student student: students){
            System.out.println("Student name: " + student.getName());
            System.out.println("Average score: " + student.calculateAverage());
            System.out.println("Grade is: " + student.assignGrade());

        }

        scanner.close();
    } 
}
