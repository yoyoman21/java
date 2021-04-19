/*There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.*/

import java.util.*;
public class highestaltitude {
    public int largestAltitude(int[] gain) {
        int high=0,curr=0;
        for(int i=0;i<gain.length;i++)
        {
            curr=curr+gain[i];
            if(curr>high)
            {
                high=curr;
            }
        }
        return high;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=io.nextInt();
        }
        highestaltitude s=new highestaltitude();
        System.out.println(s.largestAltitude(arr));
        io.close();
    }
}
