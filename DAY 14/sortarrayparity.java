/*Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.*/

import java.util.Scanner;
public class sortarrayparity {
    public static int[] sortArrayByParity(int[] A) {
        int[] parity=new int[A.length];
        int k=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]%2==0)
            {
                parity[k++]=A[i];
            }
        }
        for(int j=0;j<A.length;j++)
        {
            if(A[j]%2!=0)
            {
                parity[k++]=A[j];
            }
        }
        return parity;
}
   public static void main(String[] args) {
    Scanner io=new Scanner(System.in);
    int size=io.nextInt();
    int[] arr=new int[size];
    for(int i=0;i<size;i++)
    {
       arr[i]=io.nextInt();
    }
     int[] a=sortArrayByParity(arr);
     for(int i=0;i<a.length;i++)
     {
         System.out.print(a[i]+" ");
        }
        io.close();
   }
}
