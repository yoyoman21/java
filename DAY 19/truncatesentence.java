/*A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).

For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words. Return s​​​​​​ after truncating it.*/

import java.util.Scanner;
public class truncatesentence {
    public String truncateSentence(String s, int k) {
        int count=0;
        int j=-1;
        for(int i=0;i<s.length();i++)
        {
            j++;
            if(s.charAt(i)==' ')
            {
                count++;
                
            }
            
            if(count==k)
              break;
             
        }
        if(count<k)
        {
            return s;
        }
        else
            return s.substring(0,j);
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String str=io.nextLine();
        int k=io.nextInt();
        truncatesentence s=new truncatesentence();
        System.out.println(s.truncateSentence(str, k));
        io.close();
    }
}
