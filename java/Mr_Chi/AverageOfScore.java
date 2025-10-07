import java.util.Scanner;

public class AverageOfScore{
public static void main(String []args){

Scanner input = new Scanner(System.in);

int sum = 0;
double average = 0;

for(int number = 0; number < 10;){

	System.out.print("Enter a score(1-10): ");
	int score = input.nextInt();
	sum += number;
	 number++;

} 
	
	average = (double)sum / 10;
	
	System.out.println("the average is " + average);

}
}
