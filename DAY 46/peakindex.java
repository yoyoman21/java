/*Let's call an array arr a mountain if the following properties hold:
arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... arr[i-1] < arr[i]
arr[i] > arr[i+1] > ... > arr[arr.length - 1]
Given an integer array arr that is guaranteed to be a mountain, return any i such that arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1]. */

import java.util.Scanner;

public class peakindex{
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0 , right = arr.length - 1 , mid ;
        while( left < right )
        {
            mid = left + ( right - left ) / 2 ;
            if( arr[mid] < arr[mid + 1] )
            {
                left = mid + 1 ;                
            }
            else
            {
                right = mid ;
            }
        }
        return left ;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=io.nextInt();
        }
        peakindex s=new peakindex();
        System.out.println(s.peakIndexInMountainArray(arr));
        io.close();
    }
}