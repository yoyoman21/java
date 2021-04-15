/*Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).*/
import java.util.*;
public class hamming {
    // you need to treat n as an unsigned value
    
    public int hammingWeight(int n) {
        int count=0;
       for(int i=0;i<32;++i)
       {
           if(((n>>>i)&1)==1)
           {
               ++count;
           }
       }
       System.out.println(count);
        return count;
    }
    public static void main(String[] args)
    {
        Scanner io=new Scanner(System.in);
        int integer=io.nextInt();
        hamming s=new hamming();
        s.hammingWeight(integer);
        io.close();
    }
}