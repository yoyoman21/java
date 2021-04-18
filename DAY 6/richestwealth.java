/*You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.*/

import java.util.Scanner;
public class richestwealth {
    public int maximumWealth(int[][] accounts) {
        int wealth=0;
        for(int[] w:accounts)
        {
            int sum=0;
            for(int j=0;j<w.length;j++)
            {
                sum=sum+w[j];
            }
            if(sum>wealth)
            {
                wealth=sum;
            }
        }
        return wealth;
    }
    public static void main(String[] args)
     {
        Scanner io=new Scanner(System.in);
        int m=io.nextInt();
        int n=io.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=io.nextInt();
            }
        }
        richestwealth s=new richestwealth();
        System.out.println(s.maximumWealth(arr));
        io.close();
    }
}
