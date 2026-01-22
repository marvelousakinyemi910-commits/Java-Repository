import java.util.Scanner;
public class TaskFour{
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);
    
    int [] scores = new int [10];
    
   System.out.println("Enter 10 scores: ");
    
    for(int index = 0; index<10; index ++){
    System.out.print("Enter the score " + (index+1)+ ": ");
    scores[index] = input.nextInt();
    
    
   } 
      for (int index = 0;index < 10; index+=2) {

    System.out.println(outputEvenIndexScores(scores,index));

        }

    }




    public static int outputEvenIndexScores (int[] scores, int index ){
        

     return scores[index];

    
}
    
}


