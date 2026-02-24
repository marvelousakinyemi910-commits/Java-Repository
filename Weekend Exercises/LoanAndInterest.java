import java.util.Scanner;
public class LoanAndInterest{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the loan amount: ");
        int principal = input.nextInt();
       
              
       
        System.out.println("Enter the number of years: ");
        int duration = input.nextInt();
        duration = duration*12;
       
        
       System.out.println("Interest Rate  Monthly Payment  Total Payment");
        
        for(double interest = 5.0; interest <= 10; interest += 0.25){
            double rate = interest/(100*12);
            double monthlyPayment = principal*rate*Math.pow(1+rate,duration)/(Math.pow(1+rate,duration)-1);
            double total = monthlyPayment * duration;
            System.out.printf("%-7.3f%%  %-7.2f  %-7.2f%n", interest,monthlyPayment, total);
}
            
        }
         
}
