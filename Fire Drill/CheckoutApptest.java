import java.util.ArrayList;
import java.util.Scanner;
public class CheckoutApptest{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your customer's name? ");                         
        String customer = input.nextLine();
        
        System.out.println("What is your name? ");
        String cashier = input.nextLine();
        
        ArrayList<CheckoutApp.Item> items = CheckoutApp.collectItems();
            double [] totals = CheckoutApp.calculateTotals(items);
        
            System.out.println("How much did the customer give you? ");
    
            double paid = input.nextDouble();
               CheckoutApp.printReceipt(customer, cashier, items, totals[0], totals[1], totals[2],    totals[3], paid);

    

}









}
