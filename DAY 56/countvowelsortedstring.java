/*Given an integer n, return the number of strings of length n that consist only of vowels (a, e, i, o, u) and are lexicographically sorted.
A string s is lexicographically sorted if for all valid i, s[i] is the same as or comes before s[i+1] in the alphabet.
 */

import java.util.Scanner;

public class countvowelsortedstring {
    public int countVowelStrings(int n) {
        int a=1,e=1,i=1,o=1,u=1,count=5,prev=0;
      for(int j=2;j<=n;j++){
          int temp=a;
          a=count-prev;
          prev+=temp;
          temp=e;
          e=count-prev;
          prev+=temp;
          temp=i;
           i=count-prev;
          prev+=temp;
          temp=o;
           o=count-prev;
          prev+=temp;
           u=count-prev;
          prev=0;
          count=a+e+i+o+u;
      }
      return count;
  }
  public static void main(String[] args) {
    Scanner io=new Scanner(System.in);
    int n=io.nextInt();
    countvowelsortedstring s=new countvowelsortedstring();
    System.out.println(s.countVowelStrings(n));
    io.close();
  }
}
