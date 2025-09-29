import java.util.Scanner;

public class LcmOfNumber2{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter a positive number: ");
int number = input.nextInt();

int sum = 0;

for (int count = number; count > 1; ) {
	for (int index = 2; index < count; index++) {
	if (count % index == 0) {
	System.out.println(index);
	sum += index;
	break;
	}

}

}
	System.out.println("Sum of prime factors: " + sum);


}
}