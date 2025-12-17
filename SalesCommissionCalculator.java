import java.util.Scanner;
public class SalesCommissionCalculator{
    public static void main(String[]args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter number of items sold for the week: ");
    int item = input.nextInt();
    int counter = 0;
    double totalPrice = 0;
    
    while(counter < item){
    System.out.println("Enter price of item: ");

    double price = input.nextDouble();
    totalPrice += price;
    counter++;


        }



    double commission = 200 + (0.09*totalPrice);

    System.out.printf("The salespersons earning on %d items is $%.2f%n ",counter,commission);

}





}
