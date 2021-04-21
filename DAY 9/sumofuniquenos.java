/*You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.*/

import java.util.Scanner;
public class sumofuniquenos {
    public int sumOfUnique(int[] nums) {
        
        int arr[] = new int[101];
            int sum = 0;
            for(int num:nums){
                arr[num]++;
            }
            
            for(int i = 1; i<arr.length; ++i){
                if(arr[i]==1) 
                {
                    sum=sum+i;
                }
            }
            
            return sum;
        }
        public static void main(String[] args) {
            Scanner io=new Scanner(System.in);
            int n=io.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=io.nextInt();
            }
            sumofuniquenos s=new sumofuniquenos();
            System.out.println(s.sumOfUnique(arr));
            io.close();
        }
}
