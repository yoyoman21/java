
import java.util.Scanner;
public class assignmentno1
  {
    public static void main(String args[])
    {
      
      Scanner io=new Scanner(System.in);
      System.out.println("Enter size of array");
      int n=io.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
    {
        arr[i]=io.nextInt();
    }
     System.out.println("the  reverse elemsnts in array are");
     for(int i=n-1;i>=0;i--)
    {
        System.out.println(arr[i]);
    }
    
    }
  }
    
   
    
    

   
