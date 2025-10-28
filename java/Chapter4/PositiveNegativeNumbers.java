import java.util.Scanner;
public class PositiveNegativeNumbers{
public static void main (String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("The number of positive numbers is ");

int number = 4;
int positive = 0;
int negative = 0;
int counter = 0;


while(number != 0){
	number = input.nextInt();
	if(number > 0){
	positive++;
}else
	if(number < 0){
	negative++;
}
	//if(number != 0){
	//counter++;
}
}




}
}