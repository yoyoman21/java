/*Given a sentence text (A sentence is a string of space-separated words) in the following format:
First letter is in upper case.
Each word in text are separated by a single space.
Your task is to rearrange the words in text such that all words are rearranged in an increasing order of their lengths. If two words have the same length, arrange them in their original order.
Return the new text following the format shown above. */

import java.util.*;
public class rearrange{
    public String arrangeWords(String text) {
        StringBuilder sb = new StringBuilder();
        List<Pair> list = new ArrayList<>();
        String[] arr = text.toLowerCase().split(" ");
		
        for(int i = 0; i < arr.length; i++){
            list.add(new Pair(arr[i], arr[i].length()));
        }
		
        Collections.sort(list);
        
        for(int i = 0; i < list.size(); i++){
            sb.append(list.get(i).word);
            sb.append(" ");
        }
        
        String str = sb.toString().trim();
        String ans = str.substring(0,1).toUpperCase() + str.substring(1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String str=io.nextLine();
        rearrange s=new rearrange();
        System.out.println(s.arrangeWords(str));
        io.close();
    }
}

class Pair implements Comparable<Pair>{
    String word;
    int len;
    
    public Pair(String word, int len){
        this.word = word;
        this.len = len;
    }
    
    public int compareTo(Pair o){
        return this.len - o.len;
    }
   
}
