public class MiniPathSum{
    // Recursive method but timed out
    public static  int minPathSum(int[][] grid) {
        return opt(grid, 0, 0);
    }

    public static int opt(int[][]grid, int xpos, int ypos){
        if(xpos == grid.length-1 && ypos == grid[0].length-1){
            return grid[xpos][ypos];
        }
        else if(xpos == grid.length-1){
            return opt(grid, xpos, ypos+1) + grid[xpos][ypos];
        }
        else if(ypos == grid[0].length-1){
            return opt(grid, xpos+1, ypos) + grid[xpos][ypos];
        }
        else{
            return Math.min(opt(grid, xpos, ypos+1) + grid[xpos][ypos], opt(grid, xpos+1, ypos) + grid[xpos][ypos]);
        }
    }

    // Iterative method
    public static int minPathSum2(int[][] grid){
        for(int i =0; i < grid.length; i++){
            for(int j =0; j < grid[0].length; j++){
                if(i == 0 && j==0){
                    continue;
                }
                else if(i == 0 && j != 0){
                    grid[i][j] += grid[i][j-1];
                }
                else if(i !=0 && j == 0){
                    grid[i][j] += grid[i-1][j];
                }
                else{
                    grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
                }
            }
        }
        for(int i =0; i < grid.length; i++){
            for(int j =0; j < grid[0].length; j++){
                System.out.print(grid[i][j] + ",");
            }
            System.out.println();
        }
 
        return grid[grid.length-1][grid[0].length-1];
    } 
    public static void main(String[] args){
        /*int[][] arr = {{5,0,1,1,2,1,0,1,3,6,3,0,7,3,3,3,1},
                       {1,4,1,8,5,5,5,6,8,7,0,4,3,9,9,6,0},
                       {2,8,3,3,1,6,1,4,9,0,9,2,3,3,3,8,4},
                       {3,5,1,9,3,0,8,3,4,3,4,6,9,6,8,9,9},
                       {3,0,7,4,6,6,4,6,8,8,9,3,8,3,9,3,4},
                       {8,8,6,8,3,3,1,7,9,3,3,9,2,4,3,5,1},
                       {7,1,0,4,7,8,4,6,4,2,1,3,7,8,3,5,4},
                       {3,0,9,6,7,8,9,2,0,4,6,3,9,7,2,0,7},
                       {8,0,8,2,6,4,4,0,9,3,8,4,0,4,7,0,4},
                       {3,7,4,5,9,4,9,7,9,8,7,4,0,4,2,0,4},
                       {5,9,0,1,9,1,5,9,5,5,3,4,6,9,8,5,6},
                       {5,7,2,4,4,4,2,1,8,4,8,0,5,4,7,4,7},
                       {9,5,8,6,4,4,3,9,8,1,1,8,7,7,3,6,9},
                       {7,2,3,1,6,3,6,6,6,3,2,3,9,9,4,4,8}};*/
        //int[][] arr = {{3,8,6,0,5,9,9,6,3,4,0,5,7,3,9,3},{0,9,2,5,5,4,9,1,4,6,9,5,6,7,3,2},{8,2,2,3,3,3,1,6,9,1,1,6,6,2,1,9},{1,3,6,9,9,5,0,3,4,9,1,0,9,6,2,7},{8,6,2,2,1,3,0,0,7,2,7,5,4,8,4,8},{4,1,9,5,8,9,9,2,0,2,5,1,8,7,0,9},{6,2,1,7,8,1,8,5,5,7,0,2,5,7,2,1},{8,1,7,6,2,8,1,2,2,6,4,0,5,4,1,3},{9,2,1,7,6,1,4,3,8,6,5,5,3,9,7,3},{0,6,0,2,4,3,7,6,1,3,8,6,9,0,0,8},{4,3,7,2,4,3,6,4,0,3,9,5,3,6,9,3},{2,1,8,8,4,5,6,5,8,7,3,7,7,5,8,3},{0,7,6,6,1,2,0,3,5,0,8,0,8,7,4,3},{0,4,3,4,9,0,1,9,7,7,8,6,4,6,9,5},{6,5,1,9,9,2,2,7,4,2,7,2,2,3,7,2},{7,1,9,6,1,2,7,0,9,6,6,4,4,5,1,0},{3,4,9,2,8,3,1,2,6,9,7,0,2,4,2,0},{5,1,8,8,4,6,8,5,2,4,1,6,2,2,9,7}};
                       
        int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
        int s = minPathSum2(arr);
        System.out.print(s); 
    }
}