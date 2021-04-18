?]/*Draw the following pattern

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

public class pattern9 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=2*n-1;i++)
        {
            if(i<=n)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print("* ");
                }
            }
            else
            {
                 for(int j=i-n;j<=n-1;j++)
                 {
                     System.out.print("* ");
                 }
            }
            System.out.println();
        }
    }
}
