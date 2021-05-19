/*Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).*/

import java.util.Scanner;

public class countodd {
    public int countOdds(int low, int high) {
        int total = (high - low)/2;
    
        if(low%2 != 0 || high%2 != 0){
            total++;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int h=io.nextInt();
        int l=io.nextInt();
        countodd s=new countodd();
        System.out.println(s.countOdds(l,h));
        io.close();
    }
}
