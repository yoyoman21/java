/*Given a string s, the power of the string is the maximum length of a non-empty substring that contains only one unique character.

Return the power of the string*/

import java.util.Scanner;
public class consecutivecharacters {
public int maxPower(String s) {
    s=s.concat(" ");
    int count=1;
    int j=1;
    for(int i=0;i<s.length()-1;i++)
    {
        if(s.charAt(i)==s.charAt(i+1))
        {
            count++;
        }
        else
        {
            if(count>j)
            {
                j=count;
            }
            count=1;
        }
    }
    return j;
}
  public static void main(String[] args) {
    Scanner io=new Scanner(System.in);
    String str=io.nextLine();
    consecutivecharacters s=new consecutivecharacters();
    System.out.println(s.maxPower(str));
    io.close();
  }
}
