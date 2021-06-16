import java.util.Scanner;

public class wordsearch {
    int count;
  boolean found;
  private boolean backtrack(char[][] board, String word, int count, String current, int i, int j) {
   
    if (i >= board.length || i < 0 || j >= board[0].length || j < 0) {
      return false;
    }

   
    if (word.length() == count) {
      return true;
    }

    
    if (word.length() == 1 && board[i][j] == word.charAt(0)) {
      return true;
    }

    
    if (count < word.length() && board[i][j] != word.charAt(count)) {
      return false;
    }
   
    count++;
    char temp = board[i][j];

   
    board[i][j] = ' ';

    
    found = backtrack(board, word, count, current + board[i][j], i, j - 1) ||
      backtrack(board, word, count, current + board[i][j], i, j + 1) ||
      backtrack(board, word, count, current + board[i][j], i - 1, j) ||
      backtrack(board, word, count, current + board[i][j], i + 1, j);

    
    board[i][j] = temp;

    return found;
  }
  public boolean exist(char[][] board, String word) {
    count = 0;
    for (int i = 0; i < board.length; i++)
      for (int j = 0; j < board[0].length; j++)
        
        if (board[i][j] == word.charAt(0) && backtrack(board, word, count, "", i, j))
          return true;

    return false;
  }
  public static void main(String[] args) {
    Scanner io=new Scanner(System.in);
    int m=io.nextInt();
    int n=io.nextInt();
    char arr[][]=new char[m][n];
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            arr[i][j]=io.next().charAt(0);
        }
    }
    String str=io.nextLine();
    wordsearch s=new wordsearch();
    System.out.println(s.exist(arr,str));
    io.close();
  }
}
