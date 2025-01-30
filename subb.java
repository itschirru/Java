import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        int marks;
        //math,physics,bio,english
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the marks in bio:");
        int bio =sc.nextInt();
        System.out.println("Enter the marks in math:");
        int math =sc.nextInt();
        System.out.println("Enter the marks in phyics:");
        int phy =sc.nextInt();
        System.out.println("Enter the marks in english:");
        int eng =sc.nextInt();
        marks=bio+math+phy+eng;
        if(marks >= 240 && marks <400 ){
          System.out.println("you can take science");
        }
        else{
            System.out.println("you can take any other streams");
        }
    }
}