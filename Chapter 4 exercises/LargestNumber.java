import java.util.Scanner;
public class LargestNumber{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter first number: ");
    int largest = input.nextInt();
    
     for (int counter = 2; counter <=10; counter++){

        System.out.println("Enter number: ");
        int number = input.nextInt();
        
        if (number>largest){

            largest = number;
        }



        }   

    System.out.printf("Largest number is %d%n",largest);
}







}
