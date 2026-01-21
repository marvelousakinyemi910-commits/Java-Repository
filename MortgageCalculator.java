import java.util.Scanner;
public class MortgageCalculator{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        int principal = input.nextInt();
       
        System.out.println("Enter the annual Interest rate: ");
              
        double interest = input.nextDouble();
        System.out.println("Enter the duration in years: ");
        int duration = input.nextInt();

        double rate = interest/(100*12);
        duration = duration*12;
        
        double monthlyPayment = principal*rate*Math.pow(1+rate,duration)/(Math.pow(1+rate,duration)-1);
        
        System.out.printf("Your monthly payment is $%.2f%n",monthlyPayment);
        



        }









}
