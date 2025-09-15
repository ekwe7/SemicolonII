import java.util.Scanner;

public class BarChart {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1 (between 1 and 30): ");
        int num1 = scanner.nextInt();
        if (num1 < 1 || num1 > 30) {
            System.out.println("Number must be between 1 and 30");
            num1 = 1;
        }

        System.out.print("Enter number 2 (between 1 and 30): ");
        int num2 = scanner.nextInt();
        if (num2 < 1 || num2 > 30) {
            System.out.println("Number must be between 1 and 30");
            num2 = 1;
        }

        System.out.print("Enter number 3 (between 1 and 30): ");
        int num3 = scanner.nextInt();
        if (num3 < 1 || num3 > 30) {
            System.out.println("Number must be between 1 and 30");
            num3 = 1;
        }

        System.out.print("Enter number 4 (between 1 and 30): ");
        int num4 = scanner.nextInt();
        if (num4 < 1 || num4 > 30) {
            System.out.println("Number must be between 1 and 30");
            num4 = 1;
        }

        System.out.print("Enter number 5 (between 1 and 30): ");
        int num5 = scanner.nextInt();
        if (num5 < 1 || num5 > 30) {
            System.out.println("Number must be between 1 and 30");
            num5 = 1;
        }


        System.out.println("\nBar Chart:");
        System.out.print("Number 1: " + num1 + " ");
        for (int index = 0; index < num1; index++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("Number 2: " + num2 + " ");
        for (int index = 0; index < num2; index++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("Number 3: " + num3 + " ");
        for (int index = 0; index < num3; index++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("Number 4: " + num4 + " ");
        for (int index = 0; index < num4; index++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("Number 5: " + num5 + " ");
        for (int index = 0; index < num5; index++) {
            System.out.print("*");
        }
        System.out.println();


    }
}