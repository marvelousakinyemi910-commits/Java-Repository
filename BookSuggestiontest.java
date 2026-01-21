import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class BookSuggestiontest{
    static ArrayList<String> books = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[]args){
    initialiseBooks(book);
    runApp(book);
    System.out.println("Enter an operation: ");
    int option = input.nextInt();
    input.nextLine();

   


    BookSuggestion.runApp(book);
    BookSuggestion.initialiseBooks(book);
    BookSuggestion.bookSuggestionMenu(book);
    BookSuggestion.getSuggestion(book);
    BookSuggestion.addBook(book);
    BookSuggestion.removeBook(book);
    BookSuggestion.updateBook(book);
    BookSuggestion.showBooks(book);
    BookSuggestion.exitApp(book);
    }



}

