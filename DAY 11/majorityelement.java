/*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array*/

import java.util.Scanner;
public class majorityelement {
    public int majorityElement(int[] nums) {
        int majority=nums[0];
    int count=1;
    for(int i=1;i<nums.length;i++)
    {
        if(nums[i]!=majority)
        {
            count=count-1;
            
        }
        else
            
        {
            count=count+1;
        }
        if(count==0)
        {
            majority=nums[i];
            count++;
        }
    }
   return majority;
        }
        public static void main(String[] args) 
        {
          Scanner io=new Scanner(System.in);
          int n=io.nextInt();
          int[] arr=new int[n];
          for(int i=0;i<n;i++)
          {
              arr[i]=io.nextInt();
          }
          majorityelement s=new majorityelement();
          System.out.println(s.majorityElement(arr));
          io.close();    
        }
}
