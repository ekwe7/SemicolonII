import java.util.Scanner;

public class AirplainAcceleration {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

	System.out.println("Enter the take-off speed: ");
	double speed = scanner.nextDouble();

	System.out.println("Enter the acceleration : ");
	double accelrator = scanner.nextDouble();

	double length = (speed * speed ) / (2 * accelrator );
	System.out.println("The length needed is " + length);
        

    }
}

