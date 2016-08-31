public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        
        int r = board.length;
        int c = 0;
        if(r > 0){
            c = board[0].length;
        }
        
        for(int i=0; i < r; i++){
            /* perform horizontal checks */
            Set<Character> rowChecker = new HashSet<Character>();    
            for(int j=0; j < c; j++){
                char ch = board[i][j];
                if(Character.isDigit(ch)){
                    if(!rowChecker.add(ch)){
                        return false;
                    }
                }
            }
        }
        
        for(int i=0; i < c; i++){
            /* perform vertical checks */
            Set<Character> colChecker = new HashSet<Character>();    
            for(int j=0; j < r; j++){
                char ch = board[j][i];
                if(Character.isDigit(ch)){
                    //System.out.println(ch);
                    if(!colChecker.add(ch)){
                        return false;
                    }
                }
            }
        }
        
        for(int i=0; i < r; i+=3){
            for(int j=0; j < c; j+=3){
                /* perform 3X3 box check */
                Set<Character> boxChecker = new HashSet<Character>();
                for(int m = i; m < i+3; m++){
                    for(int n=j; n < j+3; n++){
                        char ch = board[m][n];
                        if(Character.isDigit(ch)){
                            if(!boxChecker.add(ch)){
                                return false;
                            }
                        }
                    }    
                }
            }
        }
        
        return true;
    }
    
   /*"..4...63.",
     ".........",
     "5......9.",
     "...56....",
     "4.3.....1",
     "...7.....",
     "...5.....",
     ".........",
     "........."*/
}