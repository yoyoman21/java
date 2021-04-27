/*Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.*/

import java.util.Scanner;
public class removeelement {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int left = 0;
        int right = 0;
        while (right < length) {
            while (nums[right] == val) {
                right++;
                if (right == length) {
                    return left;
                }
            }
            nums[left] = nums[right];
            left++;
            right++;
        }
        return left;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=io.nextInt();
        }
        int val=io.nextInt();
        removeelement s=new removeelement();
        System.out.println(s.removeElement(arr, val));
        io.close();
    }
}
