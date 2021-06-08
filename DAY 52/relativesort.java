/*Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
Sort the elements of arr1 such that the relative ordering of items 
in arr1 are the same as in arr2.  Elements that don't appear in arr2 should be placed at the end of arr1 in ascending order. */

import java.util.*;
public class relativesort{
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
   Arrays.sort(arr1);
   int ans[]=new int[arr1.length];
    int c=0;
   Set<Integer> set=new HashSet<>();
  for(int i=0;i<arr2.length;i++){
    for(int j=0;j<arr1.length;j++){
        if(arr2[i]==arr1[j]){
            ans[c]=arr1[j];
            set.add(ans[c]);
            c++;
        }
    }
}

for(int i=0;i<arr1.length;i++) {
    if(!set.contains(arr1[i])){
        ans[c]=arr1[i];
        c++;
    }
}
return ans;
    }
public static void main(String[] args) {
    Scanner io=new Scanner(System.in);
    int s1=io.nextInt();
    int s2=io.nextInt();
    int[] arr1=new int[s1];
    int[] arr2=new int[s2];
    for(int i=0;i<s1;i++)
    {
        arr1[i]=io.nextInt();
    }
    for(int j=0;j<s2;j++)
    {
        arr2[j]=io.nextInt();
    }
    relativesort s=new relativesort();
    System.out.println(s.relativeSortArray(arr1, arr2));
    io.close();
 }
}