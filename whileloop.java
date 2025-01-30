public class whileloop {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1;
        int i = 50;

        while (n <= i) {
            sum = sum + n;
            n++;
        }
        System.out.println("The sum of numbers from 50 to 1 is: " + sum);
        }
    }
