import java.util.Scanner;
public class ReverseString{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a word: ");
    String word = input.nextLine();
    
    for(int count = word.length()-1; count >= 0; count--){
    System.out.println(word.charAt(count));

}

}
}
