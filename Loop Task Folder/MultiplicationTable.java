import java.util.Scanner;
public class MultiplicationTable{
   public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int multiplier = input.nextInt();

    for (int count = 1; count <= 12; count++){

    System.out.printf("%d X %d = %d%n",multiplier, count , multiplier*count);


}
    
}

}


