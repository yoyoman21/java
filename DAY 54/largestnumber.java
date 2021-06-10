/*Given a list of non-negative integers nums, arrange them such that they form the largest number.
Note: The result may be very large, so you need to return a string instead of an integer. */

import java.util.*;
public class largestnumber{
    public String largestNumber(int[] nums) {
        String arr[] = new String[nums.length];
       int i = 0;
       for(int val : nums){
         arr[i++] = String.valueOf(val);
       }
     
     Arrays.sort(arr,new Comparator<>(){
       public int compare(String a,String b){
         return (b+a).compareTo(a+b);
       }
     });
    
     StringBuilder sb = new StringBuilder();
     for(String val : arr) sb.append(val);
     
     String ans = sb.toString();
     return ans.charAt(0)=='0' ? "0" : ans;
   }
   public static void main(String[] args) {
       Scanner io=new Scanner(System.in);
       int size=io.nextInt();
       int[] nums=new int[size];
       for(int i=0;i<size;i++)
       {
           nums[i]=io.nextInt();
       }
       largestnumber s=new largestnumber();
       System.out.println(s.largestNumber(nums));
       io.close();
   }
}