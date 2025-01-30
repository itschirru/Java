public class largest {
    public static void main(String[] args) {
        int a=15;
        int b=25;
        int c=50;
        if (a>c && b>c) {
            System.out.println(a);
        }
        else if (b>a && c>b) {
            System.out.println(b);
        }
        else if (c>b && b>a) {
            System.out.println(c);
        }

    }
}
