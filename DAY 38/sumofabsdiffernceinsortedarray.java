/*You are given an integer array nums sorted in non-decreasing order.

Build and return an integer array result with the same length as nums such that result[i] is equal to the summation of absolute differences between nums[i] and all the other elements in the array.

In other words, result[i] is equal to sum(|nums[i]-nums[j]|) where 0 <= j < nums.length and j != i (0-indexed).

 */

import java.util.Scanner;

public class sumofabsdiffernceinsortedarray {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] result=new int[nums.length];
        int sum;
        for(int i=0;i<nums.length;i++)
        {
            int j=nums.length;
            sum=0;
            while(j>0)
            {
                sum=sum+Math.abs(nums[i]-nums[(nums.length-j)]);
                j--;
            }
            result[i]=sum;
        }
       return result; 
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=io.nextInt();
        }
        sumofabsdiffernceinsortedarray s=new sumofabsdiffernceinsortedarray();
        System.out.println(s.getSumAbsoluteDifferences(arr));
        io.close();
    }
}
