class Solution {
    public int orangesRotting(int[][] grid) {
        int minutes =-1;
        int n =grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new ArrayDeque<>();
        for(int i = 0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
            }
        }
        while(!q.isEmpty()){
            int x = q.size();
            for(int z=0;z<x;z++){
                int[] node = q.poll();
                int i=node[0];
                int j = node[1];
                grid[i][j]=2;
                if(check(grid,i+1,j,n,m)){
                    grid[i+1][j]=2;
                    q.add(new int[]{i+1,j});
                   
                }
                if(check(grid,i-1,j,n,m)){
                    grid[i-1][j]=2;
                    q.add(new int[]{i-1,j});
                }
                if(check(grid,i,j+1,n,m)){
                    grid[i][j+1]=2;
                    q.add(new int[]{i,j+1});
                }
                if(check(grid,i,j-1,n,m)){
                    grid[i][j-1]=2;
                    q.add(new int[]{i,j-1});
                }
            }
            minutes++;
        }
        for(int[] row:grid){
            for(int x:row){
                if(x==1){
                    return -1;
                }
            }
        }
        return minutes==-1?0: minutes;
    }
    public boolean check(int[][] grid,int i,int j,int n,int m){
        if(i<n && i>=0 && j<m && j>=0){
            if(grid[i][j]==1){
                return true;
            }
        }
        return false;
    }
}
