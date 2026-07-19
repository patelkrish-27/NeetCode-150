class Solution {
    public boolean isValidSudoku(char[][] board) {
        int count = 0;
        for (int i = 0; i < 9; i++) {
            HashSet<Character> hset = new HashSet<>();
            HashSet<Character> hset2 = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (hset.contains(c) && c != '.') {
                    return false;
                } else {
                    hset.add(c);
                }
                c = board[j][i];
                if (hset2.contains(c) && c != '.') {
                    return false;
                } else {
                    hset2.add(c);
                }
            }
        }

        HashSet<Character>[] hset = new HashSet[9];
        for (int i = 0; i < 9; i++) {
            hset[i] = new HashSet<>();
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                int box = (i / 3) * 3 + (j / 3);
                if (hset[box].contains(c) && c != '.') {
                    return false;
                } else {
                    hset[box].add(c);
                }
            }
        }

        return true;
    }

}
