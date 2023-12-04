public class nQueen {
    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                 board[i][j] = '.';
            }
        }

        nQueen(board, 0);
   }

    private static void nQueen(char[][] board, int row) {

        if(row == board.length){
            printBoard(board);
           return;
        }

        for(int i = 0;i< board.length;i++){
            board[row][i] = 'Q';
            nQueen(board, row+1);
            board[row][i] = '.';
        }
    }

    private static void printBoard(char[][] board) {
         int n = board.length;
          for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                  System.out.print(board[i][j]+" ");
            }System.out.println();
        }
        System.out.println("\n\n");
    }
}
