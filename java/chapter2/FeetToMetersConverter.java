import java.util.Scanner;

public class FeetToMetersConverter {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.print("Enter a value for feet: ");
double feet = scanner.nextDouble();

double convertNumber = 0.305;

double meter = feet * convertNumber ;
System.out.println(feet + " feet is " + meter + "meters");

    }
}