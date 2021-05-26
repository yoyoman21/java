/*Given three integers x, y, and bound, return a list of all the powerful integers that have a value less than or equal to bound.

An integer is powerful if it can be represented as xi + yj for some integers i >= 0 and j >= 0.

You may return the answer in any order. In your answer, each value should occur at most once.*/
import java.util.*;
public class powerfulintegers{
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        int iMax = x == 1 ? 0 :  (int)(Math.log(bound) / Math.log(x));
        int jMax = y == 1 ? 0 :  (int)(Math.log(bound) / Math.log(y));
        
        
      
        HashSet<Integer> set = new HashSet();
        
        for(int i = 0; i <= iMax; i++){
            for(int j = 0; j <= jMax; j++){
                int num = (int) (Math.pow(x, i) + Math.pow(y, j));
                if(num <= bound)
                    set.add(num);
            }
        }
        
        return new ArrayList<Integer>(set);
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int x=io.nextInt();
        int y=io.nextInt();
        int bound=io.nextInt();
        powerfulintegers s=new powerfulintegers();
        System.out.println(s.powerfulIntegers(x, y,bound));
        io.close();

    }
}