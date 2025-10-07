import java.util.Scanner;

public class SumOfEvenIndexes{
public static void main(String []args){

Scanner input = new Scanner(System.in);

int sum = 0;
double average = 0;

for(int number = 0; number < 10;){

	System.out.print("Enter a score(1-10): ");
	int score = input.nextInt();
	if(number % 2 == 0){
		sum += number;
		
	}
} 
	System.out.println("Total sum is " + sum);

}
}


