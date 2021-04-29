/*Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.*/

import java.util.*;
public class reversestringwords {
    public String reverseWords(String s) {
        String str[]=s.split(" ");
        String ss="";
        StringBuilder sb=new StringBuilder();
        for(String each: str){
            sb.append(each);
            sb.reverse();
            ss=ss+sb.toString()+" ";
            sb.delete(0,each.length());
        }
        return ss.trim();
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String str=io.nextLine();
        reversestringwords s=new reversestringwords();
        System.out.println(s.reverseWords(str));
        io.close();

    }
}
