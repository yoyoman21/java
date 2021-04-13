
import java.util.Scanner;

 class MatrixOperations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*System.out.println("enter the dimensions of matrix A");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		System.out.println("enter the dimensions of matrix B");
		int r2=sc.nextInt();
		int c2=sc.nextInt();*/
       int sum;
		int arr[][]=new int[6][6];
		//int b[][]=new int[r2][c2];
		
		
		System.out.println("enter the elements of matrix are");
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		
		}
		int max=-999;
		for(int i=0;i<=3;i++)
		{
			sum=0;
			for(int j=0;j<=3;j++)
			{
				sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				
				if(max<sum)
				{
					max=sum;
				}
			}
			
		}
		
		System.out.println("maximum element is "+max);
		
	}
}