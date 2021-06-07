/*A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.
A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.
For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence. */

import java.util.Scanner;
public class sortingthesentence{
public String sortSentence(String s) {
    String arr[] = s.split(" ");
     String arr1[] = new String[arr.length + 1];
     for(int i = 0; i < arr.length; i++)
     {
        StringBuilder temp = new StringBuilder(arr[i]);
         int ln = temp.length() - 1;
         int a = Character.getNumericValue(temp.charAt(ln));
         temp.deleteCharAt(ln);
         arr1[a] = temp.toString();
     }
     String str = "";
     for(int  i = 1 ; i < arr1.length; i++)
     {
         
       str += arr1[i];
         str += " "; 
     }
  return str.trim();  
 }
 public static void main(String[] args) {
     Scanner io=new Scanner(System.in);
     String str=io.nextLine();
     sortingthesentence s=new sortingthesentence();
     System.out.println(s.sortSentence(str));
     io.close();
 }
}