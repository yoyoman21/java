/*Given an integer x, return true if x is palindrome integer.*/
import java.util.*;
public class integerpalindrome {
    public boolean isPalindrome(int x) {
        int p=x;
        int rev=0;
       
        if(x<0)
        {
            return false;
        }
        while(x!=0)
        {
            int d=x%10;
            rev=rev*10+d;
            x=x/10;
        }
        if(rev==p)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner io=new Scanner(System.in);
        int no=io.nextInt();
        integerpalindrome s=new integerpalindrome();
        s.isPalindrome(no);
        io.close();
    }
}

