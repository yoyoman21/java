/*Given an array nums of 0s and 1s and an integer k, return True if all 1's are at least k places away from each other, otherwise return False.*/

import java.util.Scanner;
public class all1arekdistanceaway{

    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length;
        boolean f=false;
        int dis=0;
        for(int i=0; i<n; i++)
        {
            if(nums[i]==1)
            {
                if(i!=0 && f)
                {
                    if(dis<k)
                    {
                        return false;
                    }
                }
                dis=0;
                if(!f)
                {
                    f=true;
                }
            }
            else
            {
                if(f)
                {
                    dis++;
                }
            }
        }
        return true;
        
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
                int k=io.nextInt();
                all1arekdistanceaway s=new all1arekdistanceaway();
                System.out.println(s.kLengthApart(arr, k));
                io.close();
            }

}