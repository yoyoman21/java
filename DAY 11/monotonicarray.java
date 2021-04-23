/*n array is monotonic if it is either monotone increasing or monotone decreasing.

An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].

Return true if and only if the given array A is monotonic.*/

import java.util.Scanner;
public class monotonicarray {
    public boolean isMonotonic(int[] A) {
        boolean increasing = false, decreasing = false;
     for(int i = 1; i< A.length; i++){
         if(A[i] < A[i-1]) 
         {
             decreasing = true;
         }
         
         if(A[i] > A[i-1]) 
         {
             increasing = true;
         }
     }
     return increasing && decreasing ? false: true;
        
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=io.nextInt();

        }
       monotonicarray s=new monotonicarray();
       System.out.println(s.isMonotonic(a));
       io.close();
    }
}
