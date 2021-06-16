/*An integer has sequential digits if and only if each digit in the number is one more than the previous digit.
Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits. */
import java.util.*;
public class sequentialdigits{

    List<Integer> list= new ArrayList<>();
    public List<Integer> sequentialDigits(int low, int high) {
        int m=count(low);
        int n=count(high);
        generate(low,high,m,n);
        return list;    
    }
    void generate(int low,int high,int m,int n){
        while(m<=n){
            for(int i=m;i<=9;i++){
                int k=m;
                int j=i;
                int num=0;
                int place=1;
                while(k>0){
                    num=num+j*place;
                    j--;
                    k--;
                    place*=10;
                }
                if(num>=low && num<=high)
                    list.add(num);
                
            }
            m++;
        }
    }
    int count(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int l=io.nextInt();
        int h=io.nextInt();
        sequentialdigits s=new sequentialdigits();
        System.out.println(s.sequentialDigits(l,h));
        io.close();
    }
}
