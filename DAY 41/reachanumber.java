/*You are standing at position 0 on an infinite number line. There is a goal at position target.

On each move, you can either go left or right. During the n-th move (starting from 1), you take n steps.

Return the minimum number of steps required to reach the destination.*/
import java.util.Scanner;

public class reachanumber {
    public int reachNumber(int target) {
        int count = 0;
       int cur = 0;
       target = Math.abs(target);
       while (cur < target || (cur - target) % 2 == 1) {
           count++;
           cur += count;
       }
       return count;
       
   }
   public static void main(String[] args) {
       Scanner io=new Scanner(System.in);
       int target=io.nextInt();
       reachanumber s=new reachanumber();
       System.out.println(s.reachNumber(target));
       io.close();
   }
}
