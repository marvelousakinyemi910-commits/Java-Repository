
import java.util.Scanner;
public class RectangleArea{
public static void main(String...args){
Scanner input=new Scanner(System.in);

System.out.println("Enter rectangle length:");
int length=input.nextInt();
System.out.println("Enter rectangle width :");
int width=input.nextInt();
int area=length*width;
System.out.println("Rectangle area: " + area);

}



}
