public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int number = 0;
        
        for(int i=0; i < grid.length; i++){
            for(int j=0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    number++;
                    turnToZero(grid, i, j);
                }
            }
        }
        
        return number;
    }
    
    public void turnToZero(char[][] grid, int x, int y){
        if(x >= grid.length || x < 0 || y >= grid[x].length || y < 0 || grid[x][y] == '0') return;
        
        grid[x][y] = '0';
        
        turnToZero(grid, x+1, y);
        turnToZero(grid, x, y+1);
        turnToZero(grid, x-1, y);
        turnToZero(grid, x, y-1);
    }
    
    
    /*private void clearIsland(char[][] grid, int i, int j) {
        while (grid[i][j] == '1') {
            grid[i][j] = '0';
            if (i != 0 && grid[i-1][j] != '0') clearIsland(grid, i-1, j);
            if (i != grid.length-1 && grid[i+1][j] != '0') clearIsland(grid, i+1, j);
            if (j != 0 && grid[i][j-1] != '0') clearIsland(grid, i, j-1);
            if (j != grid[0].length-1 && grid[i][j+1] != '0') clearIsland(grid, i, j+1);
        }
    }*/

}