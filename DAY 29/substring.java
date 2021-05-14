/*count the repeated words in string using java*/
import java.util.Scanner;
public class substring {
  public static void main(String[] args) {
		
		Scanner io=new Scanner(System.in);
		System.out.println("enter string:");
		String str=io.nextLine();
		String[] word=str.split(" ");
		int count;
		for(int i=0;i<word.length;i++) {
			count=1;
			for(int j=i+1;j<word.length;j++) {
				if(word[i].equals(word[j])) {
					count++;
					word[j]="0";
				}
				
			}
			if(word[i]!="0") {
				System.out.println(word[i]+" "+count);
			}
		}
		io.close();
	}

}

