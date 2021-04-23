/*Given an integer n, return any array containing n unique integers such that they add up to 0.
*/
 
import java.util.Scanner;
public class uniqueintergerssumzero {
    public static int[] sumZero(int n) {
        int[] arr=new int[n];
        int num=n/2;
        int i=0;
        while(i<n/2)
        {
            arr[i++]=num*(-1);
            num--;
        }
        if(n%2!=0)
        {
            arr[i++]=0;
        }
        num=n/2;
        while(i<n)
        {
            arr[i++]=num;
            num--;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
     int[] a=sumZero(n);
     for(int i=0;i<a.length;i++)
     {
         System.out.print(a[i]+" ");
     }
     io.close();
    }
}
