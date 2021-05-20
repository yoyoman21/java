/*Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.*/
import java.util.Scanner;

public class powerof3 {
    public boolean isPowerOfThree(int n) {
        int p=0;
        if(n<0) 
        {
            return false;
         }
        if(n==2 || n==0) 
            return false;
        while( p ==0 && n !=0){
            if(n==2) 
              
                return false;
    
            p = n%3;
            n = n/3;
            
            if(n==0) 
                return true;
            
        }
        return false;
    
}
public static void main(String[] args) {
    Scanner io=new Scanner(System.in);
    int n=io.nextInt();
    powerof3 s=new powerof3();
    System.out.println(s.isPowerOfThree(n));
    io.close();
}
}
