

import java.util.Scanner;

public class NokiaPhone2{
static Scanner input = new Scanner(System.in);

public static void main(String[] args){

int userChoice;
do{
System.out.println("""
	=== WELCOME NOKIA ===
	1. Nokia Menu
	0. Exit
	""");
System.out.print("Enter choice: ");
userChoice = input.nextInt();

	switch (userChoice) {
	case 1 -> phoneMenu();
	case 0 -> System.out.println("Goodbye! Nokia");
	default -> System.out.println("Invalid choice.");
	}
   } while(userChoice != 0);
}

    // ================= PHONE MENU =================
    public static void phoneMenu() {
        int userChoice;
        do {
            System.out.println("""
                    === PHONE MENU ===
                    1. Phone Book
                    2. Messages
                    3. Chat
                    4. Call Register
                    5. Tones
                    6. Settings
                    7. Call Divert
                    8. Games
                    9. Calculator
                    10. Reminder
                    11. Clock
                    12. Profiles
                    13. Sim Services
                    0. Back
                    """);
            System.out.print("Enter choice: ");
            userChoice = input.nextInt();

            switch (userChoice) {
                case 1 -> phoneBook();
                case 2 -> messageMenu();
                case 3 -> System.out.println("Chat menu (not implemented).");
                case 4 -> System.out.println("Call Register menu (not implemented).");
                case 5 -> System.out.println("Tones menu (not implemented).");
                case 6 -> System.out.println("Settings menu (not implemented).");
                case 7 -> System.out.println("Call Divert menu (not implemented).");
                case 8 -> System.out.println("Games menu (not implemented).");
                case 9 -> System.out.println("Calculator menu (not implemented).");
                case 10 -> System.out.println("Reminder menu (not implemented).");
                case 11 -> System.out.println("Clock menu (not implemented).");
                case 12 -> System.out.println("Profiles menu (not implemented).");
                case 13 -> System.out.println("Sim Services menu (not implemented).");
                case 0 -> System.out.println("Returning to main menu...");
                default -> System.out.println("Invalid choice.");
            }
        } while (userChoice != 0);
    }

    // ================= PHONEBOOK MENU =================
    public static void phoneBook() {
        int phoneBookChoice;
        do {
            System.out.println("""
                    === PHONEBOOK ===
                    1. Search
                    2. Service Nos.
                    3. Add name
                    4. Erase
                    5. Edit
                    6. Assign tone
                    7. Send b'card
                    8. Options
                    9. Speed dials
                    10. Voice tags
                    0. Back
                    """);
            System.out.print("Enter choice: ");
            phoneBookChoice = input.nextInt();

            switch (phoneBookChoice){
                case 1 -> subMenu("SEARCH");
                case 2 -> subMenu("SERVICE NOS");
                case 3 -> subMenu("ADD NAME");
                case 4 -> subMenu("ERASE");
                case 5 -> subMenu("EDIT");
                case 6 -> subMenu("ASSIGN TONE");
                case 7 -> subMenu("SEND B'CARD");
                case 8 -> optionsMenu();
                case 9 -> subMenu("SPEED DIALS");
                case 10 -> subMenu("VOICE TAGS");
                case 0 -> System.out.println("Returning to Phone Menu...");
                default -> System.out.println("Invalid choice.");
            }
        } while (phoneBookChoice != 0);
    }

    // Simple placeholder for sub-menus with just a Back option
    private static void subMenu(String title) {
        int userChoice;
        do {
            System.out.println("=== " + title + " ===\n0. Back");
            userChoice = input.nextInt();
        } while (userChoice != 0);
    }

    // Options submenu inside PhoneBook
    private static void optionsMenu(){
        int userOption;
        do {
            System.out.println("""
                    === OPTIONS ===
                    1. Type of view
                    2. Memory status
                    0. Back
                    """);
            userOption = input.nextInt();
            switch (userOption){
                case 1 -> subMenu("TYPE OF VIEW");
                case 2 -> subMenu("MEMORY STATUS");
                case 0 -> System.out.println("Returning to PhoneBook...");
                default -> System.out.println("Invalid choice.");
            }
        }while (userOption != 0);
    }

//============ MESSAGES ================
public static void messageMenu(){
int messageMenuChoice;

do{
System.out.println("""
========= MESSAGE MENU ========
	1. Write Message
	2. Inbox
	3. OutBox
	4. Picture Messages
	5. Templates
	6. Snileys
	7. Message Settings
	8. Info service
	9. Voice MailBox Number
	10. Service Command Editor
	0. Back

""");
System.out.println("Select Choice: ");
messageMenuChoice = input.nextInt();

switch(messageMenuChoice){
	case 1 -> subMenu("WRITE MESSAGES");
	case 2 -> subMenu("INBOX");
	case 3 -> subMenu("OUTBOX");
	case 4 -> subMenu("PICTURE MESSAGES");
	case 5 -> subMenu("TEMPLATES");
	case 6 -> subMenu("SMILEYS");
	case 7 -> messageOptionMenu();
	case 8 -> subMenu("INFO SERVICE");
	case 9 -> subMenu("VOICE MAIL NUMBER");
	case 10 -> subMenu("SERVICE COMMAND EDITOR");
	case 0 -> System.out.println("Returning to Phone Menu...");
	default -> System.out.println("Invalid choice.");

	}

  }while(messageMenuChoice != 0);

}//messageMenu
  
public static void messageOptionMenu(){
	int messageOption;
	
	do{
	System.out.println("""
		==========MESSAGE SETTINGS==========
		1. Set 1
		2. Common
		0. Back
	""");
	System.out.println("Select from Options: ");
	messageOption = input.nextInt();
	
	switch(messageOption){
		case 1 -> subMenu("SET 1");
		case 2 -> subMenu("COMMON");
		case 0 -> System.out.println("Returning to Phone Menu...");
		default -> System.out.println("Invalid choice.");

	
	}
   }while(messageOption != 0);
}//messageOption

public static void set1(){
	int userSet;
	
	do{
	System.out.println("""
		========Set 1=========
		1. Message Center Number
		2. Message sent As
		3. Message Validity
		""");
	System.out.println("ENter onption: ");
	userSet = input.nextInt();
	
	switch(userSet){
		case 1 -> subMenu("MESSAGE CENTRE NUMBER");
		case 2 -> subMenu("MESSAGE SENT AS");
		case 3 -> subMenu("MESSAGE VALIDITY");
		}
	}while(userSet != 0);
}//int userSet;


   
}