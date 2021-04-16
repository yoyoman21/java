/*Draw the following pattern*/
            
import java.util.*;
public class pattern4 {
    public static void main(String[] args)
    {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        io.close();
    }
}
