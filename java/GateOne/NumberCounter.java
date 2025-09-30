import java.util.Scanner;

public class NumberCounter{
public static void main(String []ozy){

Scanner scanner = new Scanner(System.in);
int positiveNumber = 0;
int negativeNumber = 0;
int zeroNumber = 0;


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

System.out.println("Number of positive number is: " + positiveNumber);
System.out.println("Number of Negative Number is: " + negativeNumber );

        
    }
}