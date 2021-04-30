/*Given an alphanumeric string s, return the second largest numerical digit that appears in s, or -1 if it does not exist.

An alphanumeric string is a string consisting of lowercase English letters and digits.*/

import java.util.Scanner;
public class secondlargestdigit {
    public int secondHighest(String s) {
        boolean[] count = new boolean[10];
       for (int i = 0; i < s.length(); ++ i)
           if (Character.isDigit(s.charAt(i)))
               count[Character.getNumericValue(s.charAt(i))] = true;
       boolean maxFound = false;
       for (int i = count.length - 1; i >= 0; --i){
           if (count[i] && !maxFound){
               maxFound = true;
               continue;
           }
           if(maxFound && count[i]) return i;
       }
       return -1;
   }
   public static void main(String[] args) {
    Scanner io=new Scanner(System.in);
    String w=io.nextLine();
    secondlargestdigit s=new secondlargestdigit();
    System.out.println(s.secondHighest(w));
    io.close();
   }
}
