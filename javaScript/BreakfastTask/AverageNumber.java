
public class AverageNumber{
public static void main(String...ekwe){

int sum = 0;
double average = 0;

for(int number = 1; number <= 100;){
	sum += number;
	 number++;

} 	
average = (double)sum / 100;
	
System.out.println("The average is " + average);

}
}

