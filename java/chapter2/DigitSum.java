import java.util.Scanner;

public class DigitSum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 1000: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 1000) {
            System.out.println("Number must be between 0 and 1000");
        } else {
            int sum = 0;
            int temp = number;

            while (temp != 0) {
                sum += temp % 10;
                temp = temp / 10;
            }

            System.out.println("The sum of the digits in " + number + " is " + sum);
        }


    }
}