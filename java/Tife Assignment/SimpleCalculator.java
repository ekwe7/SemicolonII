import java.util.Scanner;

public class SimpleCalculator{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter first number: ");
double number1 = input.nextDouble();

System.out.print("Enter operation (+, -, *, /): ");
 char op = input.next().charAt(0);

System.out.print("Enter second number: ");
double number2 = input.nextDouble();

double result = 0;
boolean valid = true;

if (op == '+') {
result = num1 + num2;
} else if (op == '-') {
result = num1 - num2;
} else if (op == '*') {
result = num1 * num2;
} else if (op == '/') {
if (num2 != 0) {
result = num1 / num2;
}else {
System.out.println("Enter number greater than zero");
valid = false;
}
} else {
System.out.println("Invalid operation.");
valid = false;
}
if (valid) {
System.out.println("Result: " + result);
}



}
}