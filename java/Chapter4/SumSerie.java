public class SumSerie{
    public static void main(String[] args) {
        System.out.println("n\tSum");
        for (int n = 1; n <= 100; n++) {
            long sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println(n + "\t" + sum);
        }
    }
}
