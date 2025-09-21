import java.util.Scanner;
import java.util.Random;


public class ScissorGame{
public static void main(String[] args){

int computNumber = (int)(Math.random() * 3);
Scanner input = new Scanner(System.in);


int scissor = 0;
int rock = 1;
int paper = 2;

int counter = 0;
int counter2 = 0;



int trial = 0;
while (trial < 5) {
    computNumber = (int)(Math.random() * 3);

    int userChoice;
    do {
        System.out.print("Enter 0 for Scissor, 1 for Rock, 2 for Paper: ");
        userChoice = input.nextInt();
        if (userChoice < 0 || userChoice > 2){
            System.out.println("Invalid input. Please enter 0, 1, or 2.");
        }
    } while (userChoice < 0 || userChoice > 2);

    if (userChoice == computNumber) {
        System.out.println("It's a tie!");
    } else if ((userChoice == 0 && computNumber == 2) ||
               (userChoice == 1 && computNumber == 0) ||
               (userChoice == 2 && computNumber == 1)) {
        System.out.println("You win!");
        counter++;
    } else {
        System.out.println("Computer wins!");
        counter2++;
    }
    trial++;
}

}
}