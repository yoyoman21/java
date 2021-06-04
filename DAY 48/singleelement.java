/* You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once. Find this single element that appears only once.

Follow up: Your solution should run in O(log n) time and O(1) space.*/

import java.util.Scanner;

public class singleelement {
    public int singleNonDuplicate(int[] nums) {
        
        for(int i=0;i<nums.length;i=i+2)
        {
            if(i+1<nums.length && nums[i]!=nums[i+1])
                return nums[i];
            
        }
        return nums[nums.length-1];
        
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=io.nextInt();
        }
        singleelement s=new singleelement();
        System.out.println(s.singleNonDuplicate(arr));
        io.close();
    }
}
