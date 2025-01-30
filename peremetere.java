import java.util.Scanner;

public class peremetere {
    public static void main(String[] args) {
        double l,w;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lenght:");
        l = sc.nextInt();
        System.out.println("Enter width:");
        w = sc.nextInt();
        double a = l*w; //lenght
        double p = 2*l+w; //width
        System.out.println(a);
        System.out.println(p);

    }
    
}