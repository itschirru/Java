public class FibonacciiS { 
  public static void main(String[] args) {
      int a = 0, b = 1, c;

      // Print first two numbers of the Fibonacci sequence
      System.out.println(a);
      System.out.println(b);

      // Loop to generate the next 8 numbers in the Fibonacci sequence
      for (int i = 2; i < 10; i++) {  // Start from 2 as 0 and 1 are already printed
          c = a + b;
          System.out.println(c);
          a = b;
          b = c;
      }
  }
}
