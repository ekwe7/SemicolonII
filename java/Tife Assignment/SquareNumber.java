import java.util.Scanner;

public class SquareNumber{
public static void main(String []args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = input.nextInt();

int square = 0;
int counter = 0;

	while(counter < number){
	square += number;
	counter++;

	}
System.out.println(square);

}
}