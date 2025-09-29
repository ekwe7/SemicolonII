
import java.util.Scanner;
public class Factoria{
public static void main(String []args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a factoria number: ");
int number = input.nextInt();


long output = 0;
long user1 = 0;

for(int index =1; index <= number; ){
	output = number / 100;
	user1 = output % 10;

	output = number / 10;
	user1 = number % 10;

	output = number / 1;
	user1 = number % 10;

	output *= user1;
System.out.println(output);

	index++;
}




}
}