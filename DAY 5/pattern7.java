/*Draw the following pattern

          *
        * *
      * * *
    * * * *
  * * * * *
    * * * *
      * * *
        * *
          *
    */
            
import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args)
    {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        for(int i=1;i<=2*n-1;i++)
        {
            if(i<=n)
            {
                for(int j=i;j<=n-1;j++)
                {
                System.out.print("  ");
                }

                for(int k=1;k<=i;k++)
                {
                    System.out.print("* ");
                }
            }
            else
            {
                for(int j=1;j<=(i-n);j++)
                {
                    System.out.print("  ");
                }

                for(int k=i;k<2*n;k++)
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
            
         }
         io.close();
    }
    
}
