import java.util.Scanner;

public class FibonacciD { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for the number of Fibonacci numbers to print
        System.out.print("Enter the number of Fibonacci numbers to display: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c;

        // Print first two numbers of the Fibonacci sequence if n > 0
        if (n > 0) {
            System.out.println(a);
        }
        if (n > 1) {
            System.out.println(b);
        }

        // Loop to generate the Fibonacci sequence up to n terms
        for (int i = 2; i < n; i++) {  // Start from 2 as 0 and 1 are already printed
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
