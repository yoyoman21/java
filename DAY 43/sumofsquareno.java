/*Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c. */
import java.util.Scanner;

public class sumofsquareno {
    public boolean judgeSquareSum(int c) {
        for(int b = 0; b <= Math.sqrt(c); b++){
        int diff = (c - b*b);
        double a = Math.sqrt(diff);
        if(Math.ceil(a) == Math.floor(a)) return true;   
   
    }
         return false;
}
 public static void main(String[] args) {
     Scanner io=new Scanner(System.in);
     int n=io.nextInt();
     sumofsquareno s=new sumofsquareno();
     System.out.println(s.judgeSquareSum(n));
     io.close();
 }
}
