

public class Solution {

    public List<List<String>> solveNQueens(int n) {
            List<List<String>> res = new ArrayList<>();

                    char[][] board = new char[n][n];

                            // Initialize board with '.'
                                    for (int i = 0; i < n; i++) {
                                                Arrays.fill(board[i], '.');
                                                        }

                                                                backtrack(0, board, res);
                                                                        return res;
                                                                            }

                                                                                private void backtrack(int row, char[][] board, List<List<String>> res) {

                                                                                        // Base case: all queens placed
                                                                                                if (row == board.length) {
                                                                                                            List<String> snapshot = new ArrayList<>();
                                                                                                                        for (char[] r : board) {
                                                                                                                                        snapshot.add(new String(r));
                                                                                                                                                    }
                                                                                                                                                                res.add(snapshot);
                                                                                                                                                                            return;
                                                                                                                                                                                    }

                                                                                                                                                                                            // Try placing queen in each column
                                                                                                                                                                                                    for (int col = 0; col < board.length; col++) {
                                                                                                                                                                                                                if (isSafe(row, col, board)) {
                                                                                                                                                                                                                                board[row][col] = 'Q';

                                                                                                                                                                                                                                                backtrack(row + 1, board, res);

                                                                                                                                                                                                                                                                // Backtrack
                                                                                                                                                                                                                                                                                board[row][col] = '.';
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                            private boolean isSafe(int row, int col, char[][] board) {

                                                                                                                                                                                                                                                                                                                    // Check vertical (same column)
                                                                                                                                                                                                                                                                                                                            for (int i = row - 1; i >= 0; i--) {
                                                                                                                                                                                                                                                                                                                                        if (board[i][col] == 'Q') return false;
                                                                                                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                                                                                                        // Check left diagonal
                                                                                                                                                                                                                                                                                                                                                                for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                                                                                                                                                                                                                                                                                                                                                                            if (board[i][j] == 'Q') return false;
                                                                                                                                                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                                                                                                                                                            // Check right diagonal
                                                                                                                                                                                                                                                                                                                                                                                                    for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
                                                                                                                                                                                                                                                                                                                                                                                                                if (board[i][j] == 'Q') return false;
                                                                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                                                                                return true;
                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                    }