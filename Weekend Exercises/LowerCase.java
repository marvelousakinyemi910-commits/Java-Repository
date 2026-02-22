import java.util.Scanner;
public class LowerCase{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a word with  LowerCase: ");
    String word = input.nextLine();
    int count = 0;
for (int counter = 0; counter < word.length(); counter++){
    if (Character.isLowerCase(word.charAt(counter))){

      count++;
}

}
        
    System.out.printf("The number of lower case letters are %d%n",count);



}




}
