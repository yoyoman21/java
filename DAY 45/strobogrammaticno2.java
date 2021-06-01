/*Find all strobogrammatic numbers that are of length=n.
For e.g:n=2,return  ["11","69","88","96"]
A strobogrammatic number is a number that looks the same when rotated 180 degrees.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class strobogrammaticno2 {
    List<String> singleDigitList=new ArrayList<>(Arrays.asList("0","1","8"));
    char[][] digitpair={{'0','0'},{'1','1'},{'8','8'},{'6','9'},{'9','6'}};
    public List<String> findstrobogrammatic(int n){
         return dfs(n,n);
    }
    public List<String>dfs(int n,int max){
        if(n<=0) return new ArrayList<String>(Arrays.asList(""));
        if(n==1) return singleDigitList;

        List<String>subList=dfs(n-2,max);
        List<String>list=new ArrayList<>();
        for(String str:subList){
            if(n!=max) list.add("0"+str+"0");
            for(int i=1;i<digitpair.length;i++)
            {
                list.add(digitpair[i][0]+str+digitpair[i][1]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        strobogrammaticno2 s=new strobogrammaticno2();
        System.out.println(s.findstrobogrammatic(n));
        io.close();
    }
}
