/*Given a string s of lower and upper case English letters.

A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where:

0 <= i <= s.length - 2
s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa.
To make the string good, you can choose two adjacent characters that make the string bad and remove them. You can keep doing this until the string becomes good.

Return the string after making it good. The answer is guaranteed to be unique under the given constraints.

Notice that an empty string is also good.*/

import java.util.Scanner;

public class greatstring {
    public String makeGood(String s) {
        StringBuilder sb=new StringBuilder();
            
          for(int i = 0; i < s.length(); i++){
if(sb.length() == 0 || Math.abs((sb.charAt(sb.length() - 1) - s.charAt(i))) != 32) 
        {
                sb.append(s.charAt(i));
         }
            else{
                sb.deleteCharAt(sb.length() - 1);
                }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String str=io.nextLine();
        greatstring s=new greatstring();
        System.out.println(s.makeGood(str));
        io.close();
    }
}
