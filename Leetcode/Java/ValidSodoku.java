class ValidSodoku{

    public static boolean isValidSudoku(char[][] board){

        int dial[] = {0,0,0,0,0,0,0,0,0};
        int diar[] = {0,0,0,0,0,0,0,0,0};

        int first[] = {0,0,0,0,0,0,0,0,0};
        int second[] = {0,0,0,0,0,0,0,0,0};
        int third[] = {0,0,0,0,0,0,0,0,0};
        int fourth[] = {0,0,0,0,0,0,0,0,0};
        int fifth[] = {0,0,0,0,0,0,0,0,0};
        int seventh[] = {0,0,0,0,0,0,0,0,0};
        int sixth[] = {0,0,0,0,0,0,0,0,0};
        int eighth[] = {0,0,0,0,0,0,0,0,0};
        int ninth[] = {0,0,0,0,0,0,0,0,0};
        
        for(int i = 0; i < 9 ; ++i){
            int row[] = {0,0,0,0,0,0,0,0,0};
            int col[] = {0,0,0,0,0,0,0,0,0};
            for(int j =0 ; j <9 ; ++j){
                int n =  Character.getNumericValue(board[i][j])-1;
                if(n != -2) {
                    row[n] += 1;
                    if(row[n] == 2) return false;
                }

                int c = Character.getNumericValue(board[j][i])-1;
                if (c != -2){
                    col[c] += 1; 
                    if(col[c] == 2) return false;
                }

                // Diagonal from top left to bottem right
                if(i == j){
                    int lr = Character.getNumericValue(board[i][j])-1;
                    if(lr != -2){
                         dial[lr] += 1;
                        if(dial[lr] == 2) return false;
                    }
                }

                // Diagnnal from top right to bottem left
                if(j == 8-i){
                    int rl = Character.getNumericValue(board[i][8-i])-1;
                    if(rl != -2){
                        diar[rl] += 1;
                        if(diar[rl] == 2) return false;
                    }
                }

                if(i < 3 && j<3){
                    int x = Character.getNumericValue(board[i][j])-1;
                    if(x != -2){
                        first[x] +=1;
                        if(first[x]  == 2) return false;
                    }
                }

                if( j>=3 && j< 6 && i<3){
                    int x = Character.getNumericValue(board[i][j])-1;
                    if(x != -2){
                        second[x] +=1;
                        if(second[x]  == 2) return false;
                    }
                }

                if( j>=6 && i<3){
                    int x = Character.getNumericValue(board[i][j])-1;
                    if(x != -2){
                        third[x] +=1;
                        if(third[x]  == 2) return false;
                    }
                }

                if( j<3 && i>=3 && i<6){
                    int x = Character.getNumericValue(board[i][j])-1;
                    if(x != -2){
                        fourth[x] +=1;
                        if(fourth[x]  == 2) return false;
                    }
                }
                if( j>=3 && j < 6 && i>=3 && i<6){
                    int x = Character.getNumericValue(board[i][j])-1;
                    if(x != -2){
                        fifth[x] +=1;
                        if(fifth[x]  == 2) return false;
                    }
                }
                if( j>=6 && i>=3 && i<6){
                    int x = Character.getNumericValue(board[i][j])-1;
                    if(x != -2){
                        sixth[x] +=1;
                        if(sixth[x]  == 2) return false;
                    }
                }


                if( j<3 && i>=6){
                    int x = Character.getNumericValue(board[i][j])-1;
                    if(x != -2){
                        seventh[x] +=1;
                        if(seventh[x]  == 2) return false;
                    }
                }
                if( j>=3 && j < 6 && i>=6){
                    int x = Character.getNumericValue(board[i][j])-1;
                    if(x != -2){
                        eighth[x] +=1;
                        if(eighth[x]  == 2) return false;
                    }
                }
                if( j>=6 && i>=6){
                    int x = Character.getNumericValue(board[i][j])-1;
                    if(x != -2){
                        ninth[x] +=1;
                        if(sixth[x]  == 2) return false;
                    }
                }
            }
        }

        return true;
    }

    public static boolean isValidSudoku2(char[][] board){

        int first[] = {0,0,0,0,0,0,0,0,0};
        int second[] = {0,0,0,0,0,0,0,0,0};
        int third[] = {0,0,0,0,0,0,0,0,0};
        int fourth[] = {0,0,0,0,0,0,0,0,0};
        int fifth[] = {0,0,0,0,0,0,0,0,0};
        int seventh[] = {0,0,0,0,0,0,0,0,0};
        int sixth[] = {0,0,0,0,0,0,0,0,0};
        int eighth[] = {0,0,0,0,0,0,0,0,0};
        int ninth[] = {0,0,0,0,0,0,0,0,0};
        
        for(int i = 0; i < 9 ; ++i){
            int row[] = {0,0,0,0,0,0,0,0,0};
            int col[] = {0,0,0,0,0,0,0,0,0};
            for(int j =0 ; j <9 ; ++j){
                if(board[i][j] != '.'){
                    int n = board[i][j] - '0' -1;
                    row[n] += 1;
                    if(row[n] == 2) return false;
                }

                if(board[j][i] != '.'){
                    int c = board[j][i] - '0' -1;
                    col[c] += 1; 
                    if(col[c] == 2) return false;
                }
                /*
                // Diagonal from top left to bottem right
                if(i == j){
                    int lr = Character.getNumericValue(board[i][j])-1;
                    if(lr != -2){
                         dial[lr] += 1;
                        if(dial[lr] == 2) return false;
                    }
                }

                // Diagnnal from top right to bottem left
                if(j == 8-i){
                    int rl = Character.getNumericValue(board[i][8-i])-1;
                    if(rl != -2){
                        diar[rl] += 1;
                        if(diar[rl] == 2) return false;
                    }
                }
                */

                if(i < 3 && j<3 && board[i][j] !='.'){
                        int x = board[i][j] - '0' -1;
                        first[x] +=1;
                        if(first[x]  == 2) return false;
                }

                if( j>=3 && j< 6 && i<3 && board[i][j] != '.'){
                        int x = board[i][j] - '0' -1;
                        second[x] +=1;
                        if(second[x]  == 2) return false;
                }

                if( j>=6 && i<3 && board[i][j] != '.'){
                        int x = board[i][j] - '0' -1;
                        third[x] +=1;
                        if(third[x]  == 2) return false;
                }

                if( j<3 && i>=3 && i<6 && board[i][j] != '.'){
                        int x = board[i][j] - '0' -1;
                        fourth[x] +=1;
                        if(fourth[x]  == 2) return false;
                }
                if( j>=3 && j < 6 && i>=3 && i<6 && board[i][j] != '.'){
                        int x = board[i][j] - '0' -1;
                        fifth[x] +=1;
                        if(fifth[x]  == 2) return false;
                }
                if( j>=6 && i>=3 && i<6 && board[i][j] != '.'){
                        int x = board[i][j] - '0' -1;
                        sixth[x] +=1;
                        if(sixth[x]  == 2) return false;
                }


                if( j<3 && i>=6 && board[i][j] != '.' ){
                        int x = board[i][j] - '0' -1;
                        seventh[x] +=1;
                        if(seventh[x]  == 2) return false;
                }
                if( j>=3 && j < 6 && i>=6 && board[i][j] != '.'){
                        int x = board[i][j] - '0' -1;
                        eighth[x] +=1;
                        if(eighth[x]  == 2) return false;
                }
                if( j>=6 && i>=6 && board[i][j] != '.'){
                        int x = board[i][j] - '0' -1;
                        ninth[x] +=1;
                        if(ninth[x]  == 2) return false;
                }
            }
        }

        return true;
    }

    public static boolean isValidSudoku3(char[][] board){
        
        int bit;
        int combo;

        final int dotMask = 0x1<<'.';
        int[][] squares = new int[3][3];
                
        for(int i =0;i<board[0].length;i++){
            int row = 0x0000000;
            int col = 0x0000000;
                
            for(int j=0;j<9;j++){
                    
                bit = 0x1<<board[i][j];
                combo = row&bit;
                if(combo>0&& combo!=dotMask){
                    return false;
                }
                row |=bit;
                    
                    
                bit = 0x1<<board[j][i];
                combo = col&bit;
                if(combo>0&&combo!=dotMask){
                    return false;
                }
                col|=bit;
                    
                bit = 0x1<<board[j][i];
                combo = bit&squares[i/3][j/3];
                if(combo>0&&combo!=dotMask){
                    return false;
                }
                squares[i/3][j/3]|=bit;
                    
                    
            }
        }
        return true;

    }

    public static void main(String[] args){
        char s = '.';
        System.out.print(Character.getNumericValue(s));
        char[][] board =  {{'.','.','.','.','.','.','.','.','2'},{'.','.','.','.','.','.','6','.','.'},{'.','.','1','4','.','.','8','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','.','.','3','.','.','.','.'},{'5','.','8','6','.','.','.','.','.'},{'.','9','.','.','.','.','4','.','.'},{'.','.','.','.','5','.','.','.','.'}};
        boolean n = isValidSudoku2(board);
        System.out.print(n);
        

    }

}