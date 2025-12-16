import java.util.Scanner;  
public class TaskFour {

public static void main(String...args){
Scanner input = new Scanner(System.in);
int sumScore = 0;

for (int counter= 1; counter<=10; counter++){

System.out.print("Enter score :");
int score = input.nextInt();




if (counter% 2==0){
sumScore+= score;

}

}







System.out.printf("The sum of even indexes is %d%n ",sumScore);



}











}                                                                          
