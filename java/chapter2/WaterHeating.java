import java.util.Scanner;

public class WaterHeating{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the amount of water in kg: ");
	double water = scanner.nextDouble();

	System.out.print("Enter the initial temperature: ");
	double initialTemp = scanner.nextDouble();

 	System.out.print("Enter the final temperature: ");
	double finalTemp = scanner.nextDouble();
	
	if (finalTemp <= initialTemp) {
	System.out.println("Final temperature should be greater than the initial");
	} else {
	double energy = water * (finalTemp - initialTemp) * 4184;
	System.out.println("The energy needed is: " + energy);
            }

    }
}