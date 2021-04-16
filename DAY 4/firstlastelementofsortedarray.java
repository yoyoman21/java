/*iven an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].*/

import java.util.*;
public class firstlastelementofsortedarray {
    public static int[] searchRange(int[] nums, int target) {
       
        int flag=1;
        int same=0;
        if(nums.length==0)
        {
            return new int[] {-1,-1};
        }
        if(nums.length==1 && nums[0]!=target)
        {
            return new int[] {-1,-1};
        }
        
        
        for(int i=0;i<nums.length;i++)
        {
            int first=nums[0];
           
              if(nums[i]!=first )
                {
                    same=1;
                }
        }
        if(same==0 && nums[0]==target)
        {
            return new int[] {0,nums.length-1};
        }
        for(int i=0;i<nums.length;i++)
        {
            
         for(int j=i+1;j<nums.length;j++)
            {
                
            if(nums[i]==target && nums[j]==target)
            {
                flag=0;
                return new int[] {i,j};
            }
                
            }
                if(nums[i]==target)
                {
                    return new int[] {i,i};
                }
            
         }
        if(flag==1)
        {
            return new int[] {-1,-1};
        }
        return new int [] {};
        
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
        firstlastelementofsortedarray s=new firstlastelementofsortedarray();
    
        int[] index=searchRange(arr,t);
        if(index.length==2)
        {
            System.out.println(index[0]+" "+index[1]);
        }
        io.close();
    }
}
