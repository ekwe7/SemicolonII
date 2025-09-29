
import java.util.Scanner;
public class OccuranceOfMaxNumber{
public static void main(String ozy[]){

Scanner input = new Scanner(System.in);


int max = Integer.MIN_VALUE;
int freq = 0;
int number = 0;

for(int counter = 0; counter <= number;){
	System.out.print("Enter a number: ");
	number = input.nextInt();
	
		if(number > max){
		max = number;
		counter = 1;
		}else
		if(number == max){
		counter++;
		}
		
		if(number == max){
		System.out.println("idiot enter a number");
		}else
		if(max == Integer.MIN_VALUE){
		System.out.println("The largest number is " + max);
		}

}

}
}