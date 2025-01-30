public class Evensum {
    public static void main(String[] args) {
        int i = 0, s = 0;
        do {
            System.out.println(s);
            i = i + 2;
            s = s + i;
        } while (i <= 50);

    }
}