/*check whether the given number is an confusingnumber.Retur true if it is.
A Confusing number is a number that when rotated 180 degrees becomes a different
number with each digit valid.
*/

import java.util.Scanner;

public class confusingnumber {
    public boolean confusingNumber(int n)
    {
        int N=0;
        int c=n;
        while(n>0)
        {
            int i=n%10;
            n=n/10;
            if(i==0 || i==1 ||i==8) 
            {
                N=N*10+i;
            }
            else if(i==6 || i==9)
            {
                N=N*10+(i==6?9:6);
                
            }
            else{
                return false;
            }
            
        }
        return N!=c;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        confusingnumber s=new confusingnumber();
        System.out.println(s.confusingNumber(n));
        io.close();
    }
}
