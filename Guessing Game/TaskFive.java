import java.util.Scanner;
import java.util.Random;
public class TaskFive{
    public static void main(String[] args){
    Random random = new Random();
     Scanner input = new Scanner(System.in);
     
     int number = random.nextInt(20) + 1;
     System.out.println("Guess a number: ");
     int guess = input.nextInt();
     int rightChoice = 0;
    
    do{

         
         guess = input.nextInt();
          ++ rightChoice;
         
        if(number == guess) {
           
        }
            
     
         else if(guess> number ){
            System.out.println("Too high");
  }
         else if(guess< number){
             System.out.println("Too low");

   }

     else {

          
            System.out.println("Wrong number");
         
        
        }
       
        }while(guess!= number);
           System.out.println("Correct number");
            System.out.println("Number of guesses: "+ rightChoice);
        
        


}
}
