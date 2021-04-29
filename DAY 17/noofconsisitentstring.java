/*You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.*/

import java.util.Scanner;
public class noofconsisitentstring{

    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
       boolean[] a=new boolean[26];
     for(int i=0;i<allowed.length();i++)
         {
             a[allowed.charAt(i)-'a']=true;
         }
     for(int i=0;i<words.length;i++)
         {
             String s=words[i];
             boolean isConsistent=true;
         for(int j=0;j<s.length();j++)
             {
                 if(!a[s.charAt(j)-'a'])
                     {
                         isConsistent=false;
                         break;
                     }
 
              }
              if(isConsistent)
                 {
                      count++;
                 }
         }
          return count;
     }
     public static void main(String[] args)
     {
         Scanner io=new Scanner(System.in);
         String str=io.nextLine();
         
         String[] w=new String[] {"ad","bd","aaab","baa","badab"};
        
         noofconsisitentstring s=new noofconsisitentstring();
         System.out.println(s.countConsistentStrings(str,w));
         io.close();
     }
}