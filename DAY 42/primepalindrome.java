/*Find the smallest prime palindrome greater than or equal to n.
Recall that a number is prime if it's only divisors are 1 and itself, and it is greater than 1. 
For example, 2,3,5,7,11 and 13 are primes.Recall that a number is a palindrome if it reads the same from left to right as it does from right to left. 
For example, 12321 is a palindrome.*/

import java.util.Scanner;

public class primepalindrome {
    public int primePalindrome(int N) {
        while (true) {
            if (N == reverse(N) && isPrime(N))
                return N;
            N++;
            if (10000000 < N && N < 100000000) N = 100000000;
        }
    }

    public boolean isPrime(int N) {
        if (N < 2) return false;
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) return false;
        }
        return true;
    }

    public int reverse(int N) {
        int num = 0;
        while (N > 0) {
            num = 10 * num + (N % 10);
            N /= 10;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        primepalindrome s=new primepalindrome();
        System.out.println(s.isPrime(n));
        io.close();
    }
}
