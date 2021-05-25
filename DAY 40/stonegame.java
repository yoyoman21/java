/*Alex and Lee play a game with piles of stones.  There are an even number of piles arranged in a row, and each pile has a positive integer number of stones piles[i].

The objective of the game is to end with the most stones.  The total number of stones is odd, so there are no ties.

Alex and Lee take turns, with Alex starting first.  Each turn, a player takes the entire pile of stones from either the beginning or the end of the row.  This continues until there are no more piles left, at which point the person with the most stones wins.

Assuming Alex and Lee play optimally, return True if and only if Alex wins the game. */
import java.util.*;

public class stonegame {
    public boolean stoneGame(int[] piles) {
        Arrays.sort(piles);
        int alex = 0, lee = 0;
        
        int i = piles.length -1;
        int j = i - 1;
        
        while(j >= 0){
            
            alex += piles[i--];
            lee += piles[j--];
            
        }
        
        return alex > lee;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=io.nextInt();
        }
        stonegame s=new stonegame();
        System.out.println(s.stoneGame(arr));
        io.close();

    }
}
