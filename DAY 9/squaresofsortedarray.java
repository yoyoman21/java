/*Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.*/

import java.util.*;
public class squaresofsortedarray {
    public static int[] sortedSquares(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i]*nums[i];
        }
        Arrays.sort(arr);
        return arr;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=io.nextInt();
        }
        int[] a=sortedSquares(arr);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");

        }
        io.close();
    }
}
