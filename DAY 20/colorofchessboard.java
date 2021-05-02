/*ou are given coordinates, a string that represents the coordinates of a square of the chessboard. Below is a chessboard for your reference.



Return true if the square is white, and false if the square is black.

The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first, and the number second.*/

import java.util.Scanner;
public class colorofchessboard {
    public boolean squareIsWhite(String coordinates) {
        
        return coordinates.charAt(0)%2==0 ^ coordinates.charAt(1)%2==0; 
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String str=io.nextLine();
        colorofchessboard s=new colorofchessboard();
        System.out.println(s.squareIsWhite(str));
        io.close();
    }
}
