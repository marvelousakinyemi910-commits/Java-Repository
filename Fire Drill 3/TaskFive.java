import java.util.Scanner;
public class TaskFive{
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);
    
    int [] scores = new int [10];
    
   System.out.println("Enter 10 scores: ");
    
    for(int index = 0; index<10; index ++){
    System.out.print("Enter the score " + (index+1)+ ": ");
    scores[index] = input.nextInt();
    
    
   } 
      for (int index = 1;index < 10; index+=2) {

    System.out.println(outputOddIndexScores(scores,index));

        }

    }




    public static int outputOddIndexScores (int[] scores, int index ){
        

     return scores[index];

    
}
    
}


