/*Given a string s, return the length of the longest substring between two equal characters, excluding the two characters. If there is no such substring return -1.

A substring is a contiguous sequence of characters within a string.*/

import java.util.Scanner;
public class largestsubstring {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max = -1;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int j = s.lastIndexOf(ch);
            max = Math.max(max, j-i-1);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String str=io.nextLine();
        largestsubstring s=new largestsubstring();
        System.out.println(s.maxLengthBetweenEqualCharacters(str));
        io.close();
    }
}
