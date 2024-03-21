class Solution {
    public boolean isValidSudoku(char[][] board) {
        //A Sudoku board (partially filled) could be valid but is not necessarily solvable.
        //Therefore only the filled cells need to be validated
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] != '.') {
                    if (!isSafe(board, row, col, board[row][col])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean isSafe(char[][] board, int row, int col, char digit) {
        // Check row
        for (int i = 0; i < 9; i++) {
            if (i != col && board[row][i] == digit) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < 9; i++) {
            if (i != row && board[i][col] == digit) {
                return false;
            }
        }

        // Check 3x3 grid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (i != row && j != col && board[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

}

