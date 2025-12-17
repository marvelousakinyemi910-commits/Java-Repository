import java.util.Scanner;
public class CreditLimitCalculator{
    public static void main(String[]args){
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number of customers: ");
    int customer = input.nextInt();
    int counter = 1;

    while(counter <= customer){

        System.out.println("Enter account number: ");
        long accountNumber = input.nextLong();
        
        System.out.println("Enter balance at the beginning of the month: ");
        long beginningBalance = input.nextLong();
        
        System.out.println("Enter total of all items charged: ");
        long charges = input.nextLong();

        System.out.println("Enter total of all credits applied this month: ");
         long credits = input.nextLong();
        
        System.out.println("Enter allowed credit limit");
        long creditLimit = input.nextLong();
        
         long newBalance = beginningBalance + charges - credits;


   System.out.printf("The new balance of customer %d is %d%n", counter,newBalance);
    
    if ( newBalance > creditLimit) {

    System.out.println("Credit limit exceeded ");
        
 }
    else {
            
    System.out.println("Credit limit not exceeded ");
}
     
    


    counter++;

}     




        }






}






