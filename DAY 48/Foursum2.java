/*Given four integer arrays nums1, nums2, nums3, and nums4 all of length n, return the number of tuples (i, j, k, l) such that:
0 <= i, j, k, l < n
nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0 */

import java.util.*;
public class Foursum2{
public int fourSumCount(int[] arr1, int[] arr2, int[] arr3, int[] arr4) {
    int count=0;

HashMap<Integer,Integer> map=new HashMap<>();

for(int i=0;i<arr1.length;i++){
     for(int j=0;j<arr2.length;j++){
         int sum=arr1[i]+arr2[j];
    if(map.containsKey(sum)){
       int ov=map.get(sum);
        int nv=ov+1;
        map.put(sum,nv);
    }
    else{
    map.put(sum,1);
    }
}
}

for(int k=0;k<arr1.length;k++){
     for(int h=0;h<arr2.length;h++){
         int target=(-1)*(arr3[k]+arr4[h]);
    if(map.containsKey(target)){
      count=count+map.get(target);
    }
   
}
}
return count;
}
   public static void main(String[] args) {
       Scanner io=new Scanner(System.in);
       int n=io.nextInt();
       int a1[]=new int[n];
       int a2[]=new int[n];
       int a3[]=new int[n];
       int a4[]=new int[n];

       for(int i=0;i<n;i++)
       {
           a1[i]=io.nextInt();
           a2[i]=io.nextInt();
           a3[i]=io.nextInt();
           a4[i]=io.nextInt();
       }
       Foursum2 s=new Foursum2();
       System.out.println(s.fourSumCount(a1, a2, a3, a4));
       io.close();
   }
}