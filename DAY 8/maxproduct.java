/*Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).*/

import java.util.Scanner;
public class maxproduct {
    public int maxProduct(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int a=(nums[i]-1)*(nums[j]-1);
                if(max<a)
                {
                    max=a;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=io.nextInt();
        }
        maxproduct s=new maxproduct();
        System.out.println(s.maxProduct(arr));
        io.close();
    }
}
