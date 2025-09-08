
import java.util.Scanner;

 public class ComparingInteger {
   public static void main(String[] args) {
Scanner input = new Scanner(System.in);

  System.out.print("Enter an integer: ");
int number = input.nextInt();

int square = number * number;
boolean great = square > 100;
boolean less = square < 100;
boolean equal = square == 100;
boolean notEqual = square != 100;

  System.out.printf("%d%b%b%b%b", square, great, less, equal, notEqual);


}
}
