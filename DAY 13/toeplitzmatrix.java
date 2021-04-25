/*Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise, return false.

A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.*/

import java.util.Scanner;
public class toeplitzmatrix{
    public boolean isToeplitzMatrix(int[][] matrix) {
        
        if(matrix.length==1)
        {
            return true;
        }
        for(int i=0;(i+1)<matrix.length;i++)
        {
            for(int j=0;(j+1)<matrix[i].length;j++)
            {
                
                if(matrix[i][j]!=matrix[i+1][j+1])
                {
                    return false;
                }
            }
        }
       return true;
        
    }

    public static void main(String[] args)
    {
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
        toeplitzmatrix s=new toeplitzmatrix();
        System.out.println(s.isToeplitzMatrix(arr));
        io.close();
    }

}