/* Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest character in the array that is larger than target.

Note that the letters wrap around.

For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.*/
import java.util.*;

public class smallestletter {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i=0;i<letters.length;i++)
        {
            if(letters[i]>target)
                return letters[i];
        }
        return letters[0];
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        char target=io.next().charAt(0);
        int size=io.nextInt();
        char arr[]=new char[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=io.next().charAt(i);

        }
        smallestletter s=new smallestletter();
        System.out.println(s.nextGreatestLetter(arr,target));
        io.close();

    }
   
    }

