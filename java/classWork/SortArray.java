
public class SortArray{
public static void main(String...args){

int[] myArray = {3, 14, 7, 21, 8, 9,16, 67, 98};

int number= 0;

for(int count = 0; count < myArray.length; count++){
	for(int counter = count +1; counter  <  myArray.length; counter++){
	
	if(myArray[count] > myArray[counter]){
	
	number = myArray[count];
	myArray[count] = myArray[counter];
	myArray[counter] = number; 
	}
	//System.out.println(count);
	//System.out.println(counter);


	}
	System.out.print(myArray[count]+" ");
	
	
}




}
}