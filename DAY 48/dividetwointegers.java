/* Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.
Return the quotient after dividing dividend by divisor.
The integer division should truncate toward zero, which means losing its fractional part. For example, truncate(8.345) = 8 and truncate(-2.7335) = -2.
Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, assume that your function returns 231 − 1 when the division result overflows.
*/

import java.util.Scanner;

public class dividetwointegers {
    public int divide(int dividend, int divisor) {
    if (divisor == -1 && dividend == Integer.MIN_VALUE)
    return Integer.MAX_VALUE;
return (int) dividend / divisor;
}
public static void main(String[] args) {
    Scanner io=new Scanner(System.in);
    int d1=io.nextInt();
    int d2=io.nextInt();
    dividetwointegers s=new dividetwointegers();
    System.out.println(s.divide(d1,d2));
    io.close();
}
}
