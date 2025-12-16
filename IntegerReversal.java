import java.util.Scanner;
public class IntegerReversal{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter set of digits :");

        int digit = input.nextInt();
            System.out.printf("The reverse of (%d) is %d%n",digit, reverse(digit));

}


public static int reverse(int digit){
    int reversed = 0;
    while (digit != 0){

        int number = digit%10;
        reversed = reversed * 10 + number;
        digit = digit /10;


        }
  return reversed;    
}


}
