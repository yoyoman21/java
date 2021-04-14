/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.*/
import java.util.*;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
            int t=nums[i]+nums[j];
            if(t==target)
            {
               return new int[] {i,j};
            }
            }
         }
        return new int[] {};
    }
    public static void main(String[] args)
    {
        Scanner io=new Scanner(System.in);
        System.out.println("enter target");
        int tar=io.nextInt();
        System.out.println("enter size of array");
        int size=io.nextInt();
        int[] arr=new int[size];
        System.out.println("enter the elements of array");
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