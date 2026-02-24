import java.util.Scanner;
public class AsciiValue{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a word : ");
    String word = input.nextLine();
    
for (int counter = 0; counter < word.length(); counter++){  
    System.out.println(word.charAt(counter) + ": " + (int)word.charAt(counter));

}
}
}

