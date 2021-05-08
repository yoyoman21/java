/*Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.

You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.

 */

import java.util.Scanner;
public class longpressed{

    public boolean isLongPressedName(String name, String typed) {
        if(name.length() > typed.length()) return false;
        
       int i = 0;
       int j = 0;
        while(i < name.length() && j < typed.length()){
            if(name.charAt(i) == typed.charAt(j)){
                i++;
                j++;                
            }else if(i > 0 && name.charAt(i-1) == typed.charAt(j)){
                j++;
            }else{
                return false;
            }
        }
        while(j < typed.length()){
            if(typed.charAt(j) != name.charAt(i-1)) return false;
            j++;
        }
       return i < name.length() ? false : true;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String a=io.nextLine();
        String b=io.nextLine();
        longpressed s=new longpressed();
        System.out.println(s.isLongPressedName(a,b));
        io.close();
    }
}