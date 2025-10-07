import java.util.Scanner;

public class SumOfEvenNumber{
public static void main(String []args){

Scanner input = new Scanner(System.in);

int sum = 0;

for(int number = 0; number < 10; number++){

	System.out.print("Enter a score(1-10): ");
	int score = input.nextInt();
	
	if(score % 2 == 0){
		sum = score + number;
		sum++;
		
	}
	

} 
	System.out.println("Total sum is " + sum);

}
}



