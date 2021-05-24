/*On a broken calculator that has a number showing on its display, we can perform two operations:

Double: Multiply the number on the display by 2, or;
Decrement: Subtract 1 from the number on the display.
Initially, the calculator is displaying the number x.

Return the minimum number of operations needed to display the number y.*/

import java.util.Scanner;

public class brokencalculator {
    public int brokenCalc(int x, int y){
    int count=0;
        
        while(y>x)
        {
            count++;
            if(y%2==0)
            {
                y=y/2;
            }
            else
            {
                y=y+1;
            }
        }
        return count+(x-y);
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n1=io.nextInt();
        int n2=io.nextInt();
        brokencalculator s=new brokencalculator();
        System.out.println(s.brokenCalc(n1,n2));
        io.close();
    }
}
