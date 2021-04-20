/*Given an array nums of integers, return how many of them contain an even number of digits.
 */

import java.util.Scanner;
public class evendigits
{
    public int findNumbers(int[] nums) {
    int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int a=String.valueOf(nums[i]).length();
            if(a%2==0)
            {
                count++;
            } 
        }
        return count;
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
        evendigits s=new evendigits();
        System.out.println(s.findNumbers(arr));
        io.close();
    }
}