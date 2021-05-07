/*Given two strings a and b, return true if you can swap two letters in a so the result is equal to b, otherwise, return false.

Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at a[i] and a[j].

For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
 */ 

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class buddystrings {
    public boolean buddyStrings(String a, String b) {
        if(a.length() != b.length()){return false;}
        int count = 0;
        List<Character> lists1 = new ArrayList<>();
        List<Character> lists2 = new ArrayList<>();

        if(a.equals(b)){
            Map<Character, Integer> maps = new HashMap<>();
            for(int i = 0; i < a.length(); i++){
                if(maps.get(a.charAt(i)) != null){
                    return true;
                }else{
                    maps.put(a.charAt(i),0);
                }
            }
        }else{
            for(int i = 0; i < a.length(); i++){
                if(a.charAt(i) != b.charAt(i)){
                    lists1.add(a.charAt(i));
                    lists2.add(b.charAt(i));
                    if(++count > 2){
                        return false;
                    };
                }
            }
        }
        
        if(count == 2){
            Collections.sort(lists1);
            Collections.sort(lists2);
            
            if(lists1.equals(lists2)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String a=io.nextLine();
        String b=io.nextLine();
        buddystrings s=new buddystrings();
        System.out.println(s.buddyStrings(a, b));
        io.close();
    }
}
