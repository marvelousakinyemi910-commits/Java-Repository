import java.util.Scanner;
import java.util.Random;
public class TaskSix{
    public static void main(String[] args){
    Random random = new Random();
     Scanner input = new Scanner(System.in);
     
     int number = random.nextInt(20) + 1;
     System.out.println("Guess a number: ");
     int guess = input.nextInt();
        int count = 0;
        while(count != 10){

         System.out.println("Guess a number: ");
         guess = input.nextInt();
        if(number == guess) {
            System.out.println("Correct number");
     }
         else if(guess> number ){
            System.out.println("Too high");
  }
        else if (guess< number){
            System.out.println("Too low");
   }

     else {
        System.out.println("Game Over");
        }
     count++;
   }
        
}

}
}
