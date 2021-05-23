/*TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl and it returns a short URL such as http://tinyurl.com/4e9iAk. Design a class to encode a URL and decode a tiny URL.

There is no restriction on how your encode/decode algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.

Implement the Solution class:

Solution() Initializes the object of the system.
String encode(String longUrl) Returns a tiny URL for the given longUrl.
String decode(String shortUrl) Returns the original long URL for the given shortUrl. It is guaranteed that the given shortUrl was encoded by the same object.*/

import java.util.*;
public class encodedecodeurl
{
    private long id = 1_000_000;
	private Map<Long, String> storage = new HashMap<>();
	private static final String TINY = "http://tinyurl.com/";
	private static final String BASE = "abcdefghijklmnopqrstuvwxyz";

	
	public String encode(String longUrl) {
		StringBuilder sb = new StringBuilder();
		long id = this.id;
		while (id > 0) {
			
			int remainder = (int) (id % BASE.length());
			sb.append(BASE.charAt(remainder));
			id /= BASE.length();
		}
		String url = sb.toString();
		storage.put(this.id++, longUrl);
		return TINY + url;
	}

	public String decode(String shortUrl) {
		String origin = shortUrl.substring(shortUrl.lastIndexOf('/') + 1);
		long id = 0;
		for (int i = 0; i < origin.length(); i++) {
			int remainder = BASE.indexOf(origin.charAt(i));
			id += remainder * Math.pow(BASE.length(), i);
		}
        
		return storage.get(id);
	}
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String url=io.nextLine();
        encodedecodeurl s=new encodedecodeurl();
        System.out.println(s.decode(s.encode(url)));
        io.close();
    }
   
}