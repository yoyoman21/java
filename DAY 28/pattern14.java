/* Draw the following pattern
			6
	        * 
	      *   * 
	    *       * 
	  *           * 
	*               * 
  *                   *  
     
  */
import java.util.Scanner;

public class pattern14 {

	public static void main(String[] args) {
		
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<(i*2);j++)
			{
				if(j>1 &&j<(i*2)-1)
				{
					System.out.print("  ");
				}
				else {
				System.out.print("* ");
				}
				
			}
			System.out.println();
		}
        io.close();
	}
  
}