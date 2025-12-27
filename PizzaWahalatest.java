import java.util.Scanner;
public class PizzaWahalatest{

 public static void main (String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number of people: ");
    int people = input.nextInt();
    input.nextLine();
    System.out.println("Enter pizza type: ");
    String pizzaType = input.nextLine();

    System.out.println(PizzaWahala.pizzaWahala(people,pizzaType));
    }   
} 
