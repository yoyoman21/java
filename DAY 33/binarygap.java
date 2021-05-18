/*Given a positive integer n, find and return the longest distance between any two adjacent 1's in the binary representation of n. If there are no two adjacent 1's, return 0.

Two 1's are adjacent if there are only 0's separating them (possibly no 0's). The distance between two 1's is the absolute difference between their bit positions. For example, the two 1's in "1001" have a distance of 3.

 */
import java.util.Scanner;

public class binarygap {
    public int binaryGap(int n) {
        boolean num= true;
        int max=0, distance=0;
        while(n > 0){
            distance++;
            if(n % 2 == 1){
                if(distance>max && !num)
                    max= distance;
                    num=false;
                    distance = 0;
            }
            n=n/2;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        binarygap s=new binarygap();
        System.out.println(s.binaryGap(n));
        io.close();
    }
}
