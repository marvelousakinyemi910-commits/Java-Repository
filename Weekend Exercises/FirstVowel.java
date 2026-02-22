import java.util.Scanner;
public class FirstVowel{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a word containing a vowel: ");
    String word = input.nextLine();
    
for (int counter = 0; counter < word.length(); counter++){
    char letter = (Character.toLowerCase(word.charAt(counter)));
    if(letter == 'a' || letter == 'e' || letter == 'o' || letter == 'i' || letter == 'u'){
        System.out.printf("The position of the First vowel is %d%n",counter);
            break;

}
     
}

}
        
    


}





