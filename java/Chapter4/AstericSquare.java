import java.util.Scanner;

public class AstericSquare{
public static void main(String []args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = input.nextInt();

for(int rows = 0; rows <= number; rows++){
	for(int col = 0; col <= number; col++){
	System.out.print("* ");
	
	}
	System.out.println();
}
}
}