/* Given an integer n, return true if it is possible to represent n as the sum of distinct powers of three. Otherwise, return false.

An integer y is a power of three if there exists an integer x such that y == 3x*/
import java.util.Scanner;

public class checkifnumberispowerofthree {
    public boolean checkPowersOfThree(int n) {
        int x = n;
        while(x != 0){
            if(x % 3 == 2)
                return false;
            x = x / 3;
        }
        
        return true;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        checkifnumberispowerofthree s=new checkifnumberispowerofthree();
        System.out.println(s.checkPowersOfThree(n));
        io.close();
    }
}
