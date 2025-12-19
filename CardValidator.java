
public class CardValidator{

public static void cardNumberLength(String number){
    int numberLength = number.length();

    if (numberLength <13 && numberLength>16){
    System.out.print("Credit card digit length is : invalid");

}

    for (int counter = 0; counter<=numberLength; counter++){

    if(Character.isDigit(number.charAt(counter))){
    
    System.out.printf("Credit card digit length is : %d%n",numberLength);
    break;
   }
     else{
    
    System.out.print("Credit card digit length is : Invalid");
        }


}
  


}
 public static void cardType(String number){

    if (number.startsWith("4")){
    System.out.println("Credit Card Type: Visa card");
}
    else if (number.startsWith("5")){
    System.out.println("Credit Card Type: Mastercard");
}

    else if (number.startsWith("37")){
    System.out.println("Credit Card Type: American Express Cards");

}
        
    else if (number.startsWith("6")){
    System.out.println("Credit Card Type: Discover card");
}
    else {
    System.out.println("Credit Card Type: Invalid Card");
    }    


}

public static void cardValidityStatus (String number){
   int sumEven =0;
   int sumOdd = 0;
   int numberLength = number.length();
    for(int count = 1; count <= numberLength;count++){

    int value = Character.getNumericValue(number.charAt(numberLength-count));
     if (count % 2 == 0){
        value = value*2;

        if (value>9){
        sumEven += (value-9);
        }
        else{  
        sumEven += value;
         }     


   } else {

        sumOdd += value;
    }

}

int total = sumOdd + sumEven;
    if (total%10 == 0){
    System.out.println("Credit Card Validity Status: Valid");

    }
    else{
    System.out.println("Credit Card Validity Status: Invalid");

    }

  } 


 public static void  cardNumber(String number){
    System.out.printf("Credit card number: %s%n",number);


        }




   


 }   












