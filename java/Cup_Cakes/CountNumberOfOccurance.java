public class CountNumberOfOccurance{

public static void main(String []args){

int[] number = {10, 9, 13, 10, 2, 14, 10};

int target = 10;

boolean output = occurance(number, target);

int useroutput = occuranceNumber(number, target);

System.out.println(output);

System.out.println("Number of occurance is :" + useroutput);

}


public static boolean occurance(int[] arrNumber, int targetNumber){

int count = 0;

for(int index = 0; index < arrNumber.length; index++){
	if(targetNumber== arrNumber[index]){
	return true;
	
	}
	
}

	return false;

}


public static int occuranceNumber(int[] arrNumber, int targetNumber){

int counter = 0;

for(int index = 0; index < arrNumber.length; index++){
	if(targetNumber== arrNumber[index]){
	counter++;
	
	}
	
}

	return counter;

}


}


