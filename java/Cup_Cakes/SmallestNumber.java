public class SmallestNumber{

public static void main(String []args){

int[] number = {10, 9, 13, 2, 14};

System.out.println(smallest(number));


}


public static int smallest(int[] arrNumber){
int smallest = arrNumber[0];

for(int index = 0; index < arrNumber.length; index++){
	if(arrNumber[index] < smallest){
	smallest = arrNumber[index];
	
	}
	
}

	return smallest;

}

}
