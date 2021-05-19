/*You are given an m x n matrix M initialized with all 0's and an array of operations ops, where ops[i] = [ai, bi] means M[x][y] should be incremented by one for all 0 <= x < ai and 0 <= y < bi.

Count and return the number of maximum integers in the matrix after performing all the operations.*/

import java.util.Scanner;

public class rangeadition {
    public int maxCount(int m, int n, int[][] ops) {
        for(int i=0;i<ops.length;i++)
    {
        if(ops[i][0]<m)
        {
            m=ops[i][0];
        }
        
        if(ops[i][1]<n)
        {
           n= ops[i][1];
        }
    }
    return m*n;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int m=io.nextInt();
        int n=io.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=io.nextInt();
            }
        }
        rangeadition s=new rangeadition();
        System.out.println(s.maxCount(m, n,arr));
        io.close();
    }
}
