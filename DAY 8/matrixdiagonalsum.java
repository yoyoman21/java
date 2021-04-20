/*
Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.*/

import java.util.Scanner;
public class matrixdiagonalsum {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat.length;j++)
            {
                if(i==j)
                {
                    sum=sum+mat[i][j];
                }
                else if(i==mat.length-j-1)
                {
                    sum=sum+mat[i][j];
                }
            }
        }
        return sum;
        
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
        matrixdiagonalsum s=new matrixdiagonalsum();
        System.out.println(s.diagonalSum(arr));  
        io.close();
    }
}
