/*Given a string s, return the longest palindromic substring in s.

 */
import java.util.*;
public class longestpanlindromesubstring {
    static void printsub(String s,int l,int h)
    {
        for(int i=l;i<=h;++i)
        {
            System.out.print(s.charAt(i));
        }
        
        
    }
public int longestPalindrome(String s) {
        int n=s.length();
        int len=1,start=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int flag=1;
                for(int k=0;k<(j-i+1)/2;k++)
                {
                    if(s.charAt(i+k)!=s.charAt(j-k))
                    {
                        flag=0;
                    }
                }
                if(flag!=0 && (j-i+1)>len)
                {
                    start=i;
                    len=j-i+1;
                }
            }
        }
       printsub(s,start,start+len-1);
       return len;
         
    }
    public static void main(String[] args)
    {
        Scanner io=new Scanner(System.in);
        String str=io.nextLine();
        longestpanlindromesubstring s=new longestpanlindromesubstring();
        s.longestPalindrome(str);
        
        io.close();
    }
}

