
public class PerfectNumber{
public static void main(String...ekwe){

for(int number = 1; number <= 100; number++ ){
	int sum = 0;
	for(int num = 1; num <= number /2; num++){
		if(number % num == 0){
			sum += num;
		}
	}
	if(sum == number){
	System.out.print(number + " ");
	}
}

}

}