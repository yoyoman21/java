/*A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

Also, a self-dividing number is not allowed to contain the digit zero.

Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.*/

import java.util.Scanner;
import java.util.*;
public class selfdidvidingno {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> no=new ArrayList<>();
        for(int i = left; i <= right; i++) {
            if(isSelfDividing(i)) no.add(i);
        }
        return no;
    }
    
    public boolean isSelfDividing(int num) {
        int n = num;
        while(num > 0) {
            int digit = num % 10;
            if(digit == 0 || n % digit != 0) return false;
            num /= 10;
        }
        return true;
}
public static void main(String[] args) {
    Scanner io=new Scanner(System.in);
    int l=io.nextInt();
    int r=io.nextInt();
    selfdidvidingno s=new selfdidvidingno();
    System.out.println(s.selfDividingNumbers(l,r));
    io.close();
}
}
