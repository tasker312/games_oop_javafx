package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        int[] diagonal = getDiagonal(board);
        for (int i = 0; i < diagonal.length; i++) {
            if (diagonal[i] == 1 && (checkRow(board, i) || checkColumn(board, i))) {
                return true;
            }
        }
        return false;
    }

    private static int[] getDiagonal(int[][] board) {
        int[] diagonal = new int[board.length];
        for (int i = 0; i < board.length; i++) {
            diagonal[i] = board[i][i];
        }
        return diagonal;
    }

    private static boolean checkRow(int[][] board, int row) {
        for (int num : board[row]) {
            if (num != 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkColumn(int[][] board, int col) {
        for (int[] row : board) {
            if (row[col] != 1) {
                return false;
            }
        }
        return true;
    }
}
