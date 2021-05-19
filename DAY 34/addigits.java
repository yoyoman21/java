/*Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

 */

import java.util.Scanner;

public class addigits
{
    public int addDigits(int num) {
        int res = -1;
        String s = "" + num;
        while(s.length() > 1 || res < 0){
            res = 0;
            for(int i = 0; i < s.length(); i++){
                res += s.charAt(i) - '0';
            }
            s = "" + res;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        addigits s=new addigits();
        System.out.println(s.addDigits(n));
        io.close();
    }
}