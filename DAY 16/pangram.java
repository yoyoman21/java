/*A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.*/

import java.util.HashSet;
import java.util.Scanner;
public class pangram {
    public boolean checkIfPangram(String sentence) {
        
        if(sentence.length()<26)
        {
            return false;
        }
        else
        {
            char[] str=sentence.toCharArray();
            HashSet<Character> set=new HashSet<Character>();
            for(int i=0;i<str.length;i++)
            {
                set.add(str[i]);
            }
            if(set.size()==26)
            {
                return true;
            }
        }
        return false;
        
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String str=io.nextLine();
        pangram s=new pangram();
        System.out.println(s.checkIfPangram(str));
        io.close();
    }
}
