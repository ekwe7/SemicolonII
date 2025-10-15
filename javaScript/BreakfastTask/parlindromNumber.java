
public class parlindromNumber{
public static void main(String...ekwe){

int number = 23415;

int original = number;
int reversed = 0;

for(; number > 0; number /= 10 ){
	int digit = number % 10;
	reversed = reversed * 10 + digit;
}

	if(original  == reversed){
	System.out.println(original + " number is parlindrom");
	}else{
	System.out.println(original + " not parlindrom");
	}

}
}