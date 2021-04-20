/*Given two integer arrays startTime and endTime and given an integer queryTime.

The ith student started doing their homework at the time startTime[i] and finished it at time endTime[i].

Return the number of students doing their homework at time queryTime. More formally, return the number of students where queryTime lays in the interval [startTime[i], endTime[i]] inclusive.*/

import java.util.Scanner;
public class studentshomework {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count=0;
        for(int i=0;i<startTime.length;i++)
        {
            int a=startTime[i];
            int b=endTime[i];
            if(a<=queryTime && queryTime<=b)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=io.nextInt();
        }
        int[] arr1=new int[size];
        for(int i=0;i<size;i++)
        {
            arr1[i]=io.nextInt();
        }
        int t=io.nextInt();
        studentshomework s=new studentshomework();
        System.out.println(s.busyStudent(arr, arr1, t));
        io.close();
    }
}
