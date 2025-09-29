import java.util.Scanner;

public class Palindrome{
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number: ");
int user = scanner.nextInt();

        int original = user;
        int reverse = 0;

        while(user != 0) {
            int digit = user % 10;
            reverse = reverse * 10 + digit;
            user /= 10;
        }

        if (original == reverse) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }
    }
    }
