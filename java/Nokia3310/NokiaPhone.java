import java.util.Scanner;

public class NokiaPhone{
public static void main(String[] args){

	Scanner phone = new Scanner(System.in);
	System.out.println("KPOKRIKPO PHONE");
	
String menu ="""
	
	1. Phone book
	2. Message
	3. Chat
	4. Call Register
	5. Tones
	6. Settings
	7. Call divert
	8. Games
	9. Calculator
	10. Reminders
	11. Clock
	12. Profiles
	13. SIM services

	""";

	System.out.println(menu);
	int userChoice =phone.nextInt();

//prompt the user for input based on existing options

	switch(userChoice){
		case 1:
	System.out.println("""
	Phone Book:
		1. Search
		2. Service Nos
		3. Add names
		4. Erase
		5. Edit
		6. Assign tone
		7. Send b'card
		8. Options
		9. Speed dial
		10. Voice tags
	""");

	int phonebook = phone.nextInt();
	switch(phonebook){

	case 1:	
		System.out.println("Search");
		break;
	case 2:	
		System.out.println("Service Nos");
		break;
	case 3:	
		System.out.println("Add names");
		break;
	case 4:
		System.out.println("Erase");
		break;
	case 5:
		System.out.println("Edit");
		break;
	case 6:
		System.out.println("Assign tone");
		break;
	case 7:
		System.out.println("Send b'card");
		break;

	case 8:
		System.out.println("""
		Enter Options:
		1. Type of view
		2. Memory status
	""");
	int option = phone.nextInt();
	switch(option){

	case 1:	
		System.out.println("Type of view");
		break;
		
	case 2: 
		System.out.println("Memory status");
		break;
}
	break;	
	case 9: 
		System.out.println("Speed dial");
		break;
	case 10: 
		System.out.println("Voice tags"); 
		break;

}break;


//Here are details about the Phone messsage
	
	case 2:
	System.out.println("""
	Phone Message:
		1. Write message
		2. Inbox
		3. Outbox
		4. Picture message
		5. Templates
		6. Smileys
		7. Message settings
		8. Info service
		9. Voice mailbox number
		10. Service command edit

	""");

//Send messages and edit etc.

	int phoneMessage = phone.nextInt();
	switch(phoneMessage){
	
	case 1:
		System.out.println("Write message");
		break;
	case 2:
		System.out.println("Inbox");
		break;
	case 3:
		System.out.println("Outbox");
		break;
	case 4:
		System.out.println("Picture message");
		break;
	case 5:
		System.out.println("Templates");
		break;
	case 6:
		System.out.println("Smileys");
		break;

//Control message settings options
	case 7:
	System.out.println("""
	Set message settings:
		1. Set 
		2. Common
""");

		int Set = phone.nextInt();
		switch(Set){

//Control message validitary option
	case 1:
		System.out.println("""
		Set 1 settings:
		1. Message center number
		2. Message sent as
		3. Message validity

""");	
//Configure your message settings 
	int SetMessageSettings = phone.nextInt();
	switch(SetMessageSettings){
	case 1:
		System.out.println("Message center number");
		break;
	case 2:
		System.out.println("Message sent as");
		break;
	case 3:
		System.out.println("Message validity");
		break;
	}break;


//Configure your message customer service settings


	case 2:
	System.out.println("""
	Common seetings:
		1. Delivery reports
		2. Reply via same center
		3. Character support

""");
//Control customer Delivery settings
	int deliveryReport = phone.nextInt();
	switch (deliveryReport){
	case 1:
		System.out.println("Delivery report");
	break;
	case 2:
		System.out.println("Reply via same center");
	break;
	case 3:
		System.out.println("Character support");
		break;
}
	
//prompt user for Info service
	case 8:
		System.out.println("Info service");
		break;
	case 9: 
		System.out.println("Voice mailbox number");
		break;
	case 10:
		System.out.println("Service command editor"); 
		break;
}


}break;
//prompt user for Chat Settings
	case 3:
System.out.println("chat");break;


//prompt user for call settings
	case 4:
System.out.println("""
	call register:
		1. Missed calls
		2. Received calls
		3. Dialled numbers
		4. Erase recent call lists
		5. Show call duration
		6. Show call costs
		7. Call cost settings
		8. Prepaid credit

""");

	int callRegister = phone.nextInt();
		switch (callRegister){
	case 1:
		System.out.println("Missed calls");
		break;
	case 2:
		System.out.println("Received calls");
		break;
	case 3:
		System.out.println("Dialled calls");
		break;
	case 4:
		System.out.println("Erase recent call lists");
		break;
	
//prompt user for show call duration
	case 5:
System.out.println("""
	call duration:
		1. last call duration
		2. all call's duration
		3. received calls duration
		4. dialled calls duratiion
		5. clear timers

""");
	int callDuration = phone.nextInt();
		switch (callDuration){
	case 1: 
		System.out.println("last call duration");
		break;
	case 2: 
		System.out.println("All calls duration");
		break;
	case 3: 
		System.out.println("Received calls duration");
		break;
	case 4: 
		System.out.println("Dialled calls duration");
		break;
	case 5: 
		System.out.println("clear timer");
		break;
	
	}break;
//show call costs
case 6: 
System.out.println("""
	Show call costs:
		1. Last call cost 
		2. All call's cost
		3. Clear counters
""");
	int callCosts = phone.nextInt();
		switch (callCosts){
	case 1: 
		System.out.println("Last call cost");
		break;
	case 2: 
		System.out.println("All call's cost");
		break;
	case 3: 
		System.out.println("Clear counters");
		break;
	}break;

//call cost settings
case 7:
System.out.println("""
	Call cost Settings:
		1. Call cost limit
		2. Show cost in

""");
int costSettingLimit = phone.nextInt();
	switch (costSettingLimit){
	case 1: 
		System.out.println("Call cost limit");
		break;
	case 2: 
		System.out.println("Show cost in");
		break;
	}break;

//prepaid credit
case 8:
System.out.println("""
	Prepaid credit:
		1: Prepaid credit
""");

int prepaidCredit = phone.nextInt();
	switch (prepaidCredit){
	case 1: 
		System.out.println("Prepaid credit");
		break;
	}break;
}break;

//corect for phase4

case 5:

	System.out.println("""
	phone tones:
		1: Ringing tones
		2: Ringing volume
		3: Incoming call alert
		4: Composer
		5: Message alert tone
		6: Keypad tones
		7: Warning and game tones
		8: Vibrating alert
		9: Screen saver

""");
int tones = phone.nextInt();
	switch (tones){

	case 1: 
		System.out.println("Ringing tones");
		break;
	case 2: 
		System.out.println("Ringing volume");
		break;
	case 3: 
		System.out.println("Incoming call alert tone");
		break;
	case 4: 
		System.out.println("Composer");
		break;
	case 5: 
		System.out.println("Message alert tones");
		break;
	case 6: 
		System.out.println("Keypad tones");
		break;
	case 7: 
		System.out.println("Warning and game tones");
		break;
	case 8: 
		System.out.println("Vibrating alert");
		break;
	case 9: 
		System.out.println("Screen saver");
		break;
	}break;

case 6:
	System.out.println("""
		1. Call Settings
		2. Phone Settings 
		3. Security Settings
		4. Restore facytory settings

""");
int callSettings = phone.nextInt();
	switch(callSettings) {
	case 1:
System.out.println("""
	Call Settings:
		1. Automatic redial
		2. Speed dialling
		3. Call waiting options
		4. Own number sending
		5. Phone line in use
		6. Automatic answer

""");
int callRedialOption = phone.nextInt();
	switch(callRedialOption) {
	case 1: 
		System.out.println("Automatic redial");
		break;
	case 2: 
		System.out.println("Speed dialling");
		break;
	case 3: 
		System.out.println("Call waiting options");
		break;
	case 4: 
		System.out.println("Own number sending");
		break;
	case 5: 
		System.out.println("Phone line in use");
		break;
	case 6: 
		System.out.println("Automatic answer");
		break;
}break;
	case 2:
System.out.println("""
	Phone Settings:
		1. Language
		2. Call info display
		3. Welcome note
		4. Network selection
		5. Lights
		6. Comfirm SIM service actions
""");
	int phoneSet = phone.nextInt();
	switch(phoneSet){
	case 1: 
		System.out.println("Language");
		break;
	case 2: 
		System.out.println("Call info display");
		break;
	case 3: 
		System.out.println("Welcome note");
		break;
	case 4: 
		System.out.println("Network selection");
		break;
	case 5: 
		System.out.println("Lights");
		break;
	case 7: 
		System.out.println("Comfirm SIM service actions");
		break;
}break;

	case 3:
System.out.println("""
	Security Settings:
		1. PIN code request
		2. Call barring service
		3. Fixed dialling
		4. Closed user group
		5. Phone security
		6. Change access codes

""");
int security = phone.nextInt();
	switch(security){

	case 1: 
		System.out.println("PIN code request");
		break;
	case 2: 
		System.out.println("Call barring service");
		break;
	case 3: 
		System.out.println("Fixed dialling");
		break;
	case 4: 
		System.out.println("Closed user group");
		break;
	case 5: 
		System.out.println("Phone security");
		break;
	case 6: 
		System.out.println("Change access codes");
		break;
}

	case 4:
		System.out.println("Restore factory settings");
		
}
	case 7:
		System.out.println("Call divert");
		break;
	case 8:
		System.out.println("Games");
		break;
	case 9:
		System.out.println("Calculator");
		break;
	case 10:
		System.out.println("Reminders");
		break;
	case 11:
System.out.println("""
	Clock Settings:
		1. Alarm clock
		2. Clock settings
		3. Date settings
		4. Stopwatch
		5. Countdown timer
		6. Auto update of date and time
""");
int clockSettings = phone.nextInt();
	switch(clockSettings){
	case 1: 
		System.out.println("Alarm clock");
		break;
	case 2: 
		System.out.println("Clock settings");
		break;
	case 3: 
		System.out.println("Date settings");
		break;
	case 4: 
		System.out.println("Stopwatch");
		break;
	case 5: 
		System.out.println("Countdown timer");
		break;
	case 6: 
		System.out.println("Auto update of date and time");
		break;
}break;
	case 12: 
		System.out.println("Profiles");
		break;
	case 13: 
		System.out.println("SIM service");
		break;

}


//main
}	
}

