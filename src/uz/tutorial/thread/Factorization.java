package uz.tutorial.thread;

import java.util.Scanner;

public class Factorization {

    public static void main(String[] args) {
        /* n - число для факторихации
           p, q - делители
         */
        int n, p, q;
        int k;
        System.out.println("Please, input number!");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        while (n % 2 == 0) {
            System.out.println("Number should be not even number!!!");
            n = scanner.nextInt();
        }

        System.out.println("Choose algorithm:\n1. Ferma\n2. Rho Pollard");
        k = scanner.nextInt();
        if(k == 1){
            double x;
            int i = 2;
            int y = 1;
            do {
                ++y;
                x = n + Math.pow(y,i);
                x = Math.sqrt(x);
            }while (x % 2 != 0);
            p = (int) x - y;
            q = (int) x + y;

        }else{
            p = pollardRho(n);
            q = n / p;
        }
        System.out.println("p = " + p);
        System.out.println("q = " + q);
    }

    public static Integer pollardRho(int n){
        int x = 2, y = 2, p = 1;
        while (p == 1){
            x = formulaPollard(x, n);
            y = formulaPollard(formulaPollard(y, n),n);
            p = gcd(x-y, n);
        }
        return p;
    }

    public static int gcd(int a, int b) {
        // initialise gcd = 0
        int gcd = 0;
        for (int i = 1; i <= a || i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    private static int formulaPollard(int x, int n){
        int temp = x;
        x = (temp*temp + 1) % n;
        return x;
    }

}
