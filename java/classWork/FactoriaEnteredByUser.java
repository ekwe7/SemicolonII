import java.util.Scanner;

public class FactoriaEnteredByUser{
public static void main(String...ekwe){

Scanner input = new Scanner(System.in);

System.out.print("ENter a number: ");
int number = input.nextInt();

int output = factoria(number);

System.out.print(output);
}



public static int factoria(int number){

int result = 1;
for(int count = 1; count< number; count++){
	result *= count;
}
	return result;
}

}