/*Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array*/

import java.util.Scanner;
public class smallercurrentno {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr=new int[nums.length];
        
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                
                if(nums[j]<nums[i] && j!=i)
                {
                    count++;
                }
            }
            arr[i]=count;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=io.nextInt();
        }
        int[] a=smallerNumbersThanCurrent(arr);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        io.close();
    }
}
