import java.util.Scanner;
public class evenno {
    public static void main(String[] args) {
         Scanner io=new Scanner(System.in);
    System.out.println("enter a no");
    int n=io.nextInt();
    if(n%2==0)
    {
        System.out.println("Its an even no");
    }
    else
    {
        System.out.println("its an odd no");
    }
}
}
