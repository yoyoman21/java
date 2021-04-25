/*Given a 2D integer array matrix, return the transpose of matrix.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.*/

import java.util.Scanner;
public class transposematrix {
    public static int[][] transpose(int[][] matrix) {
        int[][] tmatrix=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                
                    tmatrix[j][i]=matrix[i][j];
                
            }
        }
        return tmatrix;
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
    int[][] a=transpose(arr);
      for(int i=0;i<a.length;i++)
      {
          for(int j=0;j<a.length;j++)
          {
              System.out.print(a[i][j]+" ");
          }
          System.out.println();
      }
      io.close();

    }
}
