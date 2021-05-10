/*Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().*/

import java.util.Scanner;

public class implementstrstr {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)
        {
            return 0;
        }
        for(int i=0;i<haystack.length();i++)
        {
            if(i+needle.length()>haystack.length())
                return -1;
            
            int m=i;
            for(int j=0;j<needle.length();j++)
            {
                if(needle.charAt(j)==haystack.charAt(m)){
                    if(j==needle.length()-1)
                        return i;
                        m++;
                }
                else{
                    break;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String w=io.nextLine();
        String v=io.nextLine();
        implementstrstr s=new implementstrstr();
        System.out.println(s.strStr(w,v));
        io.close();
    }
}
