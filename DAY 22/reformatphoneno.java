/*You are given a phone number as a string number. number consists of digits, spaces ' ', and/or dashes '-'.

You would like to reformat the phone number in a certain manner. Firstly, remove all spaces and dashes. Then, group the digits from left to right into blocks of length 3 until there are 4 or fewer digits. The final digits are then grouped as follows:

2 digits: A single block of length 2.
3 digits: A single block of length 3.
4 digits: Two blocks of length 2 each.
The blocks are then joined by dashes. Notice that the reformatting process should never produce any blocks of length 1 and produce at most two blocks of length 2.

Return the phone number after formatting.*/

import java.util.*;
public class reformatphoneno
{
    public String reformatNumber(String number) {
    number = number.replace("-","").replace(" ","");
        int len = number.length();
        if(len == 0 || len == 1 || len == 2 || len == 3){
            return number;
        }
        StringBuffer sb = new StringBuffer(number);
        int i=3;
        while(len > 4){
            sb.insert(i,"-");
            len -= 3;
            i += 4;
        }
        while(len == 4){
            i -= 1;
            sb.insert(i,"-");
            len -= 2;
        }
        return sb.toString();
    }
    public static void main(String[] args)
    {
       Scanner io=new Scanner(System.in);
       String str=io.nextLine();
       reformatphoneno s=new reformatphoneno();
       System.out.println(s.reformatNumber(str));
       io.close();
    }
}