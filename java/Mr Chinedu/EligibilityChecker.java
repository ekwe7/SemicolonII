/*

1. It prompts the user to enter the attendance percentage and average score
2. It uses a ternary operator to check if both attendance and score are greater than or equal to 75
3. If both conditions are met, it sets eligibility to "Eligible"; otherwise, it sets it to "Not Eligible"
4. print the result

*/

import java.util.Scanner;

public class EligibilityChecker{
public static void main(String []args) {

Scanner scanner = new Scanner(System.in);

System.out.print("Enter attendance percentage: ");
double attendance = scanner.nextDouble();

System.out.print("Enter average score: ");
double score = scanner.nextDouble();

if (attendance >= 75 && score >= 75) {
System.out.print("Eligible");
} else {
System.out.print("Not Eligible");
}



}

}