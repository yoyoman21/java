/*Given an integer n (in base 10) and a base k, return the sum of the digits of n after converting n from base 10 to base k.

After converting, each digit should be interpreted as a base 10 number, and the sum should be returned in base 10.*/

 import java.util.Scanner;
public class sumofdigitsk{
public int sumBase(int n, int k) {
    int m=0,s=0;
    while(n>0)
    {
        m=n%k;
        s=s+m;
        n=n/k;
        
    }
    return s;
}
public static void main(String[] args) {
    Scanner io=new Scanner(System.in);
    int n=io.nextInt();
    int k=io.nextInt();
    sumofdigitsk s=new sumofdigitsk();
    System.out.println(s.sumBase(n, k));
    io.close();
}
}