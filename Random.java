public class Random {
    public static void main(String[] args) {
        Random rand= new Random();
        int min= 1000;
        int max= 9999;
        int r = random.nextInt(max - min + 1) + min;
        System.out.println("Random 4-digit number: "+r);
    }
}
