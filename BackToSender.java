import java.util.Scanner;
public class BackToSender{
    private static Scanner input = new Scanner(System.in);
    private static boolean riding = true;
    public static void main(String[] args){
 String menu = """

_____________________________________________
|Collection Rate| Amount Per Parcel |Base Pay|
|_______________|___________________|________|
|Less than 50%  | 160               |5,000   |
|_______________|___________________|________|
|50 - 59%       | 200               |5,000   |
|_______________|___________________|________|
|60 - 69%       | 250               |5,000   |
|_______________|___________________|________|
|>=70%          | 500               |5,000   |
|_______________|___________________|________|

""";
    
    System.out.println(menu);
   while (riding){
    System.out.println("Enter the number of successful delivery: ");
    int numberOfSucessfulDelivery = input.nextInt();
    input.nextLine();
    if (numberOfSucessfulDelivery>100 || numberOfSucessfulDelivery<0){
        System.out.println("invalid number of delivery");
        continue;
    }
    System.out.printf("The rider's wage is %d%n",riderWages(numberOfSucessfulDelivery));

    while (riding){
        System.out.print("Do you want to continue? ");
        String askAgain = input.nextLine();

     if(askAgain.equalsIgnoreCase("yes")){
        break;
     }else if(askAgain.equalsIgnoreCase("no")){
        System.out.print("Thank you for using the application.. ");
        riding=false;
        break;
    }else{
          System.out.print("Invalid input... ");
          continue;
        }
    }
 }   
 }   

    public static int riderWages(int numberOfSucessfulDelivery){
        int amountPerParcel = 0;
        int basePay = 5000;
            

  
    if(numberOfSucessfulDelivery >= 70){
        amountPerParcel = 500;
           
    }
    else if(numberOfSucessfulDelivery < 70 && numberOfSucessfulDelivery > 60){
        amountPerParcel = 250;
            
    }
    else if (numberOfSucessfulDelivery < 60 && numberOfSucessfulDelivery > 50){
        amountPerParcel = 200;

    }
    else if( numberOfSucessfulDelivery < 50){
        amountPerParcel = 160;
}
    else{
        System.out.println("Invalid number of successful delivery!");

}
    int wages = numberOfSucessfulDelivery * amountPerParcel + basePay;
    return wages;
    
    
}
    

    
}














