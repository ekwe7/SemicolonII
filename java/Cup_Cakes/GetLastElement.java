
public class GetLastElement{

public static void main(String []args){

int[] number = {9, 13, 10, 2, 14, 10, 7};

System.out.println("The last element is: " + lastElement(number));


}


public static int lastElement(int[] arrNumber){

	return arrNumber[arrNumber.length-1];

}

}



