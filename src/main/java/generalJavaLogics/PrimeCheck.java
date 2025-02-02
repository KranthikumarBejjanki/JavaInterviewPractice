package generalJavaLogics;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false; // Numbers <= 1 are not prime
        for (int i = 2; i < n; i++) { // Check from 2 to n-1
            if (n % i == 0) {
                return false; // If divisible, not a prime
            }
        }
        return true;
    }
}
