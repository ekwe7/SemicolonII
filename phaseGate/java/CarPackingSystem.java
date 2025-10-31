
import java.util.Scanner;

public class CarPackingSystem{

static Scanner input = new Scanner(System.in);

static int[] myParkingList = new int[20];


public static void main(String[] args){

while(true){

System.out,print("""

==== DADDY PARKING SLOT====

	1. ENter CarPack
	2. Remove Car From CarPack
	0. Exit 

""");

int userChoice = input.nextInt();

switch(userChoice){

case 1:
	System.out.print("Enter car number: ");
	int userInput = input.nextInt();
	parkMyCar(userInput);
	break;
	
case 2:
	
	System.out.print("Enter slot number: ");
	int number = input.nextInt();
	
	leaveCarPark(number);
	break;

case 0:
	System.out.println("See you later!");
	break;
	
default:
	System.out.println("Invalid Number");
	
}


}
}

public static void parkMyCar(int carNumber){

for(int index = 0; index < myParkingList.length; index++){
if(myParkingList[index] == 0){
myParkingList[index] = carNumber;

return carNumber;

}
return "No Slot Available"

}


public static void leaveCarPark(int slotNumber){

if(slotNumber > 0 && slotNumber <= myParkingList.length){

if(myParkingList[slotNumber ] != 0){

}

}
}



}
