import java.util.Scanner;
public class NokiaPhone{ // class open

public static void main(String... args){ // method open 

Scanner input = new Scanner(System.in);

String menu = """

    List of menu:
1.  Phonebook
2.  Messages 
3.  Chat
4.  Call register
5.  Tones
6.  Settings
7.  Call divert
8.  Games
9.  Calculator
10. Reminders
11. Clock
12. Profiles
13. SIM services
  
          """;
System.out.println(menu);
System.out.println("Enter option");
int option = input.nextInt();

   switch(option ) { 
    case 1-> { 
  String menu1 = """
   Phonebook
 
1. Search
2. Service Nos
3. Add name
4. Erase
5. Edit
6. Assign tone
7. Send b'card
8. Options
9. Speed dials
10. Voice tags
""";

System.out.println(menu1);
System.out.println("Enter option");
 int option1 = input.nextInt();
    switch(option1){ 
    case 1 -> {System.out.println("Search");}
    case 2 -> {System.out.println("Service Nos");}
    case 3 -> {System.out.println("Add Names");}
    case 4 -> {System.out.println("Erase");}
    case 5 -> {System.out.println("Edit");}
    case 6 -> {System.out.println("Assign tone");}
    case 7 -> {System.out.println("Send b'card");}
    case 8 -> { //6
    String menu12 = """

       Options
1.Type of view
2. Memory status
""";

System.out.println(menu12);
System.out.println("Enter option");
int option12 = input.nextInt();
switch(option12){ //7
    case 1 -> {System.out.println("Type of view");}
    case 2 -> {System.out.println("Memory status");}


    case 9 -> {System.out.println("Speed dials");}
    case 10 -> {System.out.println("Voice tags");}
    default -> {System.out.println("Enter valid number");}

    } 
}
}
}
}


System.out.println(menu);
System.out.println("Enter option");
int option2 = input.nextInt();

switch(option2) { 
case 2 -> { 

     String menu2 =""" 

Messages
 1. Write Message
 2. Inbox
 3. Outbox
 4. Picture Messages
 5. Template
 6. Smileys
 7. Messages settings
 8. Info Service
 9. Voice mailbox number
 10. Service command editor
                            """;



System.out.println(menu2);
System.out.println("Enter option");
int option21 = input.nextInt();
switch (option21){

    case 1 -> {System.out.println("Write Message");}
    case 2 -> {System.out.println("Inbox");}
    case 3 -> {System.out.println("Outbox");}
    case 4 -> {System.out.println("Picture Messages");}
    case 5 -> {System.out.println("Template");}
    case 6 -> {System.out.println("Smileys");}
    case 7 -> {  

        String menu22 ="""
    
        Message settings
        1. set 1
        2. common 3
       
        """;     
}       
} 
}
}


}// class close

} // method close
























