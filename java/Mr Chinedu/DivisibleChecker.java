import java.util.Scanner;

public class DivisibleChecker{
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = scanner.nextInt();

if(number % 3 == 0 && number % 5 == 0) {
System.out.println("Divisible by both");
}else if(number % 3 == 0){
System.out.println("Divisible by 3");
}else if(number % 5 == 0) {
System.out.println("Divisible by 5");
}else{
System.out.println("Not divisible");
}

}
}