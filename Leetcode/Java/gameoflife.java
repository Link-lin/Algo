public class gameoflife{

    public static int numLiveCell(int[][]board, int x, int y){
        int count = 0;
        for(int i = x-1; i <=x+1; i++){
            for(int j = y-1; j <= y+1; j++){
                if(i < 0 || i>= board.length || j<0 || j>=board[0].length){
                    continue;
                }
                if(i ==x && j == y) continue;
                if((board[i][j]&1) == 1) count ++;
            }
        }
        return count;
    }

    public static int nextState(int curr, int numLive){
        if(curr == 1){
            // Live cell with less than 2 live neighbor dies
            if(numLive < 2 || numLive >3) return 0;
            else return 1;
        }
        else{
            if(numLive == 3) return 1;
            return 0;
        }
    }

    public static void gameOfLife(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int numLive = numLiveCell(board, i, j);
                board[i][j] += nextState(board[i][j], numLive)<<1;
            }
        }

        for(int i =0; i < board.length; i++){
            for(int j =0; j < board[0].length; j++){
                board[i][j] = board[i][j]>> 1;
            }
        }
    }
    public static void main(String[] args){
        int[][] s = {{0,1,0}, {0,0,1},{1,1,1},{0,0,0}};
        System.out.println("Start:");
        for(int i = 0; i < s.length; i++){
            for(int j =0; j< s[0].length; j++){
                System.out.print(s[i][j]);
            }
            System.out.println();
        }

        gameOfLife(s);

        System.out.println("Next:");
        for(int i = 0; i < s.length; i++){
            for(int j =0; j< s[0].length; j++){
                System.out.print(s[i][j]);
            }
            System.out.println();
        }
    }
}