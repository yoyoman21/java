import java.io.BufferedReader;
public class sevensegment {
    public static void main(String[] args) throws Exception
	{
		
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 System.out.println("enter the no of testcases");
		    int t =Integer.parseInt(br.readLine());
		    ///int[] num={0,1,2,3,4,5,6,7,8,9};
		    int[] match={6,2,5,5,4,5,6,3,7,6};
		 
		 
		    while(t!=0){
		    	System.out.println("enter no");
		        String a = br.readLine();
		        String[] as = a.split("");
		        int mat=0;
		        for(int i=0;i<as.length;i++){
		            int n  = Integer.parseInt(as[i]);
		            mat=mat+match[n];
		        }
		        //System.out.println(mat);
		 
		        StringBuilder sb = new StringBuilder();
		        if (mat % 2 == 0) {
		            sb.append('1');
		        } else {
		            sb.append('7');
		        }
		        for (int i = 0; i < mat / 2 - 1; i++) {
		            sb.append('1');
		        }
		        
		        System.out.println(sb);
		        t--;
		    }
		    }
}
