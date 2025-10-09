public class LargestNumber{

public static void main(String []args){

int[] arrNumber = {10, 9, 13, 2, 14};


int largest = arrNumber[0];

for(int index = 1; index < arrNumber.length; index++){
	if(arrNumber[index] > largest){
	largest = arrNumber[index];
	
	}
	
}

System.out.print(largest);

}

}