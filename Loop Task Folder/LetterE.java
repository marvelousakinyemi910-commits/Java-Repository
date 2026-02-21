import java.util.Scanner;
public class LetterE{
   public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a word that contains e: ");
    String word = input.nextLine();
        int counter = 0;
    for (int count = 0; count < word.length(); count++){
        if(word.charAt(count) == 'e')
            counter++;
   

}
   System.out.printf("The number 'e' appeared in the %s %d times%n",word, counter);
  
    
}

}


