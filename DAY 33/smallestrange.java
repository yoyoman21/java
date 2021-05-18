/*iven an array nums of integers, for each integer nums[i] we may choose any x with -k <= x <= k, and add x to nums[i].

After this process, we have some array result.

Return the smallest possible difference between the maximum value of result and the minimum value of result*/
import java.util.Scanner;

public class smallestrange{
public int smallestRangeI(int[] nums, int k) {
    int max=nums[0];
    int min=nums[0];
    for(int i=1;i<nums.length;i++){
        max=Math.max(max,nums[i]);
        min=Math.min(min,nums[i]);
    }
    return Math.max(0,max-min-2*(k));
}
  public static void main(String[] args) {
      Scanner io=new Scanner(System.in);
      int size=io.nextInt();
      int[] arr=new int[size];
      for(int i=0;i<size;i++)
      {
          arr[i]=io.nextInt();
      }
      int k=io.nextInt();
      smallestrange s=new smallestrange();
      System.out.println(s.smallestRangeI(arr,k));
      io.close();
  }
}