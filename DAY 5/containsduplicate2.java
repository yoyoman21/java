/*Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.*/

import java.util.*;
public class containsduplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int a=i-j;
                if(nums[i]==nums[j] && Math.abs(a)<=k)
                {
                 
                    return true;
                }
            }
        
        }
          return false;
        
    }
    public static void main(String[] args)
    {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=io.nextInt();
        }
        int t=io.nextInt();
        containsduplicate2 s=new containsduplicate2();
        System.out.println(s.containsNearbyDuplicate(arr,t));
        io.close();
    }
}

