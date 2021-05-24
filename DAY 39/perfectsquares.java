/*Given an integer n, return the least number of perfect square numbers that sum to n.
A perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself. For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.*/

import java.util.Scanner;

public class perfectsquares {
    public static int numSquares(int n) {
        if(n == 0) return 0;
        if(n <= 3) return n;

        int[] dp = new int[n + 1];
        for(int i = 1; i <= 3; i++)
        {
            dp[i] = i;
        }
        
        for(int i = 4; i <= n; i++) 
        {
            dp[i] = i;
            for(int j = 1; j * j <= i; j++)
            {
                dp[i] = Math.min(dp[i], 1 + dp[i - j * j]);
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        int s=numSquares(n);
        System.out.println(s);
        io.close();
    }
}
