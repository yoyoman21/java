/*You are given a string.Return  the no of vowels appearing in the string.*/

import java.util.Scanner;
public class noofvowels {

    public boolean isVowel(char c)
    {
        if(c=='a'|| c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
        {
            return true;
        }
        else
           return false;

    }
    public int countvowels(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
          char ch=s.charAt(i);
          if(isVowel(ch))
          {
              count++;
          }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String str=io.nextLine();
        noofvowels s=new noofvowels();
        System.out.println(s.countvowels(str));
        io.close();

    }
}
