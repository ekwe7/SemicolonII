import java.util.Scanner;

public class LcmOfNumber{
public static void main(String []args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = input.nextInt();


int sum = 0;
int index = 2;

while(number > 1){

	while(number % index != 0){
	index++;
	}
	sum = sum + index;
	number = number / index;

}

System.out.println(sum);



}
}