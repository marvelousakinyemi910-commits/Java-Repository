import java.util.Scanner;
public class CountVowelAndConsonant{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a word containing a vowel: ");
    String word = input.nextLine();
    int countVowel = 0;
    int countConsonant = 0;
    
for (int counter = 0; counter < word.length(); counter++){
    

    char letter = (Character.toLowerCase(word.charAt(counter)));
    if(letter == 'a' || letter == 'e' || letter == 'o' || letter == 'i' || letter == 'u'){
        countVowel++;
        
}

    

else {
    countConsonant++;   
}
}
    System.out.printf("The number of the vowels in the word are %d%n", countVowel);
    System.out.printf("The number of the consonants in the word are %d%n", countConsonant);
}
}
