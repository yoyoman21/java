import java.util.*;
public class lastword {
    public void lengthOfLastWord(String s) {
        int length=0;
        String a=s.trim();
        
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)==' ')
            {
                length=0;
            }
            else
            {
                length++;
            }
        }
        System.out.println(length);
    }
    public static void main(String args[])
    {
        Scanner io=new Scanner(System.in);
        String str=io.nextLine();
        lastword s=new lastword();
        s.lengthOfLastWord(str);
        io.close();
    }
}
