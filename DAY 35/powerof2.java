/*Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.*/

import java.util.Scanner;

public class powerof2{
    public boolean isPowerOfTwo(int n) {
        if(n==0)
            return false;
        
        while(n!=1)
        {
            if(n%2!=0)
                return false;
            
            n=n>>1;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        powerof2 s=new powerof2();
        System.out.println(s.isPowerOfTwo(n));
        io.close();
    }
}