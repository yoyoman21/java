/*Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.

He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday, he will put in $1 more than the day before. On every subsequent Monday, he will put in $1 more than the previous Monday.
Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.*/

import java.util.Scanner;

public class calmoney {
    public int totalMoney(int n) {
        int row = n/7;
        int col = n%7;
        return row*(1+7)*7/2 + 7*(row - 1)*row/2 + (1 + col)*col/2 + row*col;
}
  public static void main(String[] args) {
      Scanner io=new Scanner(System.in);
      int n=io.nextInt();
      calmoney s=new calmoney();
      System.out.println(s.totalMoney(n));
      io.close();
  }
}
