/*Given an integer n, return a string with n characters such that each character in such string occurs an odd number of times.

The returned string must contain only lowercase English letters. If there are multiples valid strings, return any of them.*/

import java.util.Scanner;
public class generatestringwithoddcounts {
public String generateTheString(int n) {
    String w="";
      if(n%2!=0)
      {
          for(int i=0;i<n;i++)
          {
          w=w+'a';
          }
      }   
      else
      {
          for(int i=0;i<n-1;i++)
          {
              w=w+'a';
          }
          w=w+'b';
      }
  return w;
}
   public static void main(String[] args) {
       Scanner io=new Scanner(System.in);
       int n=io.nextInt();
       generatestringwithoddcounts s=new generatestringwithoddcounts();
       System.out.println(s.generateTheString(n));
       io.close();
   }
}
