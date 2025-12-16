import java.util.Scanner;  
public class TaskSix {

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


double average = sumScore/10;




System.out.printf("The average of task 5 is %.2f%n ",average);



}











}                                                                          
