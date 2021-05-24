/* Given an integer n, return the count of all numbers with unique digits, x, where 0 <= x < 10n.*/
import java.util.Scanner;

public class countnouinquedigits {
    public int countNumbersWithUniqueDigits(int n) {
        
        if(n == 0) return 1;
        int res = 1;
        for(int i =1; i <= n; i++){
            if(i == 1 || i == 2){
                res= res * 9;
            }else{
                res = res * (9 - i + 2);
            }
        }
        return res + countNumbersWithUniqueDigits(n-1);
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        countnouinquedigits s=new countnouinquedigits();
        System.out.println(s.countNumbersWithUniqueDigits(n));
        io.close();
    }
}
