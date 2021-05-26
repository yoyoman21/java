/* Given an integer array nums, return the sum of divisors of the integers in that array that have exactly four divisors.

If there is no such integer in the array, return 0.*/

import java.util.Scanner;

public class fourdivisors {
    public int sumFourDivisors(int[] nums) {
        int count=0,sum=0,total=0;
         for(int i=0;i<nums.length;i++){
             for(int j=2;j<=nums[i]/2;j++){
                 if(nums[i]%j==0){
                     count++;
                     sum+=j;
                 }
                 if(count>2)
                     break;
             }
             if(count==2){
                 total+=sum;
                 total+=(1+nums[i]);
             }   
             count=0;
             sum=0;
            }
             return total;
         }
      public static void main(String[] args) {
          Scanner io=new Scanner(System.in);
          int size=io.nextInt();
          int[] arr=new int[size];
          for(int i=0;i<size;i++){
              arr[i]=io.nextInt();
          }
          fourdivisors s=new fourdivisors();
          System.out.println(s.sumFourDivisors(arr));
          io.close();
      }   
}
