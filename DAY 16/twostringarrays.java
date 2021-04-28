/*Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string*/

import java.util.*;
public class twostringarrays {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if(String.join("",word1).equals(String.join("",word2)))
        {
         return true;
        }   
        else
        {
        return false;
        }   
     }
     public static void main(String[] args) {
         Scanner io=new Scanner(System.in);
         int size=io.nextInt();
         String[] w=new String[size];
         String[] v=new String[size];
         for(int i=0;i<size;i++)
         {
             w[i]=io.next();
         }
         for(int i=0;i<size;i++)
         {
             v[i]=io.next();
         }
         twostringarrays s=new twostringarrays();
         System.out.println(s.arrayStringsAreEqual(w, v));
         io.close();
     }
}
