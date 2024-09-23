import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<5; i++){
            
            System.out.println("Enter below details ");
            System.out.println("Enter student name: ");
            String setStudentName = scanner.nextLine();
            System.out.println("Enter math score: ");
            int setMathScore = scanner.nextInt();
            System.out.println("Enter science score: " );
            int setScienceScore = scanner.nextInt();
            System.out.println("Enter english score: " );
            int setEnglishScore = scanner.nextInt();
            students[i] = new Student(setStudentName, setMathScore, setScienceScore, setEnglishScore);

        }
        scanner.close();
    } 
}
