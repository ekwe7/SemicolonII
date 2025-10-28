import java.util.Scanner;

public class PizzaWahala {

static Scanner input = new Scanner(System.in);

public static void main(String[] args) {
    int userChoice;
        do{
   System.out.println("""
   
======== WELCOME TO IYA MOSES PIZZA JOINT ========
   
		1. Pizza Joint
		0. Exit
	""");
System.out.print("Enter choice: ");
userChoice = input.nextInt();

     switch(userChoice){
     case 1 -> iyaPizzaJoint();
     case 0 -> System.out.println("See you later");
     default -> System.out.println("Enter valid number");
      }
    }while(userChoice != 0);
}
 


public static void iyaPizzaJoint(){

int userChoice;
	do{
System.out.println("""

======= Iya-Pizza-Menu ======= 

PIZZA-TYPE 	||	NUMBER-OF-SLICES ||	PRICE-PER-BOX
=========================================================
1. Sapa size	||	4		||2,500
=========================================================
2. Small Money	||	6		||2,900
=========================================================
3. Big Boys	||	8		||4,000
=========================================================
4. Odogwu	||	12		||5,200
=========================================================

 """);
            
            
System.out.print("Enter a number: ");
userChoice = input.nextInt();


switch(userChoice){
	case 1 -> myPizzaOrder(4, 2500);
	case 2 -> myPizzaOrder(6, 2900);
	case 3 -> myPizzaOrder(8, 4000);
	case 4 -> myPizzaOrder(4, 5200);
	
	case 0 -> System.out.println("BAck");
	default -> System.out.println("Chief Enter a valid Option");
	}
	}while (userChoice != 0);
}



public static void myPizzaOrder(int numberOfSliceInBox, int prizeOfPizzaInCarton){

System.out.print("Enter number of People: ");
int numberOfPeople = input.nextInt();

int boxesToBuy = numberOfPeople / numberOfSliceInBox;
if(numberOfPeople % numberOfSliceInBox!= 0){
	boxesToBuy++;
}
		
int totalSlices = boxesToBuy * numberOfSliceInBox;
int slicesLeftOver = totalSlices - numberOfPeople;
int totalPrice = boxesToBuy * prizeOfPizzaInCarton;


System.out.println("the total slice is " + totalSlices);

System.out.println("Numbert of left over Slicee is " + slicesLeftOver);
System.out.println("Total price after all is " + totalPrice);





}
}



