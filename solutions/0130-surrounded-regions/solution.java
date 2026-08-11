class Solution {
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O') {
                mark(board, i, 0, n, m);
            }
        }
        for (int i = 0; i < m; i++) {
            if (board[0][i] == 'O') {
                mark(board, 0, i, n, m);
            }
        }
        for (int i = 0; i < n; i++) {
            if (board[i][m - 1] == 'O') {
                mark(board, i, m - 1, n, m);
            }
        }
        for (int i = 0; i < m; i++) {
            if (board[n - 1][i] == 'O') {
                mark(board, n - 1, i, n, m);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == '-') {
                    board[i][j] = 'O';
                }
            }
        }

    }

    public void mark(char[][] board, int i, int j, int n, int m) {
        if (i < n && i >= 0 && j < m && j >= 0 && board[i][j] == 'O') {
            board[i][j] = '-';
            mark(board, i + 1, j, n, m);
            mark(board, i - 1, j, n, m);
            mark(board, i, j + 1, n, m);
            mark(board, i, j - 1, n, m);
        }
    }
}
