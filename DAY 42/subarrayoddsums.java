/* Given an array of integers arr. Return the number of sub-arrays with odd sum.

As the answer may grow large, the answer must be computed modulo 10^9 + 7.*/

import java.util.Scanner;

public class subarrayoddsums{
    public int numOfSubarrays(int[] arr) {
        int sum= 0;
        long oddSum= 0, even=1, odd=0;
        for(int i=0; i<arr.length; i++){
            sum= (sum + arr[i]) % 2;
            if(sum % 2 == 0){
                oddSum= (oddSum + odd )%1000000007;
                even++;
            }else{
                oddSum= (oddSum + even) % 1000000007;
                odd++;
            }
        }
        return (int)oddSum;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
        int[] a=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=io.nextInt();
        }
        subarrayoddsums s=new subarrayoddsums();
        System.out.println(s.numOfSubarrays(a));
        io.close();
    }
}