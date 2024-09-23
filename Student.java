public class Student {
    private String studentName;
    private int[] scores; //array for math, science and english scores
    private double averageScore;

    //construtor - setiap class kena ada constructor utk default value
    public Student(String setStudentName, int setMathScore, int setScienceScore, int setEnglishScore) {
        this.studentName = setStudentName;
        this.scores[0] = setMathScore;
        this.scores[1] = setScienceScore;
        this.scores[2] = setEnglishScore;
        this.averageScore = calculateAverage(); 
    }

    //method to calculate the average score (loops)
    public double calculateAverage() {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        averageScore = (double) total / scores.length;
        return averageScore;
    }

    //getter for student name
    public String getName(){ 
        return studentName; // return name so it can be use outside
    }
    //setter for student name
    public void setName(String studentName){ 
        this.studentName = studentName;
    }
    
    //getter for averageScore
    public int[] getScore(){ //since scores is in array form, so declare it as int[]
        return scores;
    }

    public void setScores(int[] scores){
        this.scores=scores;
    }
    // method that assign grade
    public char assignGrade(){
        if (averageScore >= 90){
            return 'A'; // it will return the char variable
        } else if (averageScore >= 80){
            return 'B';
        } else if (averageScore >= 70){
            return 'C';
        } else if (averageScore >= 60){
            return 'D';
        } else {
            return 'F';
        }
    }
    // public static void main(String[] args) {
    //     //Array to hold a list of 5 students
    //     String[] students = new String[5];
    //     //int[][] scores = new int [3][5];
    //     Student marks = new Student(null,null); //object, parameter utk contructor = null
        

    //     students[0] = "Anis";
    //     students[1] = "Alisa";
    //     students[2] = "Sabrina";
    //     students[3] = "Rara";
    //     students[4] = "Fathin";

    //     int[][] scores = {
    //         {78, 89, 32},
    //         {69, 56, 89},
    //         {67, 87, 90},
    //         {77, 98, 45},
    //         {67, 88, 56}
    //     };
        

    //     for (int row=0; row<scores.length; row++){ 
    //         marks.setName(students[row]);
    //         System.out.println("Student name: " + marks.getName());
            
    //         for (int col=0; col<scores[row].length; col++){ // to escape the matrix into array form
    //             marks.setScores(scores[row]);
    //             System.out.println(marks.getScore()[col]);
    //         }
    //          marks.calculateAverage();
    //          System.out.println("Your grade is: " + marks.assignGrade());

    //      }
    //     }
        }
           
    
