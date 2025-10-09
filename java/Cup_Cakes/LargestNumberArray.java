public class LargestNumberArray{

public static void main(String []args){

int[] arrNumber = {36, 14, 57, 23, 43, 0, -1};


int largest = arrNumber[0];

for(int index = 1; index < arrNumber.length; index++){
	if(arrNumber[index] > largest){
	largest = arrNumber[index];
	
	}
	
}

System.out.print(largest);

}

}
