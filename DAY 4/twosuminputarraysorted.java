/*Given an array of integers numbers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

Return the indices of the two numbers (1-indexed) as an integer array*/

import java.util.*;
public class twosuminputarraysorted {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
            int t=nums[i]+nums[j];
            if(t==target)
            {
               return new int[] {1+i,j+1};
            }
            }
         }
        return new int[] {};
    }
    public static void main(String[] args)
    {
        Scanner io=new Scanner(System.in);
       
        int tar=io.nextInt();
       
        int size=io.nextInt();
        int[] arr=new int[size];
        
        for(int i=0;i<size;i++)
        {
            arr[i]=io.nextInt();
        }
        io.close();
        int[] index=twoSum(arr,tar);
        if(index.length==2)
        {
            System.out.println(index[0]+" "+index[1]);
        }
    }
    
}
