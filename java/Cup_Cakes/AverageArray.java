public class AverageArray{

public static void main(String[] args) {

int[] number = {1, 2, 3, 4, 5, 6, 8};
System.out.println("Average is " + findAverage(number));

}


public static double findAverage(int[] arrNumber) {

if(arrNumber.length == 0){
        return 0; 
	}
	
int average = 0;

for (int index = 0; index < arrNumber.length; index++){
	average += arrNumber[index];
	}
        return (double)average / arrNumber.length;
}
}
