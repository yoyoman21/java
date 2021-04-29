/*Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, and all letters reverse their positions*/

import java.util.Scanner;
public class reverseonlyletters {
    public String reverseOnlyLetters(String s) {
        char ss[]=s.toCharArray();
        int l=0,r=s.length()-1;
        while(l<=r)
        {
            if(Character.isAlphabetic(ss[l]) && Character.isAlphabetic(ss[r]) )
            {
                char t=ss[l];
                ss[l]=ss[r];
                ss[r]=t;
                l++;
                r--;
            }
           else if(Character.isAlphabetic(ss[l]) && !Character.isAlphabetic(ss[r]) )
           {
                r--;
           }
            else
            {
                l++;
            }
        }
      
       return String.valueOf(ss);     
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String str=io.nextLine();
        reverseonlyletters s=new reverseonlyletters();
        System.out.println(s.reverseOnlyLetters(str));
        io.close();
    }
}
