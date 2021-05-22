/*Return the number of permutations of 1 to n so that prime numbers are at prime indices (1-indexed.)

(Recall that an integer is prime if and only if it is greater than 1, and cannot be written as a product of two positive integers both smaller than it.)

Since the answer may be large, return the answer modulo 10^9 + 7.

 */ 

import java.util.Scanner;

public class primearrangements {
    public int numPrimeArrangements(int n) {
        if(n < 2){
            return 1;
        }
        long res = 1;
        int prime = 1;
        int notPrime = 1;
        for(int i = 3; i <= n; i++){
            if(isPrime(i)){
                prime++;
            }else{
                notPrime++;
            }
        }
        for(int i = prime; i > 0; i--){
            res *= i;
            res %= 1000000007;
        }
        for(int i = notPrime; i > 0; i--){
            res *=i;
            res %= 1000000007;
        }
        return (int)res; 
    }
    public boolean isPrime(int num){
        for(int i = 2; i <= num / 2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
      int n =io.nextInt();
      primearrangements s=new primearrangements();
      System.out.println(s.numPrimeArrangements(n));
      io.close();
    }
}
