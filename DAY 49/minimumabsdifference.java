/*You are given two positive integer arrays nums1 and nums2, both of length n.
The absolute sum difference of arrays nums1 and nums2 is defined as the sum of |nums1[i] - nums2[i]| for each 0 <= i < n (0-indexed).
You can replace at most one element of nums1 with any other element in nums1 to minimize the absolute sum difference.
Return the minimum absolute sum difference after replacing at most one element in the array nums1. Since the answer may be large, return it modulo 109 + 7.
|x| is defined as:
x if x >= 0, or
-x if x < 0.
  */

import java.util.*;
public class minimumabsdifference {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        
        long total = 0;
            int n = nums1.length;
            int[] diffs = new int[n];
            for (int i = 0; i < n; i++) { // O(N)
                int diff = Math.abs(nums1[i] - nums2[i]);
                diffs[i] = diff;
                total += diff;
            }
            
            if (total == 0) return 0;
            long minTotal = total;
            Arrays.sort(nums1); // O(NlogN)
            for (int j = 0; j < n; j++) { 
                int subInt = binarySearch(nums2[j], nums1); // O(logN)
                long tempTotal = total - diffs[j] + Math.abs(subInt - nums2[j]);
                if (tempTotal < minTotal) minTotal = tempTotal;
            } 
            return (int) (minTotal % 1000000007);
        }
        
        // find the number that is closest to x
        private int binarySearch(int x, int[] nums1) { // O(logN)
            int len = nums1.length;
            int left = 0;
            int right = len - 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (x - nums1[mid] > nums1[mid + 1] - x) {
                    left = mid + 1;
                } else {
                    right = mid;     
                }
            }
            return nums1[left];
        }
        public static void main(String[] args) {
            Scanner io=new Scanner(System.in);
       int size1=io.nextInt();
       int size2=io.nextInt();
       int[] nums1=new int[size1];
       int[] nums2=new int[size2];
       for(int i=0;i<size1;i++)
       {
           nums1[i]=io.nextInt();
       }
       for(int j=0;j<size2;j++)
       {
           nums2[j]=io.nextInt();
       }
       minimumabsdifference s=new minimumabsdifference();
       System.out.println(s.minAbsoluteSumDiff(nums1, nums2));
       io.close();
        }
}
