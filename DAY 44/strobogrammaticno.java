/*Check whether a number is strobogrammaticno.Return true if it is.A strobogrammatic number  is a number
whose numeral is rotaionally symmetric so that it appears same when rotated 180 degrees.In other words,
the numeral  looks the same right-side up and upside down. */

import java.util.HashMap;
import java.util.Scanner;
public class strobogrammaticno {
    public boolean isStrobogrammatic(String n)
    {
        if(n==null || n.length()==0)
           return true;
        HashMap<Character,Character>map=new HashMap<Character,Character>();
        map.put('0','0');
        map.put('1','1');
        map.put('8','8');
        map.put('6','9');
        map.put('9','6');
        int left=0;
        int right=n.length()-1;
        while(left<=right)
        {
            if(!map.containsKey(n.charAt(right))|| n.charAt(left)!=map.get(n.charAt(right)))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String str=io.nextLine();
        strobogrammaticno s=new strobogrammaticno();
        System.out.println(s.isStrobogrammatic(str));
        io.close();

    }
}
