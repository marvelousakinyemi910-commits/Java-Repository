
public class StudentGrade{
 
    private String subjectName;
    private int[][] scores;
    public StudentGrade(String subjectName, int[][] scores){
    this.subjectName = subjectName;
    this.scores = scores;



}

    public static void setSubjectName(String subjectName){
        this.subjectName = subjectName;

}
    public String getSubjectName(){
        return subjectName;

  }
    public void processScores() {

    outputScores();
    
  
    System.out.printf("Lowest grade is %d%nHighest grade is %d%n",getMinimum(),getMaximum());
    
      

}
    public static int getMinimum() {
    int lowGrade = scores[0][0];
    for(int []studentGrades:scores) {
    for (int score: studentGrades){

        if(score < lowGrade) {
        lowGrade = score;
            }
       }
 }
    return lowGrade;
    }

    public static int getMaximum() {
    int highGrade = scores[0][0];
    for(int[] studentGrades:scores){
    for(int score: studentGrades){
    if(score > highGrade){
        highGrade = score;
    }
   }
 }
  
     return highGrade;

    }
   public static double getAverage(int[] setOfScores) {
    int total = 0;
    for(int score: setOfScores){
     total += score;

}
    return(double) total/setOfScores.length;

    }
    public static int getPosition()
}
   
    public void outputScores() {
    System.out.printf("The grades are :%n%n");
    for(int subject = 0; subject< scores[0].length; subject++){
    System.out.printf("Subject  ", subject + 1);
}
    System.out.println("Average");
    
    for(int student = 0; student < scores.length; student++){
    System.out.printf("Student %2d,",student+1 );
    for(int subject: scores[student]){
    System.out.printf("%8d",subject);
    }
    double average = getAverage(scores[student]);
    System.out.printf("%9.2f%n",average);
    }
    }


    

















 



