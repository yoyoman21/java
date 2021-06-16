/*Return all non-negative integers of length n such that the absolute difference between every two consecutive digits is k.
Note that every number in the answer must not have leading zeros. For example, 01 has one leading zero and is invalid.
You may return the answer in any order. */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class numberswithsameconsecutivedifferences {
    public int[] numsSameConsecDiff(int n, int k) {
        int []arr1 =new int[]{0,1,2,3,4,5,6,7,8,9};        
        List<String> l1 =new ArrayList<String>();        
        solve(arr1,0,n,k,"",l1);
        int []res =new int[l1.size()];
        for(int i=0;i<res.length;i++)
        {
            res[i]=Integer.parseInt(l1.get(i));
        }
        return res;
    }
    public void solve(int []arr1,int index,int n,int k,String res,List<String> l1)
    {
        if(index==n)
        {
            l1.add(res);
            return;
        }
       
          for(int i=0;i<arr1.length;i++)
          {
              if((index==0)||((res.startsWith("0")==false)&&(Math.abs((res.charAt(index-1)-'0')-arr1[i])==k)))
              {                  
                  solve(arr1,index+1,n,k,res+arr1[i],l1);
              }
          }
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt(),k=io.nextInt();
        numberswithsameconsecutivedifferences s=new numberswithsameconsecutivedifferences();
        System.out.println(s.numsSameConsecDiff(n, k));
        io.close();
    }
}
