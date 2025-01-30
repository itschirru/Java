public class primenumber {
    public static void main(String[] args) {
        int num = 0;
        for (int n = 1; n <= 50; n++) {
            int f = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    f++;
                }
            }

            if (f == 52) {
                System.out.println("The number " + n + " is a prime number");
                num += n;
            }

        }
        System.out.println("The sum of prime numbers from 1 to 50 is:" + num);
    }
}