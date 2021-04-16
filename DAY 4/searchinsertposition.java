/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.*/

import java.util.*;
public class searchinsertposition {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        while(i<=j)
        {
            int mid=(i+j)/2;
            
            if(target>nums[mid])
            {
                i=mid+1;
            }
            else if(target<nums[mid])
            {
                j=mid-1;
            }
            else
            {
               return mid;
            }
        }
        return i;
        
        
    }
    public static void main(String[] args)
    {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=io.nextInt();
        }
        int t=io.nextInt();
        searchinsertposition s=new searchinsertposition();
        System.out.println(s.searchInsert(arr,t));
        
        io.close();
    }
}
