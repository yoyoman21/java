/*Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.*/

import java.util.*;
public class countmissingno {
 
     public int missingno(int[] no)
     {
        int count = no.length;
        
        for(int i=0;i<no.length;i++){
            count=count+i;
            count=count-no[i];
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
       countmissingno s=new countmissingno();
       System.out.println(s.missingno(arr));
       io.close();
    }


}
