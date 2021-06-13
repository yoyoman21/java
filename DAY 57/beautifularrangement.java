/* Suppose you have n integers labeled 1 through n. A permutation of those n integers perm (1-indexed) is considered a beautiful arrangement if for every i (1 <= i <= n), either of the following is true:
perm[i] is divisible by i.
i is divisible by perm[i].
Given an integer n, return the number of the beautiful arrangements that you can construct.*/

import java.util.Scanner;

public class beautifularrangement {
    int count=0;
    public int countArrangement(int n) {
         if(n<4) return n;
        int[]nums=new int[n+1];
        for (int i = 0; i <= n; i++) {
			nums[i]=i;
		}
        dfs(1,nums);
        return count; 
    }
    public void dfs(int start,int[] nums){
        if(start==nums.length){
            count++;
            return;
        }
        for(int i=start;i<nums.length;i++){
        	swap(nums,start,i);
            if(nums[start]%start==0 || start%nums[start]==0){
                dfs(start+1,nums);
            }
        	swap(nums,i,start);
	
        }
    }
    public void swap(int[] nums, int start, int i) {
		int temp=nums[start];
		nums[start]=nums[i];
		nums[i]=temp;
	}
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        beautifularrangement s=new beautifularrangement();
        System.out.println(s.countArrangement(n));
        io.close();
    }
}
