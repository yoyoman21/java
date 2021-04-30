/*Given a string s, return the first non-repeating character in it and return its index. If it does not exist, return -1*/

import java.util.Scanner;
public class firstuniquecharacter {
    public int firstUniqChar(String s) {
        
        for (int i = 0; i < s.length(); i++) {
		char ch = s.charAt(i);
		if (s.indexOf(ch) == s.lastIndexOf(ch)) {
			return i;
		}
	}
	 return -1;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String w=io.nextLine();
        firstuniquecharacter s=new firstuniquecharacter();
        System.out.println(s.firstUniqChar(w));
        io.close();
    }
}
