/*Draw tha e following pattern

        * * * * *     * * * * * 
		* * * *         * * * * 
		* * *             * * * 
		* *                 * * 
		*                     *
*/

import java.util.Scanner;

public class pattern16 {

	public static void main(String[] args) {
	   Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		for(int i=1;i<=n;i++)
		{
		
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print("* ");
			}
			for(int j=0;j<4*(i-1+1);j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
        io.close();
	}

}
