import java.util.Scanner;
public class UpperCase{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a word with  UpperCase: ");
    String word = input.nextLine();
    int count = 0;
for (int counter = 0; counter < word.length(); counter++){
    if (Character.isUpperCase(word.charAt(counter))){

      count++;
}

}
        
    System.out.printf("The number of upper case letters are %d%n",count);



}




}
