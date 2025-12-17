import java.util.Scanner;
public class TwoLargestNumbers{
    public static void main(String[]args){
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int largest = input.nextInt();
    int secondLargest = largest;
        
    for ( int counter= 2; counter<=10; counter++){
        System.out.println("Enter number: ");
        int number = input.nextInt();
        
        if (number > largest){
            secondLargest = largest;
            largest = number;
         }   
        else if (number < largest && number> secondLargest ){

          secondLargest = number;


    }

            




        }
    System.out.printf("Largest number  is %d%n", largest);
    System.out.printf("Second Largest number is %d%n",secondLargest);


}



}
