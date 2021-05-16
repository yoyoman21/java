/*Given an integer number n, return the difference between the product of its digits and the sum of its digits.*/

import java.util.Scanner;
public class subtractproductandsum
{
    public int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        int no=0;
          
            while(n>0)
            {
                 no=n%10;
                 product=product*no;
                 sum=sum+no;
                 n=n/10;
            }
            
           
        
        int result=product-sum;
        return result;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        subtractproductandsum s=new subtractproductandsum();
        System.out.println(s.subtractProductAndSum(n));
        io.close();
    }
}