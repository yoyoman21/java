/*
impoCount the number of prime numbers less than a non-negative number, n.*/
import java.util.Scanner;
public class countprimes {
    public int countPrimes(int n) {
       
        int[] arr = new int[n + 1];
        for(int i = 1; i <= n; i++) {
            arr[i] = i;
        }
        int p = 2;
        int count = 0;
       
        while(p < n) {
        
            if(arr[p] != -1) {
                count++;
                
                
                long sq = 1L * p * p;
                if(sq < arr.length) {
                    for(int i = (int)sq; i < arr.length; i = i + p) {
                        arr[i] = -1;
                    }
                }
                
            }
            p++;
        }
        
        return count;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
      int n =io.nextInt();
      countprimes s=new countprimes();
      System.out.println(s.countPrimes(n));
      io.close();
    }
}
