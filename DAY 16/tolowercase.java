/*Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.*/

import java.util.Scanner;
public class tolowercase {
    public String tolCase(String str) {
        String s=str.toLowerCase();
        return s;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String st=io.nextLine();
        tolowercase s=new tolowercase();
        System.out.println(s.tolCase(st));
        io.close();
    }
}
