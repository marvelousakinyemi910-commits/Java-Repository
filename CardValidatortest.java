import java.util.Scanner;
public class CardValidatortest {

    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter card number: ");
    String number = input.nextLine();
    
   
    CardValidator.cardType(number);
    CardValidator.cardNumberLength(number);
    CardValidator.cardValidityStatus(number);
    CardValidator.cardNumber(number);


        

    }
}
