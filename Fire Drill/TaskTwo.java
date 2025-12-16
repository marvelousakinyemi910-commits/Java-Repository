import java.util.Scanner;  
public class TaskTwo {

public static void main(String...args){
Scanner input = new Scanner(System.in);
int sum = 0;

for (int counter= 1; counter<=10; counter++){

System.out.print("Enter score :");
int score = input.nextInt();

sum += score;

}

double average = sum/10;





System.out.printf("The average of the score is %.2f%n",average);


}











}                                                                          
