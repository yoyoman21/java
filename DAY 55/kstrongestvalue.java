/* Given an array of integers arr and an integer k.
A value arr[i] is said to be stronger than a value arr[j] if |arr[i] - m| > |arr[j] - m| where m is the median of the array.
If |arr[i] - m| == |arr[j] - m|, then arr[i] is said to be stronger than arr[j] if arr[i] > arr[j].
Return a list of the strongest k values in the array. return the answer in any arbitrary order.
Median is the middle value in an ordered integer list. More formally, if the length of the list is n, the median is the element in position ((n - 1) / 2) in the sorted list (0-indexed).*/
import java.util.*;
public class kstrongestvalue{
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);    
        int median_index = (arr.length-1)/2;
        int median = arr[median_index];
        int [] result = new int[k];
        
        for(int i=0, j=arr.length-1, x=0; x<k; x++) {
            if(Math.abs(arr[i]-median) <= Math.abs(arr[j]-median)) {
                result[x] = arr[j--];
            } else {
                result[x] = arr[i++];
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=io.nextInt();
        }
        int k=io.nextInt();
        kstrongestvalue s=new kstrongestvalue();
        System.out.println(s.getStrongest(arr, k));
        io.close();
    }
}
