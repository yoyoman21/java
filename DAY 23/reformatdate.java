/*Given a date string in the form Day Month Year, where:

Day is in the set {"1st", "2nd", "3rd", "4th", ..., "30th", "31st"}.
Month is in the set {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}.
Year is in the range [1900, 2100].
Convert the date string to the format YYYY-MM-DD, where:

YYYY denotes the 4 digit year.
MM denotes the 2 digit month.
DD denotes the 2 digit day.*/

import java.util.*;
public class reformatdate
{
    public String reformatDate(String date) {
        
        Map<String, String> months = new HashMap<String, String>();
       
       months.put("Jan", "01");
       months.put("Feb", "02");
       months.put("Mar", "03");
       months.put("Apr", "04");
       months.put("May", "05");
       months.put("Jun", "06");
       months.put("Jul", "07");
       months.put("Aug", "08");
       months.put("Sep", "09");
       months.put("Oct", "10");
       months.put("Nov", "11");
       months.put("Dec", "12");
       
       
       String[] arr = date.split(" ");
       
       
       StringBuffer sb = new StringBuffer();
       
       
       for(char ch : arr[0].toCharArray()) {
           if(ch >= '0' && ch <= '9') {
               sb.append(ch);
           } else {
               break;
           }
       }
       
       
       if(sb.length() == 1) {
           sb.insert(0,"0");
       }
           
       
       return arr[2] + "-" + months.get(arr[1]) + "-" + sb.toString();
   }
   public static void main(String[] args) {
       Scanner io=new Scanner(System.in);
       String str=io.nextLine();
       reformatdate s=new reformatdate();
       System.out.println(s.reformatDate(str));
       io.close();
   }
}