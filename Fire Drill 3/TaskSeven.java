import java.util.Scanner;
public class TaskSeven{

  
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);
    
    int [] scores = new int [10];
    
   System.out.println("Enter 10 scores: ");
   
    
    for(int index = 0; index<10; index ++){
    System.out.print("Enter the scores: ");
    scores[index] = input.nextInt();
    
    }
        
    int sum = sumOddIndexesScores(scores);
    System.out.printf("The sum of scores at odd index is %d%n",sum);
   }

        
    public static int sumOddIndexesScores(int [] scores){
       int sum = 0;
        for (int index = 1;index < 10; index += 2){
         sum += scores[index];

}  
        
   return sum;
       
    
     
}   
    
}
    



    


