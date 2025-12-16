import java.util.Scanner;  
public class TaskFive {

public static void main(String...args){
Scanner input = new Scanner(System.in);
int sumScore = 0;

for (int counter= 1; counter<=10; counter++){

System.out.print("Enter score :");
int score = input.nextInt();




if (score% 2==0){
sumScore+= score;

}

}







System.out.printf("The sum of only even numbers in the collected score is %d%n ",sumScore);



}











}                                                                          
