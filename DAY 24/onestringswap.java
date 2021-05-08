/*You are given two strings s1 and s2 of equal length. A string swap is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices.

Return true if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings. Otherwise, return false.*/

import java.util.Scanner;

public class onestringswap {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        int count = 0;
        char a1='.',a2='.',b1='.',b2='.';
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
                if(count==1){
                    a1 = s1.charAt(i);
                    a2 = s2.charAt(i);
                }else if(count==2){
                    b1 = s1.charAt(i);
                    b2 = s2.charAt(i);
                }else return false;
            }
        }
        if(count==0) return true;
         return (a1==b2) && (a2==b1);
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String a=io.nextLine();
        String b=io.nextLine();
        onestringswap s=new onestringswap();
        System.out.println(s.areAlmostEqual(a,b));
        io.close();
    }
}
