class Solution {
    public int numIslands(char[][] grid) {
        int m = grid[0].length;
        int n = grid.length;
        int count = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == '1'){
                    count++;
                    // System.out.println("i"+i+" j"+j);
                    markZero(grid,i,j);
                }
            }
        }
        return count;
    }
    public void markZero(char[][] grid,int x, int y){
        int m = grid[0].length;
        int n = grid.length;
        if(x < n && y < m && x>=0 && y >=0){
            if(grid[x][y] == '1'){
                grid[x][y] = '0';
                markZero(grid,x,y-1);
                markZero(grid,x,y+1);
                markZero(grid,x-1,y);
                markZero(grid,x+1,y);
            }else{
                return;
            }
        }
    }
}
