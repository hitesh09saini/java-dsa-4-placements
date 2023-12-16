public class nQueen {
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        nQueen(board, 0);
    }

    private static void nQueen(char[][] board, int row) {

        if (row == board.length) {
            printBoard(board);
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (isSafe(row, i, board)) {
                board[row][i] = 'Q';
                nQueen(board, row + 1);
                board[row][i] = '.';
            }
        }
    }

    private static boolean isSafe(int r, int c, char[][] b) {
        // up
        for (int i = r-1; i >= 0; i--) {
            if (b[i][c] == 'Q')
                return false;
        }

        // left dig.
      
        for (int i = r-1, j= c-1; i >= 0 && j>=0; i--,j--) {
            if (b[i][j] == 'Q')
                return false;

        }

        // right dig.

        for (int i = r-1,j = c+1; i >=0 && j< b.length; i--,j++) {
            if (b[i][j] == 'Q')
                return false;

        }

        return true;
    }

    private static void printBoard(char[][] board) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }
}
