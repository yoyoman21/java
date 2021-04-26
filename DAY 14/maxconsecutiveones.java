/*Given a binary array nums, return the maximum number of consecutive 1's in the array.*/

import java.util.Scanner;
public class maxconsecutiveones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxcount=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count++;
                if(count>maxcount)
                {
                    maxcount=count;
                }
                
            }
            else
            {
                count=0;
            }
            
    }
        return maxcount;
}
 public static void main(String[] args) {
     Scanner io=new Scanner(System.in);
    int size=io.nextInt();
    int[] arr=new int[size];
    for(int i=0;i<size;i++)
    {
       arr[i]=io.nextInt();
    }
    maxconsecutiveones s=new maxconsecutiveones();
    System.out.println(s.findMaxConsecutiveOnes(arr));
    io.close();
 }
}
