/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.*/

 
import java.util.*;
public class duplicate {
    public boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    return true;
                }
            }
            
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=io.nextInt();
        }
      
        duplicate s=new duplicate();
        System.out.println(s.containsDuplicate(arr));
        io.close();
    }
}
