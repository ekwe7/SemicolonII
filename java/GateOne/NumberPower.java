import java.util.Scanner;

public class NumberPower{
public static void main(String []ozy){

Scanner input = new Scanner(System.in);

System.out.print("ENter first Number: ");
int number1 = input.nextInt();

System.out.print("ENter Second Number: ");
int number2 = input.nextInt();

int total = 1;

for(int count = 1; count <= number2; count++){
	total *= number1;
}

System.out.println(number1 + " raised to the power of " + number2 + " is " + total);

}
}