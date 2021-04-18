/*Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.*/

import java.util.*;
public class Runningsum {
    public int[] runningSum(int[] nums) {
        int[] sum=new int[nums.length];
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            s=s+nums[i];
            sum[i]=s;
        }
        
        return sum;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=io.nextInt();
        }
        Runningsum s=new Runningsum();
        System.out.println(s.runningSum(arr));
        io.close();
    }
}
