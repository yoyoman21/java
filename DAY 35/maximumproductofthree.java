/*Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

 */

import java.util.Scanner;
import java.util.Arrays;
public class maximumproductofthree {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
       int n = nums.length;
       int pos1 = nums[n-3] * nums[n-2] * nums[n-1]; 
       int pos2 = nums[0] * nums[1] * nums[n-1]; 
       return Math.max(pos1, pos2);
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=io.nextInt();
        }
        maximumproductofthree s=new maximumproductofthree();
        System.out.println(s.maximumProduct(arr));
        io.close();
    }
}
