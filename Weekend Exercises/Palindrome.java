import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a word: ");
    String word = input.nextLine();
    String reversed = " ";
    for(int count = word.length() -1; count >= 0; count--){
    reversed = reversed + word.charAt(count);
}
    if (word.equals(reversed)) {
     System.out.println("This word is a palindrome");
   }
    else {
     System.out.println("This word is not a palindrome");

}
}
}

