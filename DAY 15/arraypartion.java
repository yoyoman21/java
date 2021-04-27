/*Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum*/

import java.util.*;
public class arraypartion {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxsum=0;
        for(int i=0; i<nums.length;i=i+2)
        {
            maxsum=maxsum+Math.min(nums[i],nums[i+1]); 
        }   
        return maxsum;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=io.nextInt();
        }
        arraypartion s=new arraypartion();
        System.out.println(s.arrayPairSum(arr));
        io.close();
    }
}
