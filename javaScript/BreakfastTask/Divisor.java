public class Divisor{

public static void main(String... ekwe) {

int number = 12;


for (int index = 1; index <= Math.sqrt(number); index++) {

if (number % index == 0){

if (index != number / index ){
System.out.print(number / index + " ");

	}
	}
}
}
}