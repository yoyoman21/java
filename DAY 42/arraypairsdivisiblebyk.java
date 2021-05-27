/* Given an array of integers arr of even length n and an integer k.

We want to divide the array into exactly n / 2 pairs such that the sum of each pair is divisible by k.

Return True If you can find a way to do that or False otherwise.

*/
import java.util.Scanner;

public class arraypairsdivisiblebyk {
    public boolean canArrange(int[] arr, int k) {
        int n = arr.length;
        int[] remainder = new int[k];
        for(int i = 0; i < n; i++) {
            int num = arr[i] % k;
            if(num < 0) remainder[Math.abs(num)]--;
            else remainder[num]++;
        }
        if(remainder[0] % 2 != 0) return false; 
        for(int i = 1, j = k-1; i <= j; i++, j--) {
            if(remainder[i] != remainder[j]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int k=io.nextInt();
        int size=io.nextInt();
        int[]arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=io.nextInt();

        }
         arraypairsdivisiblebyk s=new arraypairsdivisiblebyk();
         System.out.println(s.canArrange(arr, k));
        io.close();
    
    }
}
