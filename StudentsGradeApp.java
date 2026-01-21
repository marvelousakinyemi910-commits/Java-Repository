import java.util.Scanner;
public class StudentsGradeApp{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter number of students: ");
    int numberOfStudents = input.nextInt();
    System.out.println("Enter number of subjects: ");
    int numberOfSubjects = input.nextInt();
    
    int[][] scores = new int [numberOfStudents][ numberOfSubjects];
    for(int count = 0; count < numberOfStudents; count++){
        System.out.println("Entering scores for student "+ ( count+1)+": ");
       
        for(int counter = 0; counter < numberOfSubjects; counter++ ){
       
            int score;
            do{
            System.out.println("Enter score for subject "+ (counter+1)+": ");

            score = input.nextInt();
            if ( score < 0 || score > 100 ){
            System.out.print("Invalid score! Kindly enter score from (0 - 100)");
}
            

           } while ( score < 0 || score > 100 );
                scores [count][counter] = score;
    
    }
}

    
    int[] totalScores = new int [numberOfStudents];
    double [] average = new double [numberOfStudents];
    int[] positions = new int[numberOfStudents]; 

    for (int count = 0; count< numberOfStudents; count++){
        int sum = 0;
    for(int counter = 0; counter < numberOfSubjects; counter++ ){
        sum+= scores [count][counter];


    totalScores[count] = sum;
    average[count] = (double) sum/numberOfSubjects;
}
}
    for(int count = 0; count < numberOfStudents; count++){  
    int position = 1;
    for(int counter = 0; counter < numberOfStudents; counter++ ){
    if(totalScores[counter]>totalScores[count] ){
        position++;
    }

}
    positions[count] = position;
 }  
    System.out.print("STUDENT    ");
    for(int index = 0; index < numberOfSubjects; index++){

        System.out.printf("SUB%-2d ", index+1);
}
    System.out.printf("  TOT    AVE  POS%n");
    
    for(int count = 0; count < numberOfStudents; count++){
      System.out.printf("Student %-2d ", count+1); 
    for(int counter = 0; counter < numberOfSubjects; counter++ ){
       System.out.printf(" %-5d ", scores[count][counter]);
}

     System.out.printf("%-5d %-5.2f %-5d%n",  totalScores[count],average[count],positions[count] );
}















   


  } 
}
