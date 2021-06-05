/*Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
Return the minimum integer k such that she can eat all the bananas within h hours. */

import java.util.*;
public class kokoeatingbananas{
    public int minEatingSpeed(int[] piles, int h) {

        int max = Arrays.stream(piles).max().getAsInt();
         int start = 1,end = max;
         while(start<end){
             int mid = (start+end)/2;
             int count = countHours(mid,piles);
             if(count<=h){
                 end = mid;
             }else{
                 start = mid+1;
             }
         }
         
         return start;
     }
 
     public int countHours(int mid,int[] piles){
         int count=0;
         for(int b:piles){
             count+= (b/mid);
             if(b%mid!=0)++count;
         }
         return count;
     }
     public static void main(String[] args) {
         Scanner io=new Scanner(System.in);
         int h=io.nextInt();
         int size=io.nextInt();
         int[] arr=new int[size];
         for(int i=0;i<size;i++)
         {
             arr[i]=io.nextInt();
         }
         kokoeatingbananas s=new kokoeatingbananas();
         System.out.println(s.minEatingSpeed(arr,h));
         io.close();
     }
}