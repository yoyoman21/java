/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".*/

import java.util.*;
public class longestprefix {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        if(n==0)
        {
            return "";
        }
        String min=getMinString(strs);
        int minlen=min.length();
        for(int i=0;i<strs.length;i++)
        {
            int j;
            for(j=0;j<minlen;j++)
            {
                if(min.charAt(j)!=strs[i].charAt(j))
                    break;
            }
            if(j<minlen)
            {
                minlen=j;
            }
        }
        return min.substring(0,minlen);
    }
    public static String getMinString(String[] strs)
    {
        String m=strs[0];
        for(int i=1;i<strs.length;i++)
        {
            if(strs[i].length()<m.length())
            {
                m=strs[i];
            }
        }
        return m;
    }
    public static void main(String[] args)
    {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
        String [] arr=new String[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=io.next();
        }
        longestprefix s=new longestprefix();
        System.out.println(s.longestCommonPrefix(arr));
        io.close();
    }
}
