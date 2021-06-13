/* Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.*/

import java.util.*;
public class combinationofphoneno {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
   
   if(digits.length()==0)
       return res;
   

   String[] keypad=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
   
   
   util(digits,0,keypad,res,new StringBuilder());
   
   return res;
   
}

void util(String digits,int i,String[] keypad,List<String> res,StringBuilder string){
   
  
   
   if(string.length()==digits.length()){
       
       res.add(string.toString());
       
       string=new StringBuilder();
       
       return;
       
   }
   
   
   for(int index=0;index<keypad[digits.charAt(i)-'0'].length();index++){
       
   string.append(keypad[digits.charAt(i)-'0'].charAt(index));
   
  
   util(digits,i+1,keypad,res,string);
   

   string.deleteCharAt(string.length()-1);
       
   }
   }
   public static void main(String[] args) {
       Scanner io=new Scanner(System.in);
       String str=io.nextLine();
       combinationofphoneno s=new combinationofphoneno();
       System.out.println(s.letterCombinations(str));
       io.close();
   }
}
