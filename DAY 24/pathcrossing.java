/*Given a string path, where path[i] = 'N', 'S', 'E' or 'W', each representing moving one unit north, south, east, or west, respectively. You start at the origin (0, 0) on a 2D plane and walk on the path specified by path.

Return true if the path crosses itself at any point, that is, if at any time you are on a location you have previously visited. Return false otherwise.*/

import java.util.*;
public class pathcrossing {
    public boolean isPathCrossing(String path) {
        HashSet<String> set = new HashSet<>();
        StringBuffer s = new StringBuffer("0,0");
        set.add(s.toString());
        int[] a = new int[]{0,0};
        for(int i=0 ; i<path.length() ; i++)
        {
            StringBuffer temp = new StringBuffer();
            char c = path.charAt(i);            
            switch(c)
            {
                case 'N' : a[1]++;break;
                case 'E' : a[0]++;break;
                case 'S' : a[1]--;break;
                case 'W' : a[0]--;
            }
            temp.append(a[0]+","+a[1]);            
            if(set.contains(temp.toString())) return true;           
            set.add(temp.toString());
        }    
        return false;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String path=io.nextLine();
        pathcrossing s=new pathcrossing();
        System.out.println(s.isPathCrossing(path));
        io.close();
    }
}
