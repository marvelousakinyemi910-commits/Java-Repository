import java.util.Scanner;
public class TaskThree{
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);
    
    int [] scores = new int [10];
   System.out.println("Enter 10 scores: ");
    
    for(int index = 0; index<10; index ++){
    System.out.print("Enter the scores: ");
    scores[index] = input.nextInt();
   } 
    for(int score:scores){
    System.out.print(score + " ");
    }

    
}
    
}

