import java.util.Scanner;
public class GasMileage{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
       
        
       
        
       
        System.out.println("Enter number of trip: ");

        int trip = input.nextInt();

         int counter = 1;
         int sumOfMilesPerGallon = 0;
        
    while (counter<= trip){
    
    System.out.println("Enter miles driven: ");
    int miles = input.nextInt();
    
    System.out.println("Enter gallons used :");
    int gallons = input.nextInt();
    
    double milesPerGallons = (double)miles/gallons;
    System.out.printf("The miles per gallon for trip %d is %.2f%n,",counter,milesPerGallons);
    sumOfMilesPerGallon += milesPerGallons; 
    counter ++;




}
   

  double averageMilesPerGallon = sumOfMilesPerGallon/trip; 
    System.out.printf("The combined milespergallon for %d trips is %d%n ", trip,sumOfMilesPerGallon);

    System.out.printf("The average miles per gallon for %d trips is %.2f%n",trip,averageMilesPerGallon);

}





}
