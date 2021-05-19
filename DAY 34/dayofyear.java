/*Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.*/

import java.util.Scanner;

public class dayofyear {
    public int dayOfYear(String date) {
        int[] months = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
    
      if(isLeap(Integer.parseInt(date.substring(0,4)))){
        months[2] = 29;
        }
    int days = 0;
    int start = 0;
    while(start<Integer.parseInt(date.substring(5,7))){
        days += months[start];
        start++;
    }
    
    return days+Integer.parseInt(date.substring(8));
}

private boolean isLeap(int year){
    return (year%400 ==0) || (year%100 != 0 && year%4 == 0);  
	}

    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String str=io.nextLine();
        dayofyear s=new dayofyear();
        System.out.println(s.dayOfYear(str));
        io.close();
    }
}
