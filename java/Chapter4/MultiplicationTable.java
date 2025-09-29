/*
1. prompt user for input and store in a variable called number
2. initialize a variable to store the value after iteration called tital
3. iterate through the number and multiply the number by index and store in total
4. increament the index
5. print result
*/


import java.util.Scanner;

public class MultiplicationTable{
public static void main(String []args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = input.nextInt();

int total = 0;

	for(int index = 1; index <= 12; ){
		total = number * index;
		
		
		System.out.println(index +" * " + number + " = " + total);
		index++;
	}
	

}
}