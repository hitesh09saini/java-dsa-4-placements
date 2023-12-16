public class sudoku {
    public static void main(String[] args) {
        int sudoku[][] = {{0,0,8,0,0,0,0,0,0},
                          {4,9,0,1,5,7,0,0,2},
                          {0,0,3,0,0,4,1,9,0},
                          {1,8,5,0,6,0,0,2,0},
                          {0,0,0,0,2,0,0,6,0},
                          {9,6,0,4,0,5,3,0,0},
                          {0,3,0,0,7,2,0,0,4},
                          {0,4,9,0,3,0,0,5,7},
                          {8,2,7,0,0,9,0,1,3}
                        };

        System.out.println(sudokuSolver(sudoku, 0, 0));
        print(sudoku);
    }

    private static void print(int[][] sudoku) {
        for (int i= 0;i<9;i++) {  
            for (int j =0;j<9;j++) {
                System.out.print(sudoku[i][j]+" ");
            }System.out.println();
        }
    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col){

        // base case
        if(row == 9 ){
            return true;
        }

        // recursion
        int nextRow = row, nextCol = col+1;
        if(col+1 == 9){
            nextRow = row+1;
            nextCol = 0;
        }

        if(sudoku[row][col]!=0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        for(int digit= 1; digit <=9; digit++){
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col] = digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)){
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col, int digit) {
        for(int i=0; i<9; i++){
            if(board[i][col] == digit){ 
                return false;
            }
            if(board[row][i] ==digit){ 
                return false;
            }
            if(board[3*(row/3) + (i/3)][3*(col/3) + (i%3)] == digit){ // Checks 3*3 Matrix
                return false;
            }
        }
        return true;
    }
}
