/*Given an integer num, find the closest two integers in absolute difference whose product equals num + 1 or num + 2.

Return the two integers in any order*/

import java.util.Scanner;

public class closestdivisor
{
    public int[] closestDivisors(int num) {
        int num1= 0, num2= 0;
        int v1= num+1, v2= num+2;
        for(int i= (int)Math.sqrt(v1); i>=0; i--){
            if(v1%i==0){
                num1= i; num2= v1/i;
                break;
            }
        }
        for(int i= (int)Math.sqrt(v2); i>=0; i--){
            if(v2%i==0){
                int num3= i, num4= v2/i;
                if(Math.abs(num3-num4)<Math.abs(num1-num2)){
                    num1= num3; num2= num4;
                } 
                break;
            }
        }
        return new int[]{num1,num2};
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        closestdivisor s=new closestdivisor();
        System.out.println(s.closestDivisors(n));
        io.close();
    }
}