/*Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

There may be duplicates in the original array.

Note: An array A rotated by x positions results in an array B of the same length such that A[i] == B[(i+x) % A.length], where % is the modulo operation*/

import java.util.Scanner;
public class sortedrotatedarray {
    public boolean check(int[] nums) {
        int count = 0;
	for (int i = 1; i < nums.length; i++) { 
        
		if (nums[i] < nums[i - 1])
        {
			count++;
	    }
    }

	if (count == nums.length - 1 || count == 0) {
		return true;
	}
	if (count == 1 && nums[0] >= nums[nums.length - 1])
    {
		return true;
    }
	return false;
        
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=io.nextInt();
        }
        sortedrotatedarray s=new sortedrotatedarray();
        System.out.println(s.check(arr));
        io.close();
    }
}
