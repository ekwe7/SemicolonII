

import java.util.Scanner;

public class NokiaPhone3310{
static Scanner input = new Scanner(System.in);

public static void main(String... ekwe){

int userChoice;
do{
System.out.println("""
======= WELCOME NOKIA ========
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

/// phone Menu
public static void phoneMenu() {
int userChoice;
do{
System.out.println("""
======== PHONE MENU =======
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
	case 3 -> chat();
	case 4 -> callRegister();
	case 5 -> tone();
	case 6 -> phoneSetting();
	case 7 -> callDivert();
	case 8 -> game();
	case 9 -> calculator();
	case 10 -> reminder();
	case 11 -> clock();
	case 12 -> profile();
	case 13 -> simService();
	case 0 -> System.out.println("Returning to main menu...");
	default -> System.out.println("Invalid choice.");
	}
   } while (userChoice != 0);
}

//============ PHONEBOOK MENU ============
public static void phoneBook() {
int phoneBookChoice;

	do{
 	System.out.println("""
========= PHONEBOOK ==========
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
}//phoneBook


//Simple MEthod for printing
private static void subMenu(String title) {
        int userChoice;
        do {
            System.out.println(title + " \n0. Back");
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
		case 1 -> setMessageSetting();
		case 2 -> commonMessageSetting();
		case 0 -> System.out.println("Returning to Phone Menu...");
		default -> System.out.println("Invalid choice.");

	
	}
   }while(messageOption != 0);
}//messageOption

public static void setMessageSetting(){
	int userSet;
	
	do{
	System.out.println("""
		========Set 1=========
		1. Message Center Number
		2. Message sent As
		3. Message Validity
		case 0 -> System.out.println("Returning to Phone Menu...");
		default -> System.out.println("Invalid choice.");

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

public static void commonMessageSetting(){
int userCommon;

do{
System.out.println("""
	=======COMMON=======
	1. Delivery reports
	2. Reply via same center
	3. Character Support
	case 0 -> System.out.println("Returning to Phone Menu...");
	default -> System.out.println("Invalid choice.");

	""");
System.out.println("Select from options: ");
	userCommon = input.nextInt();
	
	switch(userCommon){
	case 1 -> subMenu("DELIVERY REPORTS");
	case 2 -> subMenu("REPLY VIA SAME CENTRE");
	case 3 -> subMenu("CHARACTER SUPPORT");
	}
  }while(userCommon != 0);

}//commonMessageSetting


//Chat
public static void chat(){
	int userChat;
do{
System.out.println("""
	======CHAT=====
	1. Chat
	case 0 -> BAck;
	default -> Invalid choice;

	""");
	System.out.println("Select from Option: ");
	userChat = input.nextInt();
	
	switch(userChat){
	case 1 -> subMenu("CHAT");
	
	}
	
}while(userChat != 0);

}


//call reigister
public static void callRegister(){
int userCallReg;
do{
System.out.println("""
	====== CALL REGISTER=======
	1. Missed Calls
	2. Receiveed calls 
	3. Dialled Numbers
	4. Erase redcent Call Lists
	5. Show CAll Duration
	6. Show Call Costs
	7. CAll Cost SEttings
	8. Prepaid Credit
	case 0 -> Back;
	default -> Invalid choice;


""");
System.out.println("Select from Options Above: ");
userCallReg = input.nextInt();

switch(userCallReg){
	case 1 -> subMenu("MISSED CALLS");
	case 2 -> subMenu("RECEIVED CALLS");
	case 3 -> subMenu("DIALLED NUMBERS");
	case 4 -> subMenu("ERASE RECENT CALL LISTS");
	case 5 -> showCallDuration();
	case 6 -> showCallCost();
	case 7 -> callCostSetting();
	case 8 -> subMenu("PREPAID CREDIT");
  }
}while (userCallReg != 0);


}//callRegister

public static void showCallDuration(){
int showCallDuration;
do{
System.out.println("""
========= SHOW CALL DURATION ========
	1. Las Call Duration
	2. All CAlls Duration
	3. Received Calls Duration
	4. Dialled calss Duration
	5. Clear Timers
	case 0 -> Back;
	default -> Invalid choice;


""");
System.out.println("Selection from options above: ");
showCallDuration = input.nextInt();

switch(showCallDuration){
	case 1 -> subMenu("LAST CALL DURATION");
	case 2 -> subMenu("ALL CALLS DURATION");
	case 3 -> subMenu("RECEIVED CALLS DURATION");
	case 4 -> subMenu("CLEAR TIMERS");

	}
}while(showCallDuration != 0);

}//showCallDuration

public static void showCallCost(){
int showCallCost;
do{
System.out.println("""

========= SHOW CALL COST ==========
	1. Last CAll Cost
	2. All Calls Cost
	3. Clear Counters
	case 0 -> Back;
	default -> Invalid choice;

""");
System.out.println("Select from above: ");
showCallCost = input.nextInt();

switch(showCallCost){
	case 1 -> subMenu("LAST CALL COST");
	case 2 -> subMenu("ALL CALLS COST");
	case 3 -> subMenu("CLEAR COUNTER");
	}
   }while(showCallCost != 0);
}

public static void callCostSetting(){
int callCostSetting;
do{
System.out.println("""

======== CALL COST SETTINGS =======
	1. Call Cost Limit
	2. Show Costs In
	case 0 -> Back;
	default -> Invalid choice;

""");
System.out.println("Select from option above: ");
	callCostSetting = input.nextInt();
	
	switch(callCostSetting){
	case 1 -> subMenu("CALL COST LIMIT");
	case 2 -> subMenu("SHOW COSTS IN");
	}
}while(callCostSetting != 0);

}

//Ringing Tone
public static void tone(){
int userTone;

do
  {
	System.out.println("""
	
======== RINGING TONES ======
	1. Ringing Tone
	2. Ringing Volume
	3. Incoming Call Alert
	4. Composer
	5. Message Alart Tone
	6. Keypad tones
	7. Warning and Game tones
	8. Vibrating alart
	9. Screen Saver
	case 0 -> Back
	default -> Invalid choice

	
	""");
System.out.println("Choose from option above: ");
	userTone = input.nextInt();
	
	switch(userTone){
		case 1 -> subMenu("Ringing Tone");
		case 2 -> subMenu("Ringing Volume");
		case 3 -> subMenu("Incoming Call Alaert");
		case 4 -> subMenu("Composer");
		case 5 -> subMenu("Message Alert Tone");
		case 6 -> subMenu("Keypad Tones");
		case 7 -> subMenu("Warning And Game Tones");
		case 8 -> subMenu("Vibrating Alert");
		case 9 -> subMenu("Screen Server");
	}
	
  }while(userTone != 0);

}//tone

//settings
public static void phoneSetting(){
 int setting;
 
 do 
 	{
 	System.out.println("""
 	
 ======== PHONE SETTING ===========
 	
 	1. Call Settings
 	2. Phone Settings
 	3. Security Settings
 	4. Restore FActory settings
 	case 0 -> Back
 	default -> Invalid Choice
 	""");
 	System.out.println("Select from above: ");
 	setting = input.nextInt();
 	
 	switch(setting){
 	case 1 -> callSetting();
 	case 2 -> infoSetting();
 	case 3 -> SecuritySetting();
 	case 4 ->subMenu("Restore Factory Settings");
 	}
   }while(setting != 0);

}//phoneSetting


public static void callSetting(){
int userCallSetting;

do
  {
  System.out.println("""
  =======USER CALL SETTINGS ==========
  
  1. Automatic Redial
  2. Speed Dialling
  3. Call Waiting Options
  4. Own Number sending
  5. Phone Line In Use
  6. Automatic Answer
  case 0 -> Back
  default -> Invalid choice

  
  """);
  System.out.println("ENter a Number: ");
  userCallSetting = input.nextInt();
  
  switch(userCallSetting){
  	case 1 -> subMenu("Automatic Redial");
  	case 2 -> subMenu("Speed Dialling");
  	case 3 -> subMenu("Call Waiting Options");
  	case 4 -> subMenu("Own Number Sending");
  	case 5 -> subMenu("Phone Line In Use");
  	case 6 -> subMenu("Automatic Answer");

  	}
  }while(userCallSetting != 0);

}

public static void infoSetting(){
int userphoneSeeting;

do{
System.out.println("""
========= PHONE SETTING ==========

	1. Language
	2. Call Info Display
	3. Welcome Note
	4. Network Selection
	5. Lights
	6. Confirm SIM Service Actions
	case 0 -> Back
	default -> Invalid choice
	
	""");
	System.out.println("Enter a number: ");
	userphoneSeeting = input.nextInt();
	
	switch(userphoneSeeting){
	case 1 -> subMenu("Language");
	case 2 -> subMenu("Call Info Display");
	case 3 -> subMenu("Welcome Note");
	case 4 -> subMenu("Network Selection");
	case 5 -> subMenu("Lights");
	case 6 -> subMenu("Confirm SIM Service Actions");
	}
  }while (userphoneSeeting != 0);

}

public static void SecuritySetting(){
int userSecurity;
do{
	System.out.println("""
	
========== SECURITY SETTINGS ============
	1. Pin Code Request
	2. Call BArring Service
	3. Fixed Dialling 
	4. Closed User Group
	5. Phone Security
	6. Change Access Codes
	case 0 -> Back
	default -> Invalid choice

	""");
	System.out.println("Enter a number: ");
	userSecurity = input.nextInt();
	
	switch (userSecurity){
		case 1 -> subMenu("Pin Code Request");
		case 2 -> subMenu("Call BArring Service");
		case 3 -> subMenu("Fixed Dialling");
		case 4 -> subMenu("Closed User Group");
		case 5 -> subMenu("Phone Security");
		case 6 -> subMenu("Change Access Codes");
	}
}while(userSecurity != 0);

}

// Call Divert
public static void callDivert(){
	int callDivert;
do{
System.out.println("""
====== CALL DIVERT =====

	1. info Service
	case 0 -> Back
	default -> Invalid choice

	
	""");
	System.out.println("Select from Option: ");
	callDivert= input.nextInt();
	
	switch(callDivert){
	case 1 -> subMenu("call Divert");
	
	}
	
}while(callDivert != 0);

}


//game
public static void game(){
	int userGame;
do{
System.out.println("""
	====== GAME =====
	1. Game
	case 0 -> Back
	default -> Invalid choice

	
	""");
	System.out.println("Select from Option: ");
	userGame= input.nextInt();
	
	switch(userGame){
	case 1 -> subMenu("Voice MailBox Number");
	
	}
	
}while(userGame != 0);

}

//CalCulator
public static void calculator(){
	int userCalculator;
do{
System.out.println("""
	====== CALCULATOR =====
	1. Calculator
	case 0 -> Back
	default -> Invalid choice

	
	""");
	System.out.println("Select from Option: ");
	userCalculator= input.nextInt();
	
	switch(userCalculator){
	case 1 -> subMenu("Calculator");
	
	}
	
}while(userCalculator!= 0);

}


//Reminders
public static void reminder(){
	int userReminder;
do{
System.out.println("""
	====== REMINDER =====
	1. Calculator
	case 0 -> Back
	
	""");
	System.out.println("Select from Option: ");
	userReminder= input.nextInt();
	
	switch(userReminder){
	case 1 -> subMenu("Reminder");
	
	}
	
}while(userReminder!= 0);

}


//Clock
public static void clock(){
	int userClock;
do{
System.out.println("""
	====== CLOCK =====
	1. Alarm clock
	2. Clock Settings
	3. Date Settings
	4. Stopwatch
	5. Countdown timer
	6. Auto update of date and time
	case 0 -> Back
	
	""");
	System.out.println("Select from Option: ");
	userClock= input.nextInt();
	
	switch(userClock){
	case 1 -> subMenu("Alarm clock");
	case 2 -> subMenu("Clock Settings");
	case 3 -> subMenu("Date Settings");
	case 4 -> subMenu("Stopwatch");
	case 5 -> subMenu("Countdown timer");
	case 6 -> subMenu("Auto update of date and time");
	
	}
	
}while(userClock != 0);

}


//Profiles
public static void profile(){
	int userProfile;
do{
System.out.println("""
	====== PROFILE =====
	1. Profile
	case 0 -> Back
	
	""");
	System.out.println("Select from Option: ");
	userProfile= input.nextInt();
	
	switch(userProfile){
	case 1 -> subMenu("Profile");
	
	}
}while(userProfile != 0);

}

//Sim service
public static void simService(){
	int userSimService;
do{
System.out.println("""
	====== SIM SERVICE =====
	1. Sim Service
	case 0 -> Back
	
	""");
	System.out.println("Select from Option: ");
	userSimService= input.nextInt();
	
	switch(userSimService){
	case 1 -> subMenu("Sim Service");
	
	}
}while(userSimService != 0);

}










   
}