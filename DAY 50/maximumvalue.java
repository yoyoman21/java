/*You are given three positive integers: n, index, and maxSum. You want to construct an array nums (0-indexed) that satisfies the following conditions:
nums.length == n
nums[i] is a positive integer where 0 <= i < n.
abs(nums[i] - nums[i+1]) <= 1 where 0 <= i < n-1.
The sum of all the elements of nums does not exceed maxSum.
nums[index] is maximized.
Return nums[index] of the constructed array.
Note that abs(x) equals x if x >= 0, and -x otherwise */

import java.util.Scanner;

public class maximumvalue {
    public int maxValue(int n, int index, int maxSum) {
        int l = 0; int h =maxSum;
        while(l < h){
            int mid = l + (h-l+1)/2;
            if(mid==0)
                return 0;
            if((getLsum(n,index,mid) + getRsum(n, index, mid)) > maxSum)
                h = mid-1;
            else
                l = mid;
        }
        return l;
    }
    
	// gives is the sum of elements from [ 0, i ]
    long getLsum(int n, int i, int k){ 
        return (i-k+1)>=0 ? (i-k+1) + ssum(k) : ssum(k) - ssum(k-i-1);
    }
    
	// gives the sum of index from [ i+1 , n-1 ]
    long getRsum(int n, int i, int k){
        return n-i>=k ? (n-i-k)+ssum(k-1): ssum(k-1) - ssum(k-n+i);
    }
    
    long ssum(int k){
        long kl = (long) k;
        return kl * (kl+1) / 2;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        int index=io.nextInt();
        int maxSum=io.nextInt();
        maximumvalue s=new maximumvalue();
        System.out.println(s.maxValue(n, index, maxSum));
        io.close();
    }
}
