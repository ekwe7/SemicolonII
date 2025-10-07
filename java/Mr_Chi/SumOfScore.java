import java.util.Scanner;

public class SumOfScore{
public static void main(String []args){

Scanner input = new Scanner(System.in);

int sum = 0;

for(int number = 0; number < 10;){

	System.out.print("Enter a score(1-10): ");
	int score = input.nextInt();
	sum += number;
	 number++;

} 
	System.out.print(sum);

}
}