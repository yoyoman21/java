import java.util.Scanner;

public class conjectit {

	public static void main(String[] args) {
		Scanner io=new Scanner(System.in);
        System.out.println("enter no of test cases");
        int t=io.nextInt();
        while(t!=0)
        {
        	System.out.println("enter any no N");
        	int n=io.nextInt();
        	while(n>1)
        	{
        	if(n%2==0)
        	{
        		n=n/2;
        	}
        	else
        	{
        		n=3*n+1;
        	}
        	}
        	if(n==1)
        	{
        		System.out.println("YES");
        	}
        	else 
        	{
        		System.out.println("NO");
        	}
        	t--;
        }
        io.close();
	}

}