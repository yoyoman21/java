/*Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).

More formally check if there exists two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]*/

import java.util.Scanner;
 public class nanditsdouble {
    public boolean checkIfExist(int[] arr) {
       
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j)
                {
                    if(arr[i]==2*arr[j])
                    {
                        return true;
                    }
                }
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
    nanditsdouble s=new nanditsdouble();
    System.out.println(s.checkIfExist(arr));
    io.close();
    }
}
