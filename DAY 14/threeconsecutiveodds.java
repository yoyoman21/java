/*Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.*/

import java.util.Scanner;
public class threeconsecutiveodds {
    public boolean threeConsecutiveOdds(int[] arr)
    {
        
        if(arr.length<3)
        {
            return false;
        }
        
        for(int i=0;i<arr.length-2;i++)
        {
            if(arr[i]%2!=0 && arr[(i+1)]%2!=0 && arr[(i+2)]%2!=0)
            {
               return true;
                
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
                int[] arr=new int[size];
                for(int i=0;i<size;i++)
                {
                   arr[i]=io.nextInt();
                }
                threeconsecutiveodds s=new threeconsecutiveodds();
                System.out.println(s.threeConsecutiveOdds(arr));
                io.close();
    }
}
