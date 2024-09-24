public class Student {
    private String studentName;
    private int[] scores;
    private double averageScore;

    //construtor 
    public Student(String setStudentName, int setMathScore, int setScienceScore, int setEnglishScore) {
        this.studentName = setStudentName;
        this.scores = new int[]{setMathScore, setScienceScore, setEnglishScore};
        this.averageScore = calculateAverage(); // Calculate the average at the time of object creation
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
}