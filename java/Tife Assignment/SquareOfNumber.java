/* 
	1. prompt user to enter a number and store in a variable called number 
	2. initialize and empty variable called square
	3. iterate through the number
	4. add the number to the variable initialised earlier called square
	5. print square
	
	
*/

import java.util.Scanner;
public class SquareOfNumber{
public static void main(String []args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int number =input.nextInt();

	int square = 0;
	int index = 0;

	for(; index < number; ){
	square += number;
	index++;
	}
	System.out.print(square);

}
}
