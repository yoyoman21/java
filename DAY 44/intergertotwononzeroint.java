/*Given an integer n. No-Zero integer is a positive integer which doesn't contain any 0 in its decimal representation.
Return a list of two integers [A, B] where:
A and B are No-Zero integers.
A + B = n
It's guarateed that there is at least one valid solution. If there are many valid solutions you can return any of them. */
import java.util.Scanner;

public class intergertotwononzeroint{
   public static boolean hasZero(int num){
        while(num>0){
            if(num%10==0)
                return true;
            num/=10;
        }
        return false;
    }
    public static int[] getNoZeroIntegers(int n) {
        int i=1;
        
        while(i<=n){
            if(hasZero(i) || hasZero(n-i))
               i++;
            else
                return new int[]{i,n-i}; 
        }
        return new int[]{-1,-1}; 
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        int[] no=getNoZeroIntegers(n);
        System.out.println(no[0]+" "+no[1]);
        io.close();
    }
}