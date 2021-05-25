/* You are playing a solitaire game with three piles of stones of sizes a​​​​​​, b,​​​​​​ and c​​​​​​ respectively. Each turn you choose two different non-empty piles, take one stone from each, and add 1 point to your score. The game stops when there are fewer than two non-empty piles (meaning there are no more available moves).

Given three integers a​​​​​, b,​​​​​ and c​​​​​, return the maximum score you can get.*/

import java.util.Scanner;

public class maximumscorefromremovingstones {
    public int maximumScore(int a, int b, int c) {
        int maximumScore = (a + b + c) / 2;
        
        if (a > b && a > c) {
            maximumScore = Math.min (maximumScore, b + c);
        }
        else if (b > a && b > c) {
            maximumScore = Math.min (maximumScore, a + c);
        }
        else {
            maximumScore = Math.min (maximumScore, a + b);
        }
        
        return maximumScore;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int a=io.nextInt();
        int b=io.nextInt();
        int c=io.nextInt();
        maximumscorefromremovingstones s=new maximumscorefromremovingstones();
        System.out.println(s.maximumScore(a, b, c));
        io.close();
    }
}
