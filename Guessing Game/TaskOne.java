import java.util.Random;
public class TaskOne{
   public static void main (String[]args){
    Random random = new Random();
for(int counter = 1; counter<=10; counter++) {
   
    int number = random.nextInt(10) + 1;


    System.out.printf("%d%n",number);
}
}

}
