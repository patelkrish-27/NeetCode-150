class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int max = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == 1){
                    max = Math.max(countArea(grid,i,j,n,m),max);
                }
            }
        }
        return max;
    }

    public int countArea(int[][] grid,int i,int j,int n,int m){
        int area = 0;
        if(i < n && i>=0 && j <m && j >= 0){
            if(grid[i][j] == 1){
                grid[i][j] = 0;
                area += 1 + countArea(grid,i,j+1,n,m) + countArea(grid,i,j-1,n,m) + countArea(grid,i-1,j,n,m)+countArea(grid,i+1,j,n,m);
            }
        }
        return area;
    }
}
