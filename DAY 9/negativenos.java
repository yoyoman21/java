/*Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid*/

import java.util.Scanner;
public class negativenos {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]<0)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=io.nextInt();
            }
        }
        negativenos s=new negativenos();
        System.out.println(s.countNegatives(arr));
        io.close();
    }
}
