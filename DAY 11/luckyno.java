/*
Given a m * n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.*/
import java.util.*;
public class luckyno {
    public  List<Integer> luckyNumbers (int[][] matrix) {
       
        int smallest;int col;int largest;
        List<Integer> output = new ArrayList();
        for(int i=0;i<matrix.length;i++){
            smallest = matrix[i][0];
            col=0;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<smallest){
                    smallest = matrix[i][j];
                    col = j;
                }
            }
            largest = matrix[0][col];
            for(int k=0;k<matrix.length;k++){
                if(matrix[k][col]>largest)
                    largest = matrix[k][col];
            }
            if(largest == smallest)
                output.add(smallest);
        }
        return output;
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

      luckyno s=new luckyno();
      System.out.println(s.luckyNumbers(arr));
      io.close();

    }
}
