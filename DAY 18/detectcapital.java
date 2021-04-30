/*We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.*/

import java.util.*;
public class detectcapital
{
    public boolean detectCapitalUse(String word) {
       
        int up=0,low=0,first=0;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(Character.isUpperCase(word.charAt(0))){
                if(Character.isLowerCase(c)){
                    first++;
                }
            } 
            if(Character.isUpperCase(c)){
                up++;
            }
            else if(Character.isLowerCase(c)){
                low++;
            }
            
        }
       
        if(up==word.length() || low==word.length() || first==word.length()-1){
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner io=new Scanner(System.in);
        String w=io.nextLine();
        detectcapital s=new detectcapital();
        System.out.println(s.detectCapitalUse(w));
        io.close();
    }
}