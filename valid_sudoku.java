class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> row = new HashSet();
        Set<Character> col = new HashSet();
        
        // Checking by rows
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) 
                if(!row.add(board[i][j]) && board[i][j] != '.')
                    return false;
            row.clear();
        }
            
            
        
        // Checking by columns
         for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) 
               if(!col.add(board[j][i]) && board[j][i] != '.')
                   return false;
            col.clear();
        }
        
        // Checking by 3x3 sub boxes
        Set<Character> sub_boxes = new HashSet();
        for(int a = 0; a <= 6; a+=3) { 
            for(int b = 0; b <= 6; b+=3) {
                for(int c = a; c < a+3; c++) {
                    for(int d = b; d < b+3; d++) {
                        if(!sub_boxes.add(board[c][d]) && board[c][d] != '.')
                            return false;
                    }
                }
                sub_boxes.clear();
            }
        }
        return true;
    }
}