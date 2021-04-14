/*Given a signed 32-bit integer x, 
return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.*/
import java.util.*;
public class reversinginteger {
    public int reverse(int x) {
        int rev=0;
        while(x!=0)
        {
            int d=x%10;
            rev=rev*10+d;
            x=x/10;
        }
        System.out.println(rev);
            return 1;
        }
   public static void  main(String args[])
   {
      Scanner io=new Scanner(System.in);
       int no=io.nextInt();
       reversinginteger s=new reversinginteger();
       s.reverse(no);
       io.close();
   }
    
    
}
