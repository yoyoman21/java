/*You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.*/

import java.util.*;
public class itemsmatchingrule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
       
        int RuleIndex = RuleKey(ruleKey);
        int count = 0;
     
        for( List<String> sublist : items ) {
            if(sublist.get(RuleIndex).equals(ruleValue)){
            count++;
            }
        }
        
        return count;
    }
    
    
    
    public int RuleKey(String ruleKey){
       
        
        if(ruleKey.equals("type")) 
        {
            return 0;
        }
        else if (ruleKey.equals("color")) 
        {
            return 1;
        }
        else return 2;
    }
    
}
