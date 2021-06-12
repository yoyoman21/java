/* You have n  tiles, where each tile has one letter tiles[i] printed on it.
Return the number of possible non-empty sequences of letters you can make using the letters printed on those tiles.*/
import java.util.*;

public class lettertiles {
    Set<String> kk = new HashSet<>();
    public int numTilePossibilities(String tiles) {
        boolean v[] = new boolean[tiles.length()];
        helper(tiles,v,"");
        return kk.size();
    }
    
   void helper(String t,boolean v[],String op) {
        for(int i=0;i<t.length();i++) {
            if(v[i] == false){
                v[i] = true;
            char ch = t.charAt(i);
            String p = String.valueOf(ch);
                kk.add(p);
            String op1 = op+p;
                kk.add(op1);
            helper(t,v,op1);
                 v[i] = false;
           }
        }
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String str=io.nextLine();
        lettertiles s=new lettertiles();
        System.out.println(s.numTilePossibilities(str));
        io.close();
    }
}
