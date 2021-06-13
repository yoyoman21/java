/*Given an array nums of distinct integers, return all the possible permutations. 
You can return the answer in any order. */

import java.util.*;
public class permutations{
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        fun(0, ans, nums);
        return ans;
    }
    public void fun(int index, List<List<Integer>> ans, int[] nums){
        if(index==nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(i, index, nums);
            fun(index+1, ans, nums);
            swap(i, index, nums);
            
        }
    }
    public void swap(int i, int j, int[] nums){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
        int[] nums=new int[size];
        for(int i=0;i<size;i++)
        {
            nums[i]=io.nextInt();
        }
        permutations s=new permutations();
        System.out.println(s.permute(nums));
        io.close();
    }
}