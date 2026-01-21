import java.util.Scanner;
public class StudentGradeTest{
public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    System.out. println("Enter number of students: ");
    int numberOfStudents = input.nextInt();
    System.out. println("Enter number of subjects: ");
    int numberOfSubjects = input.nextInt();
    
    int [][] scores = new int [numberOfStudents][numberOfSubjects];
    for(int count = 0; count < numberOfStudents; count++){
       int numberofStudents = count + 1;
        for(int counter = 0; counter < numberOfSubjects; counter++ ){
        int numberofSubjects = counter + 1;

            System.out.println("Entering scores for students: "+ ( count+1));
            System.out.println("Enter score for subject:"+ (counter+1));
           scores[count][counter] = input.nextInt();
            
}
}
        StudentGrade myStudentGrade = new StudentGrade("Welcome to java    programmming",scores);

  System.out.printf("Welcome to the grade book for%n%s%n%n",myStudentGrade.getSubjectName());
        myStudentGrade.processScores();


}
}

