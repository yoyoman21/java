/*Given a positive integer num consisting only of digits 6 and 9.

Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).*/

import java.util.Scanner;
public class maximum69 {
    public int maximum69Number (int num) {
        int pos = 1; 
        int last =0;		
        for(int i=num; i>0;i=i/10){
            if(i%10==6)
            {
            last = pos;
            }
               pos++;
            
        }
        
        return num + (int)Math.pow(10, last-1)*3;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        maximum69 s=new maximum69();
        System.out.println(s.maximum69Number(n));
        io.close();
    }
}
