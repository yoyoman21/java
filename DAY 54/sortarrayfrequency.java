/*Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.
Return the sorted array */

import java.util.*;
public class sortarrayfrequency {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i]))
                h.put(nums[i], h.get(nums[i])+1);
            else
                h.put(nums[i],1);
        }
        Set s=h.entrySet();
        Iterator i=s.iterator();
        ArrayList<Map.Entry<Integer,Integer>> l=new ArrayList<>();
        while(i.hasNext()){
            Map.Entry<Integer,Integer> e=(Map.Entry<Integer,Integer>)i.next();
            l.add(e);
        }
        Comparator<Map.Entry<Integer,Integer>> c=(a,b)->{
            if(a.getValue()==b.getValue())
                return -1*(a.getKey()).compareTo(b.getKey());
            else
                return -1*b.getValue().compareTo(a.getValue());
        };
        Collections.sort(l,c);
        int index=0;
        for(int j=0;j<l.size();j++){
            int k=l.get(j).getKey();
            int v=l.get(j).getValue();
            while(v-- > 0){
                nums[index]=k;
                index++;
            }
        }
       
        return nums;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
        int[] nums=new int[size];
        for(int i=0;i<size;i++)
        {
            nums[i]=io.nextInt();
        }
        sortarrayfrequency s=new sortarrayfrequency();
        System.out.println(s.frequencySort(nums));
        io.close();
    }
}
