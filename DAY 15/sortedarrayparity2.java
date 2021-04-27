/*Given an array of integers nums, half of the integers in nums are odd, and the other half are even.

Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.

Return any answer array that satisfies this condition.*/

import java.util.Scanner;
public class sortedarrayparity2 {
    public static int[] sortArrayByParityII(int[] nums) {
        int[] sortedarray=new int[nums.length];
        int even=0;
        int odd=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                sortedarray[even]=nums[i];
                even=even+2;
            }
            else
            {
                sortedarray[odd]=nums[i];
                odd=odd+2;
            }
        }
        
        return sortedarray;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=io.nextInt();
        }
        int[] a=sortArrayByParityII(arr);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        io.close();
    }
}
