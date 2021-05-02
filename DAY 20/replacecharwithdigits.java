/*You are given a 0-indexed string s that has lowercase English letters in its even indices and digits in its odd indices.

There is a function shift(c, x), where c is a character and x is a digit, that returns the xth character after c.

For example, shift('a', 5) = 'f' and shift('x', 0) = 'x'.
For every odd index i, you want to replace the digit s[i] with shift(s[i-1], s[i]).

Return s after replacing all digits. It is guaranteed that shift(s[i-1], s[i]) will never exceed 'z'*/

import java.util.Scanner;
public class replacecharwithdigits
{
    public String replaceDigits(String s) {
        char[] charArray = s.toCharArray();
		for(int i = 1; i<charArray.length; i = i + 2) {
		  charArray[i] = (char) (charArray[i - 1] + charArray[i] - '0');
		}
		return String.valueOf(charArray);
    }
    public static void main(String[] args)
    {
       Scanner io=new Scanner(System.in);
       String str=io.nextLine();
       replacecharwithdigits s=new replacecharwithdigits();
       System.out.println(s.replaceDigits(str));
       io.close();
    }
}
        
    
        