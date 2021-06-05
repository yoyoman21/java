/* You are given two non-increasing 0-indexed integer arrays nums1​​​​​​ and nums2​​​​​​.
A pair of indices (i, j), where 0 <= i < nums1.length and 0 <= j < nums2.length, is valid if both i <= j and nums1[i] <= nums2[j]. The distance of the pair is j - i​​​​.
Return the maximum distance of any valid pair (i, j). If there are no valid pairs, return 0.
An array arr is non-increasing if arr[i-1] >= arr[i] for every 1 <= i < arr.length.*/

import java.util.Scanner;

public class maxdistance {
    public int maxDistance(int[] nums1, int[] nums2) {
        
        int ans = 0;
       int i = 0, j = 0;
       
       while(i < nums1.length && j < nums2.length){
           if(nums1[i] <= nums2[j]) {
               ans = Math.max(ans, j - i);
           }
           
           if(i < j && nums1[i] > nums2[j]) i++;
           else j++;
       }
       
       return ans;
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
     maxdistance s=new maxdistance();
     System.out.println(s.maxDistance(nums1, nums2));
     io.close();
   }
}
