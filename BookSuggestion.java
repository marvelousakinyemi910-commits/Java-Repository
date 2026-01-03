import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class BookSuggestion{
    static ArrayList<String> books = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[]args){
    initialiseBooks();
    runApp();

    }
    static void initialiseBooks(){
    books.add("Independence");
    books.add("7 habits of highly Effective people");
    books.add("Nearly all the men in  Lagos are mad");
    books.add("Men are from Mars, Women are from Venus");
    books.add("Atomic habits");
    books.add("Last days at Forcados high School");
}

    static void runApp(){
        while (true){
            bookSuggestionMenu();
            int option = getUserOption();
        switch(option){
            case 1 -> getSuggestion();
            case 2 -> addBook();
            case 3 -> removeBook();
            case 4 -> updateBook();
            case 5 -> showBooks();
            case 6 -> exitApp();
            default -> System.out.println("Invalid Option");
            


            }





    }

}


    static void bookSuggestionMenu(){
        System.out.println("\nWelcome to the Book Suggestion System!");
        System.out.println("1. Get Suggestions");
        System.out.println("2. Add Book");
        System.out.println("3. Remove Book");
        System.out.println("4. Update Book");
        System.out.println("5. Show all Books");
        System.out.println("6. Exit");


    }

    static int getUserOption(){
    System.out.println("Enter an operation: ");
    int option = input.nextInt();
    input.nextLine();
    return option;


}

    static void getSuggestion(){
    String again;
    
    do{
        String book = books.get(random.nextInt(books.size()));
        int page = random.nextInt(100) + 1;
        System.out.println("\nBook for the Day: ");
        System.out.println("Book Title: "+ book);
        System.out.println("Page: "+ page);
        
        System.out.println("Would you like another suggestion?(yes/no)");
        again = input.nextLine();

        } while
 (again.equalsIgnoreCase("yes"));
            }
    
    static void addBook(){
    System.out.println("Enter book title to add: ");
    String book = input.nextLine();
    if (books.contains(book)){
        System.out.println("Book already exist!");
    }
    else{
        books.add(book);
        System.out.print("Book added successfully!");
    }

       

}
    static void removeBook()  {
    System.out.print("Enter Book title to be removed");
    String book = input.nextLine();
    if(books.contains(book)){
        books.remove(book);
        System.out.println("Book removed successfully!");

        } else{
            System.out.println("Book not found!");

        }

    }
    static void updateBook(){
    System.out.print("Enter book title to update: ");
    String oldBook = input.nextLine();
    if(books.contains(oldBook)){
        System.out.print("Enter new book title: ");
        String newBook = input.nextLine();
        books.set(books.indexOf(oldBook),newBook);
        System.out.println("Book successfully updated!");
        }
    else{
        System.out.println("Book does not exist!");
            }
    }
    static void showBooks() {
    System.out.println("\nAvailable Books: ");
    for (String book:books){
        System.out.println("-"+ book);   


            }

    }
    static void exitApp(){
    System.out.println("Bye");
    System.exit(0);

        }



}






