public class CountNumberOfDivisor{

public static void main(String... args) {

int number = 12;
int count = 0;

for (int i = 1; i <= number; i++) {
if (number % i == 0) {
count++;
}
}

        System.out.println("Number of divisors is" + count);
}


}
