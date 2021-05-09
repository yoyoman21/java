/*You are given a string s representing an attendance record for a student where each character signifies whether the student was absent, late, or present on that day. The record only contains the following three characters:

'A': Absent.
'L': Late.
'P': Present.
The student is eligible for an attendance award if they meet both of the following criteria:

The student was absent ('A') for strictly fewer than 2 days total.
The student was never late ('L') for 3 or more consecutive days.
Return true if the student is eligible for an attendance award, or false otherwise.*/

import java.util.Scanner;

public class studentattendance
{
    public boolean checkRecord(String s) {
        char[] award=s.toCharArray();
        int c1=0,c2=0;
        for(int i=0;i<award.length;i++)
        {
            if(award[i]=='A')
            {
                c1++;
                c2=0;
            }
            else if(award[i]=='L')
                c2++;
            else
                c2=0;
           if(c1>=2 || c2>=3)
               return false;
        }
        return true;
    }
public static void main(String[] args)
{
    Scanner io=new Scanner(System.in);
    String str=io.nextLine();
    studentattendance s=new studentattendance();
    System.out.println(s.checkRecord(str));
    io.close();
}
}