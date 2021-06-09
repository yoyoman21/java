/*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function. */

import java.util.Scanner;
public class sortcolors {
    public void sortColors(int[] nums) {
        int l=0,m=0,temp;
     int h=nums.length-1;

while(m<=h)

{
  switch (nums[m])
  {
     case 0:
     {
      temp=nums[m];
      nums[m]=nums[l];
      nums[l]=temp;
      l++;
      m++;
      break;
      }

      case 1: 
      {
      m++;
      break;   
      }
   
      case 2: 
      { 
      temp=nums[m];
      nums[m]=nums[h];
      nums[h]=temp;
      h--;
      break;
      }
    }
  } 
}
public static void main(String[] args) {
    Scanner io=new Scanner(System.in);
    int size=io.nextInt();
    int[] arr=new int[size];
    for(int i=0;i<size;i++)
    {
        arr[i]=io.nextInt();
    }
    sortcolors s=new sortcolors();
    s.sortColors(arr);
    io.close();
}  
}
