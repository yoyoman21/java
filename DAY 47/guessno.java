/*We are playing the Guess Game. The game is as follows:
I pick a number from 1 to n. You have to guess which number I picked.
Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
You call a pre-defined API int guess(int num), which returns 3 possible results:
-1: The number I picked is lower than your guess (i.e. pick < num).
1: The number I picked is higher than your guess (i.e. pick > num).
0: The number I picked is equal to your guess (i.e. pick == num).
Return the number that I picked. */

import java.util.Scanner;

public class guessno{
   
    
        public int guessNumber(int n) {
            if(n == 1 || guess(n) == 0) return n;
        int start = 1;
        int mid = (n+start) / 2;
        while(guess(mid) != 0){
            if(guess(mid) == 1) {
                start = mid;
                mid = n/2 + start/2 + 1;
            } else {
                n = mid;
                mid = n/2 + start/2;
            }
        }
        return mid;
        }
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        guessno s=new guessno();
        System.out.println(s.guessNumber(n));
        io.close();
    }
}