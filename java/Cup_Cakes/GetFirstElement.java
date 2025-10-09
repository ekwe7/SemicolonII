
public class GetFirstElement{

public static void main(String []args){

int[] number = {9, 13, 10, 2, 14, 10};

System.out.println("The fisrt element is " + firstElement( number));


}


public static int firstElement(int[] arrNumber){
	
	if(arrNumber == 0){
	return 0;
	}
	return arrNumber[0];

}

}


