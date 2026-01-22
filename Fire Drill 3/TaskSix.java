import java.util.Scanner;
public class TaskSix{
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);
    
    int [] scores = new int [10];
    
   System.out.println("Enter 10 scores: ");
    
    for(int index = 0; index<10; index ++){
    System.out.print("Enter the score " + (index+1)+ ": ");
    scores[index] = input.nextInt();
    
    
   } 

     int sum = sumEvenIndexScores(scores);
      

    System.out.printf("The sum of scores at even index is %d%n ",sum);

        }

    




    public static int sumEvenIndexScores (int[] scores){
        int sum = 0;

    for (int index = 0;index < 10; index += 2) {
     
    sum += scores[index];
    
}
    
    return sum;
}

}
