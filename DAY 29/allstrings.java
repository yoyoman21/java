public class allstrings {
public static void main(String[] args) {
		

		StringBuffer b=new StringBuffer("vighnesh");
		b.append("kamath");
		
		b.replace(0,6,"nikita");
		
		b.delete(7,9);
		System.out.println(b);

		StringBuilder c=new StringBuilder("sahil");
		c.append(" phalle");
		c.replace(0,7,"sahil");
		System.out.println(c);
		
	}

}