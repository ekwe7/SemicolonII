public class PrintMatrix{

public static int[][] matrix(int number){

int[][] matrix = new int[number][number];
	for(int row = 0; row < number; row++){
		for(int column = 0; column < row; column++){
		int randomNumber = (int) (Math.random() * 2);
		
		}
	}
	return matrix;
}



public static void main(String...ekwe){
	int number = 4;
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