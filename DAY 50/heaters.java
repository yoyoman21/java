/*Winter is coming! During the contest, your first job is to design a standard heater with a fixed warm radius to warm all the houses.
Every house can be warmed, as long as the house is within the heater's warm radius range. 
Given the positions of houses and heaters on a horizontal line, return the minimum radius standard of heaters so that those heaters could cover all houses.
Notice that all the heaters follow your radius standard, and the warm radius will the same. */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class heaters {
    public int findRadius(int[] houses, int[] heaters) {
        Map<Integer,Integer> houseHeaterMap = new HashMap<>();
        
		
		
        Arrays.sort(houses);
        Arrays.sort(heaters);
        
        for (int house : houses){
            
            int l=0;
            int r=heaters.length-1;
            int mid;
            
            while(l<=r){
                mid = l+(r-l)/2;

                if (heaters[mid] == house){
                    houseHeaterMap.put(house,Math.min(Math.abs(heaters[mid]-house), houseHeaterMap.getOrDefault(house,Integer.MAX_VALUE)));
                    break;
                }
                else if (heaters[mid] < house){
                    houseHeaterMap.put(house,Math.min(Math.abs(heaters[mid]-house), houseHeaterMap.getOrDefault(house,Integer.MAX_VALUE)));
                    l = mid+1;
                }
                else {
                    houseHeaterMap.put(house,Math.min(Math.abs(heaters[mid]-house), houseHeaterMap.getOrDefault(house,Integer.MAX_VALUE)));
                    r = mid-1;
                }
            }
        }
        
	
		
        int ans = Integer.MIN_VALUE;
        for (int houseHeaterDistance : houseHeaterMap.values()){
            ans = Math.max(houseHeaterDistance,ans);
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int size1=io.nextInt();
        int size2=io.nextInt();
        
        int[] arr1=new int[size1];
        for(int i=0;i<size1;i++)
        {
            arr1[i]=io.nextInt();
        }

        int[] arr2=new int[size2];
        for(int i=0;i<size2;i++)
        {
            arr2[i]=io.nextInt();
        }
     heaters s=new heaters();
     System.out.println(s.findRadius(arr1,arr2));
     io.close();
    }
}
