
public class PizzaWahala{
   
    public static String pizzaWahala(int people,String pizzaType){

        pizzaType = pizzaType.toLowerCase();
        
        int numberOfSlices = 0;
        int boxPrice = 0;

  
    if(pizzaType.equals("sapa size")) {
        numberOfSlices = 4;
        boxPrice = 2000;
        }
    else if(pizzaType.equals("small money")){
        numberOfSlices = 6;
        boxPrice = 2400;

        }

    else if(pizzaType.equals("big boys")){
        numberOfSlices = 8;
        boxPrice = 3000;
          }

    else if (pizzaType.equals("odogwu")){
        numberOfSlices = 12;    
        boxPrice = 4200;

        }
    else{
       return "Invalid pizza type";
            }
           
        int boxes = (int) Math.ceil((double)people/numberOfSlices);
        int totalSlices = boxes * numberOfSlices;
        int leftOver = totalSlices - people;
        int totalCost = boxes * boxPrice; 

     return  "Number of boxes to buy = " + boxes +
        "\nLeftover slice afer serving = " + leftOver +
        "\nPrice = N" + totalCost;



}

    }

