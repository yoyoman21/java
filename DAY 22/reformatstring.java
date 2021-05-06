/*Given alphanumeric string s. (Alphanumeric string is a string consisting of lowercase English letters and digits).

You have to find a permutation of the string where no letter is followed by another letter and no digit is followed by another digit. That is, no two adjacent characters have the same type.

Return the reformatted string or return an empty string if it is impossible to reformat the string.*/

import java.util.Scanner;
public class reformatstring {
    public String reformat(String s) {
        if(s.length() < 2) return s;
        
        char[] res = s.toCharArray();
        
        char[] str = new char[res.length];
        char[] nums = new char[res.length];
        
        int c1 = 0, c2 = 0;
        for(int i=0; i<res.length; i++){
            if(Character.isLetter(res[i]))
                str[c1++] = res[i];
            else
                nums[c2++] = res[i];
        }
        
        if(c1 == 0 || c2 == 0) return ""; 
        
                                      
        int diff = c1 - c2;    
                                       
        if(diff < -1 && diff > 1) return "";
        
        else if(c1 >= c2) {    
            c1 = 2;               
            c2 = 0;
        }
        else if(c1 < c2){       
            c1 = 0;                 
            c2 = 2;  
        } 
        
        int pointer = 0, i=0, j=0;
        while(pointer < res.length){
            if(c1 == 2){
                res[pointer++] = str[i++];
                c1 = 0;             
                c2 = 2;   
            }
            else if(c2 == 2){
                res[pointer++] = nums[j++];
                c1 = 2;             
                c2 = 0;     
            }
        }
        return new String(res);
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String str=io.nextLine();
        reformatstring s=new reformatstring();
        System.out.println(s.reformat(str));
        io.close();
    }
}
