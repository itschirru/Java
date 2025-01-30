import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give any number:");
        int n = sc.nextInt();
        int r = 0, d = 0;
        for (; n != 0; n /= 10) {
            d = n % 10;
            r = r * 10 + d;
        }
        System.out.println("Reversed number:" + r);
    }

}
