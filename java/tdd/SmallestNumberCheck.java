
public class SmallestNumberCheck{

public static int smallestNumberCheck(int[] number){

int smallest = number[0];

for(int count = 0; count < number.length; count++){
	if(number[count] <smallest){
	smallest = number[count];
	
	}
	
}
return smallest;

}

public static void main(String...args){

	int[] num = {2, 6, 8, 9, 6};
	System.out.println(smallestNumberCheck(num)); 

}

}