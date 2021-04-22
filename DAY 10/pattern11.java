/*Draw the following pattern
      
        1
      2 0 2
    3 0 0 0 3
  4 0 0 0 0 0 4
5 0 0 0 0 0 0 0 5

*/

import java.util.Scanner;
public class pattern11 {

    public static void main(String[] args)
    {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int k=i;k<=i;k++)
            {
                System.out.print(k+" ");
            }
            for(int k=1;k<2*(i-1);k++)
            {
                System.out.print("0 ");
            }
            if(i>=2)
            {
            for(int j=i;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            }
            System.out.println();
    }
          io.close();
    }
}
