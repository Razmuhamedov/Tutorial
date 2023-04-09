package uz.tutorial.thread;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(gcd(10,24));
       /* SequenceGenerator sq = new SequenceGenerator();

        for (int i = 0; i<100; i++) {
            new Thread(() -> {
                {
                    System.out.println(Thread.currentThread().getName() + " "
                    + sq.generate());
                }
            }).start();
        }*/

    }
   /* public static int gcd(int a, int b)
    {

        // initialise gcd = 0
        int gcd = 0;
        for (int i = 1; i <= a || i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }*/
    public static int gcd(int a, int b){
        return b == 0 ? a : gcd(b,a % b);
    }
}