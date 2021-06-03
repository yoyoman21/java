/* Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and uses only constant extra space.*/
import java.util.*;

public class duplicatenumber {
    public int findDuplicate(int[] nums) {
        if(nums.length == 0){
        return 0;
    }
    
    Arrays.sort(nums);        
    int k =1,result = 0;
    
    for(int i =0;i<nums.length-1; i++){
                      
        if(nums[i] == nums[k]){               
            result = nums[i];
            break;
        }
             k++;
    }
    
    return result;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=io.nextInt();
        }
       duplicatenumber s=new duplicatenumber();
       System.out.println(s.findDuplicate(arr));
       io.close();
    }
}
