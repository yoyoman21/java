/* Given an integer array arr. You have to sort the integers in the array in ascending order by the number of 1's in their binary representation and in case of two or more integers have the same number of 1's you have to sort them in ascending order.
Return the sorted array.*/

import java.util.*;
public class sortintegers {
    public int[] sortByBits(int[] arr) {
        Integer[] nums = new Integer[arr.length];
		for(int i=0; i<nums.length; i++) nums[i] = arr[i];

		Arrays.sort(nums, Comparator.comparing(i -> Integer.bitCount(i)*10000 + i));
		int[] ans = new int[arr.length];
		for(int i=0; i<ans.length; i++) ans[i] = nums[i];
		return ans;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=io.nextInt();
        }
      sortintegers s=new sortintegers();
      System.out.println(s.sortByBits(arr));
      io.close();
    }
}
