// Last updated: 8/13/2026, 3:46:40 PM
class Solution {
    public boolean validTicTacToe(String[] board) {
        int xCount = 0, oCount = 0;

        for (String row : board) {
            for (char c : row.toCharArray()) {
                if (c == 'X') xCount++;
                else if (c == 'O') oCount++;
            }
        }

        
        if (oCount > xCount || xCount > oCount + 1) {
            return false;
        }

        boolean xWin = win(board, 'X');
        boolean oWin = win(board, 'O');

        
        if (xWin && oWin) {
            return false;
        }

        
        if (xWin && xCount != oCount + 1) {
            return false;
        }

        
        if (oWin && xCount != oCount) {
            return false;
        }

        return true;
    }

    private boolean win(String[] board, char p) {
       
        for (int i = 0; i < 3; i++) {
            if (board[i].charAt(0) == p &&
                board[i].charAt(1) == p &&
                board[i].charAt(2) == p) {
                return true;
            }
        }

        
        for (int j = 0; j < 3; j++) {
            if (board[0].charAt(j) == p &&
                board[1].charAt(j) == p &&
                board[2].charAt(j) == p) {
                return true;
            }
        }

        
        if (board[0].charAt(0) == p &&
            board[1].charAt(1) == p &&
            board[2].charAt(2) == p) {
            return true;
        }

        
        if (board[0].charAt(2) == p &&
            board[1].charAt(1) == p &&
            board[2].charAt(0) == p) {
            return true;
        }

        return false;
    }
}