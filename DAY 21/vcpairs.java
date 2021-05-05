import java.util.*;
public class vcpairs {
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        //System.out.println("enter test cases");
        //int t=io.nextInt();
       
        //for(int i=1;i<=t;i++)
        //{
            int count=0;
            
            System.out.println("enter string");
            String a=io.nextLine();
            
            for(int j=0;j<a.length()-1;j++)
            {
                char c=a.charAt(j);
                if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u')
                {
                    char d=a.charAt(j+1);
                    if(d=='a'||d=='e'||d=='i'||d=='o'||d=='u')
                    {
                        count++;
             }
                }
            }
           System.out.println(count);
           io.close();
       }
       
       }

