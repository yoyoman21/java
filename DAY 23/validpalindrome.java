/*Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases */ 

import java.util.Scanner;

public class validpalindrome {
    public boolean isPalindrome(String s) {
        int flag=0;
        
        s=s.toLowerCase();
        int j=s.length()-1;
       
        for(int i=0;i<s.length();i++)
        {
            
          if(s.charAt(i)==s.charAt(j) && j>=0)
          {
              flag=1;
          }
          else
         {
            flag=0;
              break;
         }
           j--; 
        }
        if(s.isEmpty())
            return true;
       else if(flag==1)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String str=io.nextLine();
        validpalindrome s=new validpalindrome();
        System.out.println(s.isPalindrome(str));
        io.close();
    }
    }


