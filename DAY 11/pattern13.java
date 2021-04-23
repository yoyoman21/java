/*Draw the following pattern

          1
        1   2
      1   2   3
    1   2   3   4
  1   2   3   4   5
1   2   3   4   5   6

*/

import java.util.Scanner;
public class pattern13
{
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=n-i;j++)
           {
               System.out.print("  ");
           }
           for(int k=1;k<=i;k++)
           {
               System.out.print(k+"   ");
           } 
           System.out.println();
        }
        io.close();

    }
}