import java.util.Scanner;

public class MinMaxSum{
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.print("Enter the number of values: ");
int n = scanner.nextInt();

int min = Integer.MAX_VALUE;
int max = Integer.MIN_VALUE;

for (int index = 0; index < n; index++) {
System.out.print("Enter value " + (index + 1) + ": ");
int value = scanner.nextInt();

if (value < min) {
min = value;
}
if (value > max) {
max = value;
}
}

        int sumOfExtremes = min + max;

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Sum of extremes: " + sumOfExtremes);

}
}