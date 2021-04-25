/*Given an integer array arr, return the mean of the remaining integers after removing the smallest 5% and the largest 5% of the elements.

Answers within 10-5 of the actual answer will be considered accepted.*/

import java.util.Scanner;
public class meanofarray {
    public double trimMean(int[] arr) {
        int l = (int)(arr.length * 0.05);
        Arrays.sort(arr);
        
        double f = 0.0;
        for(int i = l; i < arr.length - l; i++){
            
            f=f+arr[i];
        }

       return f / (arr.length - (l * 2));
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=io.nextInt();
        }
        meanofarray s=new meanofarray();
        System.out.println(s.trimMean(arr));
        io.close();
    }
}
