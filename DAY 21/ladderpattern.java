import java.util.Scanner;
public class ladderpattern {
    public static void main(String[] args) {
	Scanner io =new Scanner(System.in);
      System.out.println("enter no of steps in ladder");
      int n=io.nextInt();
      for(int i=1;i<=n+1;i++)
      {
    	  System.out.print("*   *");
    	  System.out.println();
    	  System.out.print("*   *");
    	  System.out.println();
    	  if(i<=n)
    	  {
    	  System.out.print("*****");
    	  }
    	  System.out.println();
      }
      io.close();
	}

}
