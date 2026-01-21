import java.util.ArrayList;
import java.util.Scanner;
public class TransactionLogApp{
    static Scanner input = new Scanner(System.in);
    static double balance = 0.0;
    static ArrayList<String> transactions = new ArrayList<>();
    
    public static void main(String[]args){
    

   
    int choice;
    
    System.out.println("Welcome to Transaction Log App");
     while (true){
        showMenu();
        choice = input.nextInt();
        if (choice == 1){
    balance = deposit(balance);
    }
        else if (choice == 2){
        balance = withdraw(balance);
    }
        else if (choice == 3){
        showTransactions();
    }
        else if (choice == 4){
        System.out.printf("%nFinal Balance: $%.2f%n", balance);
        System.out.println("Thank you for using Transaction Log App!");
        break;
    }
        else{
            System.out.println("Invalid choice");
            
}
   
   
}
        }

    static void showMenu(){
        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.Show Transactions");
        System.out.println("4.Exit");
        System.out.print("Enter your choice : ");
    }






        

    

    static double deposit(double balance){  

        System.out.println("Enter deposit amount: ");
       double amount = input.nextDouble();
        
        if(amount <= 0 ){
            System.out.println("Amount cannot be negative or zero");
            return balance ;
            }
            balance += amount;
        String record = String.format(
        "Deposited: $%.2f| New Balance : $%.2f", amount, balance
     
            );
        transactions.add(record);
        System.out.println(record);
            return balance ;
        }
         


    static double withdraw(double balance){
    

        

        System.out.print("Enter an amount to be withdrawn: "); 
         double amount = input.nextDouble();
        
        if(amount > balance)  {
            System.out.println("Insufficient funds");
            return balance;
        }
        if (amount <= 0){

           System.out.println("Amount can not be negative");
            return balance;
    }
        balance -= amount;
        String record = String.format(
        "Withdrew:$%.2f | New Balance: $%.2f", amount,balance

    );
        transactions.add(record);
        System.out.println(record);
    
        return balance;
    }
      
    static void showTransactions(){
        if(transactions.isEmpty()) {
        System.out.println("\nNo transactions yet.");
        return;

            }

        System.out.println("\nTransactions so far: ");
            for (int count = 0; count < transactions.size(); count++){
            System.out.println((count +1) + "." + transactions.get(count));

            }



    
    }

}


            



