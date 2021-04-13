public class Assignment3 {
    public static void main(String args[])
    {
        int n=5;
        int s=1,h=n-1;

        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                for(int j=1;j<=s;j++)
                {
                    System.out.print("* ");
                }
                for(int k=1;k<=h;k++)
                {
                    System.out.print("# ");
                }
            }
            else
            {
                for(int k=1;k<=h;k++)
                {
                    System.out.print("# ");
                }
                for(int j=1;j<=s;j++)
                {
                    System.out.print("* ");
                }
            }
            if(i<=(n/2))
            {
                s++;
                h--;
            }
            else
            {
                s--;
                h++;
            }
            System.out.println();
        }
    }
}
