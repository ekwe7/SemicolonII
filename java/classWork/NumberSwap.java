import java.util.Scanner;
public class NumberSwap{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter number: ");
int number1 = input.nextInt();

System.out.print("Enter number: ");
int number2 = input.nextInt();


number1 = number2 + number1;
number2 = number1 - number2;
number1 = number1 - number2;

System.out.print(number1 + " " + number2);


}
}