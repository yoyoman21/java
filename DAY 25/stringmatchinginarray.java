/*Given an array of string words. Return all strings in words which is substring of another word in any order. 

String words[i] is substring of words[j], if can be obtained removing some characters to left and/or right side of words[j]*/


import java.util.Scanner;
import java.util.*;
public class stringmatchinginarray {
    public static boolean isSubstring(String str1,String str2){
        if(str2.contains(str1)){
            return true;
        }
        return false;
    }
    public List<String> stringMatching(String[] words) {
        List<String> list= new ArrayList<String>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(words[i].length()>=words[j].length()){
                    continue;
                }
                if(isSubstring(words[i],words[j])){
                    list.add(words[i]);
                    break;
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
        String[] str=new String[size];
        for(int i=0;i<size;i++)
        {
            str[i]=io.next();
        }
       stringmatchinginarray s=new stringmatchinginarray();
       System.out.println(s.stringMatching(str));
       io.close();
    }
}
