/*Given an array of positive integers nums, remove the smallest subarray (possibly empty) such that the sum of the remaining elements is divisible by p. It is not allowed to remove the whole array.

Return the length of the smallest subarray that you need to remove, or -1 if it's impossible.

A subarray is defined as a contiguous block of elements in the array. */

import java.util.*;

public class makesumdividiblebyp {
    public int minSubarray(int[] nums, int p) {
        int len = nums.length;
        long total = 0;
        for(int num : nums)
            total+=num;
        int target = (int)(total%p);
        if(target == 0) return 0;
        Map<Integer, Integer> map = new HashMap();
        map.put(0, -1);
        int min = len;
        int cur = 0;
        for(int i=0; i<len; i++){
            cur = (cur+nums[i])%p;
            int tofind = (cur-target+p)%p;
            if(map.containsKey(tofind))
                min = Math.min(min, i-map.get(tofind));
            map.put(cur, i);
        }
        return min == len ? -1 : min;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
        int[] arr=new int[size];
        int p=io.nextInt();
        for(int i=0;i<size;i++)
        {
            arr[i]=io.nextInt();
        }
        makesumdividiblebyp s=new makesumdividiblebyp();
        System.out.println(s.minSubarray(arr, p));
        io.close();
    }
}
