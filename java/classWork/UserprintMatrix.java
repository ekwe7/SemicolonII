import java.util.Scanner;
public class UserprintMatrix{

public static int[][] matrix(int number){
Scanner input = new Scanner (System.in);

int[][] matrix = new int[number][number];
System.out.print("Enter numbers (0 or 1)");

	for(int row = 0; row < number; row++){
		for(int column = 0; column < row; column++){
		matrix[row][column] = input.nextInt();
		
		}
	}
	return matrix;
}



public static void main(String...ekwe){
	int number = 3;
	int[][] output = matrix(number);
	
	for(int index = 0; index < number; index++){
		for(int counter = 0; counter < number; counter++){
		int result = output[index][counter];
		System.out.print(result);
		}
		System.out.println();
	}


}

}
