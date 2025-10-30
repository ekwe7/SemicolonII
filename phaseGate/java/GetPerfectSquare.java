
import java.util.Arrays;
public class GetPerfectSquare{

public static boolean[] isperfectNumber(int[] number){

boolean[] myList = new boolean[number.length];

for(int count = 0; count < number.length; count++){

//int myNumber = number[count];

	if(count * count == 0){

	myList[count] = true;
	
	}else{
	
	myList[count] = false;
	}
}

return myList;
}




public static void main(String[] args){

int[] myNumber = {4, 6, 25, 49};

System.out.print(Arrays.toString(isperfectNumber(myNumber)));


}

}