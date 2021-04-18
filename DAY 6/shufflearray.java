/*Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].*/

import java.util.Scanner;
public class shufflearray {
    public static int[] shuffle(int[] nums, int n) {
        int[] arr=new int[2*n];
        int x=0,y=n;
        int index=0;
        for(int i=0;i<n;i++)
        {
            arr[index++]=nums[x++];
            arr[index++]=nums[y++];
        }
        return arr;
    }
    public static void main(String[] args)
     {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        int size=2*n;
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=io.nextInt();
        }
     
      int[] a=shuffle(arr, n);
      for(int i=0;i<a.length;i++)
      {
          System.out.print(a[i]+" ");
      }
      
  io.close();
    }
}

