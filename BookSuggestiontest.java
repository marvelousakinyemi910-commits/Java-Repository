import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class BookSuggestiontest{
    static ArrayList<String> books = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[]args){
    initialiseBooks();
    runApp();
    System.out.println("Enter an operation: ");
    int option = input.nextInt();
    input.nextLine();

   


    BookSuggestion.runApp();
    BookSuggestion.initialiseBooks();
    BookSuggestion.bookSuggestionMenu();
    BookSuggestion.getSuggestion();
    BookSuggestion.addBook();
    BookSuggestion.removeBook();
    BookSuggestion.updateBook();
    BookSuggestion.showBooks();
    BookSuggestion.exitApp();
    }



}

