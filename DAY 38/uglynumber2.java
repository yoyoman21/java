/*An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

Given an integer n, return the nth ugly number.*/

import java.util.Scanner;

public class uglynumber2 {
    public int nthUglyNumber(int n) {
        if(n==1) return 1;      
        int arr[]=new int [n];
        arr[0]=1;
        
        int p2=0;
        int p3=0;
        int p5=0;
        
        for(int i=1;i<n;i++){
            arr[i]=Math.min(arr[p2]*2,Math.min(arr[p3]*3,arr[p5]*5));
            
            if(arr[i]==arr[p2]*2) p2++;
            if(arr[i]==arr[p3]*3) p3++;
            if(arr[i]==arr[p5]*5) p5++;
        }
        return arr[n-1];
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        uglynumber2 s=new uglynumber2();
        System.out.println(s.nthUglyNumber(n));
        io.close();
    }
}
