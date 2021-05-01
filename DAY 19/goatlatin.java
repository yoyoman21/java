/*A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.

We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)

The rules of Goat Latin are as follows:

If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
For example, the word 'apple' becomes 'applema'.
 
If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
For example, the word "goat" becomes "oatgma".
 
Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
Return the final sentence representing the conversion from S to Goat Latin. */

import java.util.*;
public class goatlatin {
    public String toGoatLatin(String S) {
        String[] words = S.split(" ");
        StringBuilder result = new StringBuilder();
        
        String myA = "a";
    
        for(int i = 0; i < words.length; i++) {
            char first = words[i].charAt(0);
            if(isVowel(first)) {
                String firstWord = words[i] + "ma" + myA + " "; 
                result.append(firstWord);    
            }
            else {
                String lastWord = words[i].substring(1,words[i].length());
                String secondW = lastWord + first + "ma" + myA + " ";
                
                result.append(secondW); 
            }
            myA = myA + "a";
        }
       
      
        
        return result.deleteCharAt(result.length()-1).toString();
    }
        
    
    public boolean isVowel(char a) {
        String vowels = "aeiouAEIOU";
        if(vowels.indexOf(a) < 0) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String str=io.nextLine();
        goatlatin s=new goatlatin();
        System.out.println(s.toGoatLatin(str));
        io.close();
    }            
}
