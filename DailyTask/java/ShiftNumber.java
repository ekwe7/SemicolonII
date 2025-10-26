public class ShiftNumber{
public static void main(String...args){

int[] numbers = {4, 0, 2, 0, 1, 0, 3};

for(int index = 0; index < numbers.length; index++){
	for(int count = index + 1; count < numbers.length; count++){
	
		if (numbers[index] < numbers[count]){
			int temp = numbers[index];
			numbers[index] = numbers[count];
			numbers[count] = temp;
			
		}
		
	}

}

for(int number : numbers){
System.out.print(number + " ");
}


}

}