import java.util.Scanner;
public class TaxCalculator{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    
    System.out.println("Enter the number of citizens: ");
    int citizen = input.nextInt();
    input.nextLine();

   
    
    double totalTax = 0;

    for (int counter = 1; counter <= citizen; counter++){
   
        System.out.println("Enter citizen name: ");
        String name = input.nextLine();
        

        System.out.println("Enter citizen earnings:");
        double earnings = input.nextDouble();
        input.nextLine();

    double tax;

        if (earnings <= 30000){
            tax = 0.15*earnings;
            System.out.printf("Tax is $%.2f%n",tax);

            }
        else{
             tax = 0.20*earnings;
            System.out.printf("Tax is $%.2f%n",tax);

}


    totalTax +=tax;



}





}






}
