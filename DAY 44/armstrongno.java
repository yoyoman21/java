import java.util.Scanner;

/*Check whether the number is an armstrong number.RETURN TRUE if it is.An armstrong number is positive number whoes sum of thr cubes
of its digits is equal to the given number */

public class armstrongno {
    public boolean isArmStrong(int n)
    {
        int sum=0,a,temp;
        temp=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            sum=sum+(a*a*a);
        }
        if(temp==sum)
           return true;
        else
           return false;   
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        armstrongno s=new armstrongno();
        System.out.println(s.isArmStrong(n));
        io.close();
    }
}
