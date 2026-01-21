
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
    public class CheckoutApp {
       public static Scanner input = new Scanner(System.in);
       static class Item{
        String name;
        int quantity;
        double price;
        double total;
        Item(String name, int quantity,double price){
        
            this.name = name;
            this.quantity = quantity;
            this.price = price;
            this.total = quantity * price;

            }

        }
    public static ArrayList<Item> collectItems() {
    ArrayList<Item> items = new ArrayList<>();

    while(true){
        System.out.println("What did the user buy? ");
        String name = input.nextLine();
        System.out.println ("How many pieces? ");
        int quantity = input.nextInt();
        System.out.println ("How much per unit? ");
        double price = input.nextDouble();
        input.nextLine();
        items.add(new Item(name,quantity,price));
        System.out.println("Add more items");
        String moreItems = input.nextLine();
        if (!moreItems.equalsIgnoreCase("yes")) {
            break;
            }      
        }

        return items;

        }

    public static double[]
    calculateTotals(ArrayList<Item> items){
        double subtotal = 0;
        for(Item item: items){
            subtotal += item.total;

    }

        double discount = subtotal * 0.08;
        double vat = subtotal * 0.075;
        double billTotal = subtotal - discount + vat;
        return new double []{subtotal, discount, vat, billTotal};

    }
        public static void printReceipt(String customer, String cashier,
        ArrayList<Item>items,
        double subtotal, double discount, double vat, double billTotal, double paid ){
        double balance = paid - billTotal;
        
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd- MMM - yyyy hh:mm:ss a");
        String dateTime = now.format(formatter);
        
        System.out.println("\nSEMICOLON STORES");
        System.out.println("Date: " + dateTime);
        System.out.println("Customer Name: "+ customer);
        System.out.println("Cashier: "+ cashier);
        System.out.println("ITEM\tQUANTITY\tPRICE\tTOTAL");
        for(Item item : items){
            System.out.println(item.name + "/t" + item.quantity + "\t" + item.price + "\t" + item.total);
}
 
        System.out.println("sub Total: " + subtotal);
        System.out.println("Discount: " + discount);
        System.out.println("VAT (7.5%): " + vat);
        System.out.println("Bill Total : " + billTotal);
        System.out.println("Amount Paid: " + paid);
        System.out.println("Balance: " + balance);
        System.out.println("THANK YOU FOR YOUR PATRONAGE");


}
}




//List<Map<String, Object>book = new ArrayList<>();


//Map<String, Object>book = new LinkedHashMap<>();



