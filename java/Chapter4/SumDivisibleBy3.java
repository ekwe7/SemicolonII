public class SumDivisibleBy3{
public static void main(String[] args){

int sum = 0;
for(int index = 1; index <= 30; index++){
	if(index % 3 == 0){
	sum += index;
	}
System.out.println("The sum of integers between 1 and 30 that are divisible by 3 is: " + sum);

}
}
}
