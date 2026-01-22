import java.util.Scanner;
import java.util.Random;
public class TaskTwo{
    public static void main(String[] args){
    Random random = new Random();
     Scanner input = new Scanner(System.in);
     
     int number = random.nextInt(20) + 1;
     System.out.println("Guess a number: ");
     int guess = input.nextInt();
    
        if(number == guess) {
            System.out.println("Correct");
     }
     else {
        System.out.println("Wrong guess");
        }
   
        
}

}

