/*We distribute some number of candies, to a row of n = num_people people in the following way:

We then give 1 candy to the first person, 2 candies to the second person, and so on until we give n candies to the last person.

Then, we go back to the start of the row, giving n + 1 candies to the first person, n + 2 candies to the second person, and so on until we give 2 * n candies to the last person.

This process repeats (with us giving one more candy each time, and moving to the start of the row after we reach the end) until we run out of candies.  The last person will receive all of our remaining candies (not necessarily one more than the previous gift).

Return an array (of length num_people and sum candies) that represents the final distribution of candies.

 */

import java.util.Scanner;

public class candies {

    public int[] distributeCandies(int candies, int num_people) {
    int[] result = new int[num_people];
        
        int round = 0;
        while (candies > 0) {
            for (int i = 0; i < num_people; i++) {
                int candyForPerson = i + 1 + round;
                if (candies - candyForPerson < 0) {
                    result[i] += candies;
                    candies = 0;
                    break;
                } else {
                    result[i] += candyForPerson;
                }
                
                candies -= candyForPerson;
            }
            round += num_people;
        }
        
        return result;
}
 public static void main(String[] args) {
     
    Scanner io=new Scanner(System.in);
    int candy=io.nextInt();
    int people=io.nextInt();
    candies s=new candies();
    System.out.println(s.distributeCandies(candy,people));
    io.close();
 }
}
