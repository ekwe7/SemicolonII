import java.util.Scanner;

public class LargestNumber{
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter first student score: ");
int score1 = input.nextInt();
input.nextLine();

System.out.print("Enter second student score: ");
int score2 = input.nextInt();
input.nextLine();

System.out.print("Enter third student score: ");
int score3 = input.nextInt();
input.nextLine();

int highest = score1;
if (score2 > highest) {
 highest = score2;

}

if (score3 > highest) {
highest = score3;
}

System.out.println("\nResults:");
System.out.println("the largest score " + highest);

    }
}