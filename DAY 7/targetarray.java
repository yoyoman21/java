/*Given two arrays of integers nums and index. Your task is to create target array under the following rules:

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.*/

import java.util.*;
public class targetarray {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
         if(n==1)
         {
             return nums;
         }
         List<Integer> list=new ArrayList();
         for(int i=0;i<n;i++)
         {
             int ind=index[i],val=nums[i];
             if(ind>=list.size())
             {
                 list.add(val);
             }
             else
             {
                 list.add(ind,val);
             }
         }
         for(int i=0;i<n;i++)
         {
             nums[i]=list.get(i);
         }
         return nums;
     }

     public static void main(String[] args) {
         Scanner io=new Scanner(System.in);
         int size=io.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=io.nextInt();
        }
        
        int[] arr1=new int[size];
        for(int i=0;i<size;i++)
        {
            arr1[i]=io.nextInt();
        }
        int[] a=createTargetArray(arr,arr1);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        io.close();
     }
}
