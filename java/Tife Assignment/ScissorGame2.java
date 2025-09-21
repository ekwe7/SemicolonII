import java.util.Scanner;
import java.util.Random;


public class ScissorGame2{
public static void main(String[] args){

int computNumber = (int)(Math.random() * 3);
Scanner input = new Scanner(System.in);


int scissor = 0;
int rock = 1;
int paper = 2;

int counter = 0;
int counter2 = 0;


while(Math.abs(counter2 - counter) <= 2) {
System.out.println(computNumber + "Guess you number: ");
int userChoice = input.nextInt();


if(computNumber == scissor){
	if(userChoice == scissor){
	System.out.println("ooh wow!! that's tie");
}
}

if(computNumber == scissor){
	if(userChoice == rock){
	System.out.println("wow you won ");
	counter++;
}
}

if(computNumber == scissor){
	if(userChoice == paper){
	System.out.println("ooh! computer wins ");
	counter--;
}
}

if(computNumber == rock){
	if(userChoice == paper){
	System.out.println("ooh! computer wins ");
	counter++;
}
}

if(computNumber == paper){
	if(userChoice == paper){
	System.out.println("ooh! wow!! that's tie ");
}
}

if(computNumber == rock){
	if(userChoice == scissor){
	System.out.println("ooh! computer won ");
	counter--;
}
}

if(computNumber == paper){
	if(userChoice == rock){
	System.out.println("ooh! wow!! that's tie" );
}
}

if(computNumber == rock){
	if(userChoice == rock){
	System.out.println("ooh! wow! that's tie" );
}
}

if(computNumber == paper){
	if(userChoice == scissor){
	System.out.println("ooh! wow!! that's tie");
}
}

}
if(counter > counter2){
	System.out.println("Wow congratulation you Won");
}else
if(counter < counter2){
	System.out.println("ooh! sorry you loose to computer");
}
	System.out.println("Wow congratulation you Won");
	//System.out.println("ooh! sorry you loose to computer");
	
	
}
}
