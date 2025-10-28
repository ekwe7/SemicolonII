import java.util.Scanner;

public class ValidScores{
public static void main(String []args){

Scanner input = new Scanner(System.in);

int sum = 0;

for(int count = 0; count < 10; count++){
	System.out.print("Enter a number (0-100): ");
	int number = input.nextInt();
	
	try{
		if(number <= 100 || number >= 0){
		sum += number;
		sum++;
		System.out.print("sum");
		}
	}	
	catch{
		catch (ArrayIndexOutOfBoundsException e);
		System.out.println("Invalid input");
		}
}



}
}