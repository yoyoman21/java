/*Given two integer arrays nums1 and nums2, return an array of their 
intersection. Each element in the result must appear as many times as 
it shows in both arrays and you may return the result in any order. */

import java.util.Arrays;
import java.util.Scanner;

public class intersection2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int m=nums1.length;
    int n=nums2.length;
    int i=0;
    int j=0;
    int k=0;
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    
    while(i<m && j<n)
    {
        if(nums1[i]==nums2[j])
        {
            nums1[k++]=nums1[i];
            i=i+1;
            j=j+1;
        }
        else if(nums1[i]<nums2[j])
        {
            i=i+1;
        }
        else
        {
            j=j+1;
        }
        
    }
    
    int[] result=new int[k];
    for(int p=0;p<k;p++)
        result[p]=nums1[p];
    return result;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n1=io.nextInt();
         int n2=io.nextInt();
         int arr1[]=new int[n1];
         int arr2[]=new int[n2];
         for(int i=0;i<n1;i++)
         {
           arr1[i]=io.nextInt();
         } 
         for(int j=0;j<n2;j++)
         {
             arr2[j]=io.nextInt();
         }
         intersection2 s=new intersection2();
         System.out.println(s.intersect(arr1, arr2));
         io.close();
    }
}
