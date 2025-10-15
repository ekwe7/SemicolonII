
public class PrimeNumbers{

public static void main(String... ekwe){

System.out.println("Prime numbers between 1 and 100:");

for (int index = 2; index <= 100; index++) {
 boolean isPrime = true;
 
for (int count = 2; count <= Math.sqrt(index); count++) {
	if (index % count == 0) {
	isPrime = false;
	break;
   }
}

if(isPrime)
System.out.print(index + " ");


}






}
}