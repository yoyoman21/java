/*Given an array of integers arr, a lucky integer is an integer which has a frequency in the array equal to its value.

Return a lucky integer in the array. If there are multiple lucky integers return the largest of them. If there is no lucky integer return -1.*/

import java.util.*;
public class luckyinteger {
    public int findLucky(int[] arr) {
        int[] a = new int[501];
        for(int i=0;i<arr.length;i++)
        {
            a[arr[i]]++;
        }
        int max=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(a[arr[i]]==arr[i])
                max = Math.max(max, arr[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=io.nextInt();
        }
        luckyinteger s=new luckyinteger();
        System.out.println(s.findLucky(arr));
        io.close();
    }
}
