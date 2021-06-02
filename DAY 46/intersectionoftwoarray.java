/* Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique 
and you may return the result in any order.*/

import java.util.*;

public class intersectionoftwoarray {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>h=new HashSet();
         for(int i:nums1)
         {
             h.add(i);
         }
         ArrayList<Integer>a=new ArrayList<>();
         for(int j: nums2)
         {
             if(h.contains(j))
             {
                 a.add(j);
                 h.remove(j);
             }
         }
         int[] r=new int[a.size()];
         for(int k=0;k<a.size();k++)
         {
             r[k]=a.get(k);
         }
         return r;
         
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
         intersectionoftwoarray s=new intersectionoftwoarray();
         System.out.println(s.intersection(arr1,arr2));
         io.close();
     }
}
