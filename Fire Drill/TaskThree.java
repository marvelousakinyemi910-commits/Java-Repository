import java.util.Scanner;  
public class TaskThree {

public static void main(String...args){
Scanner input = new Scanner(System.in);
int sum = 0;

for (int counter= 1; counter<=10; counter++){

System.out.print("Enter score :");
int score = input.nextInt();

sum += score;

}

double average = sum/10;





System.out.printf("The sum and average of the score is %d%n and %.2f%n  ",sum,average);



}











}                                                                          
