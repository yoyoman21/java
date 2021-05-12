/*   Draw the following pattern   

        A A A A A 
		B B B B 		
        C C C 
		D D 
		E 
		F F 
		G G G 
		H H H H 
		I I I I I*/

import java.util.Scanner;
public class pattern15 {
 public static void main(String[] args) {
        
    
    Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		char ch='A';
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
			ch++;
			
		}
		for(int i=2;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
			ch++;
		}
        io.close();
	}
}
