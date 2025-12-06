
import java.util.Scanner;
public class SimpleInterest{
public static void main(String...args){
Scanner input=new Scanner(System.in);
System.out.println("Enter principal amount :");
double principalAmount=input.nextDouble();

System.out.println("Enter rate :");
double rate=input.nextDouble();
System.out.println("Enter time :");
double time=input.nextDouble();

double simpleInterest=(principalAmount*rate*time)/100;
System.out.println("Simple Interest: " +simpleInterest);
}



}
