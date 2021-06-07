/* Given a string s and an integer array indices of the same length.
The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
Return the shuffled string.*/

import java.util.Scanner;

public class shufflestring {
    public String restoreString(String s, int[] indices) {
        char[] output= new char[indices.length];
    int i=0;
   while(i<indices.length){
   output[indices[i]]=s.charAt(i);
    i++;
       }
    return String.valueOf(output);
     }
     public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String str=io.nextLine();
        int size=io.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=io.nextInt();
        }
        shufflestring s=new shufflestring();
        System.out.println(s.restoreString(str,arr));
        io.close();
     }
}
