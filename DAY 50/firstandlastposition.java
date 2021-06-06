/*Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity. */

import java.util.Scanner;
public class firstandlastposition {
    public int findFirst(int []nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length -1;
        
        while(start <= end){
            int mid  = (start + end) / 2;
            
            if(nums[mid] >= target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
            if(nums[mid] == target){
                index = mid;
            }
        }
        return index;
    }
    
        public int findLast(int []nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length -1;
        
        while(start <= end){
            int mid  = (start + end) / 2;
            if(nums[mid] <= target){
                 start = mid + 1;
            }else{
                end = mid - 1;
            }
            if(nums[mid] == target){
                index = mid;
            }
        }
        return index;
    }
    
    public int[] searchRange(int[] nums, int target) {
      
         int[] result = new int[2];
    result[0] = findFirst(nums, target);
    result[1] = findLast(nums, target);
    return result;
        }
        public static void main(String[] args) {
            Scanner io=new Scanner(System.in);
            int n=io.nextInt();
            int[] arr=new int[n];
            int t=io.nextInt();
            for(int i=0;i<n;i++)
            {
                arr[i]=io.nextInt();
            }
          firstandlastposition s=new firstandlastposition();
          System.out.println(s.searchRange(arr,t));
          io.close();
        }
}
