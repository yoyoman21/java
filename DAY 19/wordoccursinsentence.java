/*Given a sentence that consists of some words separated by a single space, and a searchWord.

You have to check if searchWord is a prefix of any word in sentence.

Return the index of the word in sentence where searchWord is a prefix of this word (1-indexed).

If searchWord is a prefix of more than one word, return the index of the first word (minimum index). If there is no such word return -1.*/

import java .util.Scanner;
public class wordoccursinsentence{
    public int isPrefixOfWord(String sentence, String searchWord) {
        int count = 1;
        int index = 0;
        boolean flag = true;
        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == ' '){
                flag = true;
                count++;
                index = 0;
            }else if(flag == false){
                continue;
            }else if(sentence.charAt(i) == searchWord.charAt(index)){
                index++;
                if(index == searchWord.length())
                    return count;
                continue;
            }else if(sentence.charAt(i) != searchWord.charAt(index)){
                flag = false;
            }
        }
        return -1;

    }
    public static void main(String[] args)
    {
        Scanner io=new Scanner(System.in);
        String str=io.nextLine();
        String w=io.nextLine();
        wordoccursinsentence s=new wordoccursinsentence();
        System.out.println(s.isPrefixOfWord(str,w));
        io.close();
    }
}