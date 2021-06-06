/*A peak element is an element that is strictly greater than its neighbors.
Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
You may imagine that nums[-1] = nums[n] = -∞.
You must write an algorithm that runs in O(log n) time.*/

import java.util.Scanner;

public class peakelement{
    public int findPeakElement(int[] nums) {
       
        int left = 0, right = nums.length - 1;
 
         while (left < right) {
             int mid = left + (right - left) / 2;
 
             if (nums[mid] < nums[mid + 1]) {
                 left = mid + 1;
             } else {
                 right = mid;
             }
         }
 
         return left;
     }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=io.nextInt();
        }
        peakelement s=new peakelement();
        System.out.println(s.findPeakElement(arr));
        io.close();
    } 
}