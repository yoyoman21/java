/*Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

You can use each character in text at most once. Return the maximum number of instances that can be formed.*/

import java.util.Scanner;
public class maximumnoofbaloons {
    public int maxNumberOfBalloons(String text) {
        int[] frequencies = new int[26];
        String balloon = "balloon";
        for (char ch : text.toCharArray()) {
            frequencies[ch - 97]++;
        }
        int count = 0;
        boolean x = true;
        while (x) {
            x = true;
            for (int i = 0; i < balloon.length(); i++) {
                char c = balloon.charAt(i);
                frequencies[c - 97]--;
                if (frequencies[c - 97] < 0) {
                    x = false;
                    break;
                }
            }
            if (x) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String str=io.nextLine();
        maximumnoofbaloons s=new maximumnoofbaloons();
        System.out.println(s.maxNumberOfBalloons(str));
        io.close();
    }
}
