import java.util.Scanner;
public class Lottery{
public static void main(String[] args){

int lottery = (int) (Math.random() * 100);
Scanner input = new Scanner(System.in);

System.out.print("ENter number guess: ");
int guessNumber= input.nextInt();

int lottery1 = lottery / 10;
int lottery2 = lottery % 10;

int numberGuess1 = guessNumber/ 10;
int numberGuess2 = guessNumber% 10;

	if(guessNumber == lottery){
		System.out.println("you made it! $10000");
	}else
	if(numberGuess1 == lottery2 && numberGuess2 == lottery1){
		System.out.println("You made it! $3000");
	}else
	if(numberGuess1 == lottery2 || numberGuess1 == lottery1 ||
	   numberGuess2 == lottery1 || numberGuess2 == lottery2){
	   System.out.println("You made it! $1000");
	}else
	System.out.println("invalid try again later");

}
}