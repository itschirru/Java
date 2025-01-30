import java.util.Scanner;

public class ppp {
    public static void main(String[] args) {
        int r, sum = 0, i, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Enter 1 for palindrome:\nenter 2 for prime:\nenter 3 for perfect:");
        int condition = sc.nextInt();
        switch (condition) {
            case (1):
                r = n % 10;
                sum = (sum * 10) + r;
                n = n / 10;
                System.out.println("the number" + n + "is a palindrom number");
                break;
            case (2):
                for (i = 1; i <= n; i++) {
                    if (n % i == 0)
                        c = c + 1;

                }
                if (c == 2)
                    System.out.println("the number" + n + "is a prime number");
                else
                    System.out.println("the number" + n + "is not a prime number");
                break;
            case (3):
                double z = Math.sqrt(n);
                int z_int = (int) (z);
                if (z == z_int)
                    System.out.println("the number" + n + "is a perfect number");
                else
                    System.out.println("the number" + n + "is not a perfect number");
                break;

            default:
                System.out.println("The number" + n + "is invalid");
                break;
        }
    }
}