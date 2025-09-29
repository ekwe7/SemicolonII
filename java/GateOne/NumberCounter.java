import java.util.Scanner;

public class NumberCounter{
public static void main(String []ozy){

Scanner scanner = new Scanner(System.in);
int positiveNumber = 0;
int negativeNumber = 0;
int zeroNumber = 0;
char charater;

do{
System.out.print("Enter a number: ");
double number = scanner.nextDouble();

if(number > 0){
positiveNumber ++;
} else if (number < 0){
negativeNumber ++;
}else{
zeroNumber++;
}

System.out.print("Do you want to continue? (y/n): ");
charater = scanner.next().charAt(0);
}while (charater == 'y' || charater == 'Y');

System.out.println("Number of positive number is: " + positiveNumber);
System.out.println("Number of Negative Number is: " + negativeNumber );

        
    }
}