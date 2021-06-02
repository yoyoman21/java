/* Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

 */

import java.util.Scanner;

public class binarysearch {
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1,mid;
        while(left<=right)
        {
            mid=(left+right)/2;
            if(target<nums[mid])
            {
                right=mid-1;
            }
            else if(target==nums[mid])
            {
                return mid;
            }
            else
            {
                left=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int target=io.nextInt();
        int size=io.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=io.nextInt();
        }
        binarysearch s=new binarysearch();
        System.out.println(s.search(arr, target));
        io.close();
    }
}
