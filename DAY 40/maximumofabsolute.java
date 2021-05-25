/*Given two arrays of integers with equal lengths, return the maximum value of:

|arr1[i] - arr1[j]| + |arr2[i] - arr2[j]| + |i - j|

where the maximum is taken over all 0 <= i, j < arr1.length*/

import java.util.Scanner;

public class maximumofabsolute
{
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int len = arr1.length;
        int[] first_util = {1, 1 , 1, 1};
        int[] sec_util =   {1, 1 ,-1,-1};
        int[] third_util = {1, -1, 1,-1};
        int ans = 0;
        for(int i = 0; i < 4; i++) {
            int f = first_util[i], s = sec_util[i], t = third_util[i];
            int max_val = Integer.MIN_VALUE, min_val = Integer.MAX_VALUE;
            for(int j = 0; j < len; j++) {
                int val = arr1[j]*f + arr2[j]*s + j*t;
                max_val = Math.max(max_val, val);
                min_val = Math.min(min_val, val);
            }
            ans = Math.max(ans, max_val - min_val);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
        int[] a1=new int[size];
        int[] a2=new int[size];
        for(int i=0;i<size;i++)
        {
            a1[i]=io.nextInt();
            a2[i]=io.nextInt();
        }
        maximumofabsolute s=new maximumofabsolute();
        System.out.println(s.maxAbsValExpr(a1,a2));
        io.close();
    }
}