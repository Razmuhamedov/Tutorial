package uz.tutorial.thread;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {
    private static List<Integer> primeNumbers;

    public static void main(String[] args) {
        System.out.println("Please, input other number!");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        sieveOfEratosthenes(n);

        for (Integer i:primeNumbers) {
            System.out.println(i);
        }

    }
    public static void sieveOfEratosthenes(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        primeNumbers = new LinkedList<>();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                primeNumbers.add(i);
            }
        }
    }

}
