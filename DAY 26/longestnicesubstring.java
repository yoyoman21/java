/*A string s is nice if, for every letter of the alphabet that s contains, it appears both in uppercase and lowercase. For example, "abABB" is nice because 'A' and 'a' appear, and 'B' and 'b' appear. However, "abA" is not because 'b' appears, but 'B' does not.

Given a string s, return the longest substring of s that is nice. If there are multiple, return the substring of the earliest occurrence. If there are none, return an empty string.*/

import java.util.Scanner;
import java.util.ArrayList;
public class longestnicesubstring
{
    public boolean isNice(String s)
    {
        if(s.length()==1)
            return false;
        int len = s.length();
        for(int i=0; i<len; i++)
        {
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch))
            {
                if(!s.contains(Character.toLowerCase(ch)+""))
                    return false;
            }
            else
            {
                if(!s.contains(Character.toUpperCase(ch)+""))
                    return false;
            }
        }
        return true;
    }
    public String longestNiceSubstring(String s) 
    {
        ArrayList<String> list = new ArrayList<>();
        int len=s.length();
        if(len==1)
            return "";
        int h=0;
        for(int i=0; i<len; i++)
        {
            for(int j=i+1; j<=len; j++)
            {
                String sub = s.substring(i,j);
                if(isNice(sub))
                {
                    int subLen = sub.length();
                    if(subLen>h)
                    {
                        h=subLen;
                        list.clear();
                        list.add(sub);
                    }
                }
            }
        }
        if(list.size()==0)
            return "";
        else
            return list.get(0);
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String str=io.nextLine();
        longestnicesubstring s=new longestnicesubstring();
        System.out.println(s.longestNiceSubstring(str));
        io.close();
    }
}