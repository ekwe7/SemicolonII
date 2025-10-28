public class CountNumberOfDivisor{

public static void main(String... args) {

int number = 12;
int count = 0;

for (int index = 1; index <= number; index++) {
if (number % index == 0) {
count++;
}
}

        System.out.println("Number of divisors is" + count);
}


}
