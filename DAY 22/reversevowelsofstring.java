/* Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.*/ 

import java.util.Scanner;
public class reversevowelsofstring {
    public String reverseVowels(String s) {
        String v="aeiouAEIOU";
        StringBuilder vowels=new StringBuilder();
        String result="";
        int index=0;
        String[] each=s.split("");
        for(int i=0;i<each.length;i++){
            if(v.contains(each[i])){
                vowels.append(each[i]);
            }
        }
             
               vowels.reverse();
               for(int i=0;i<s.length();i++){
                   if(v.contains(each[i])){
                       each[i]=vowels.charAt(index)+"";
                       index++;
                   }
               }
        for(String s1: each){
            result+=s1;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String str=io.nextLine();
        reversevowelsofstring s=new reversevowelsofstring();
        System.out.println(s.reverseVowels(str));
        io.close();
    }
}
