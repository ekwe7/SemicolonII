public class TotalLengthOfArray{
public static void main(String[] args) {

int[] number = {10, 9, 13, 10, 2, 14, 10};
 
 
 
 System.out.println("The length of array is:" + arrayLength(number));

}

public static int arrayLength(int[] arrNumber){

	//return arrNumber.length;  
    
    int counter = 0;

for(int index = 0; index < arrNumber; index++){
	int output = arrNumber[index];
	counter++;
return counter;
}
	


}
}