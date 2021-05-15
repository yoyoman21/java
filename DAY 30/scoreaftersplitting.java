/*Given a string s of zeros and ones, return the maximum score after splitting the string into two non-empty substrings (i.e. left substring and right substring).

The score after splitting a string is the number of zeros in the left substring plus the number of ones in the right substring.*/

import java.util.Scanner;
public class scoreaftersplitting {
    public int maxScore(String s) {
         
        int zero = 0;
        for(char a : s.toCharArray()){
            if(a == '0')
                zero++;
        }
        int left = 0;
        int right = s.length() - zero;
        int max = 0;
        for(int i = 0; i < s.length() -1; i++){
            if(s.charAt(i) == '0')
                left++;
            if(s.charAt(i) == '1')
                right--;
            max = Math.max(max, left + right);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String str=io.nextLine();
        scoreaftersplitting s=new scoreaftersplitting();
        System.out.println(s.maxScore(str));
        io.close();
    }
}
