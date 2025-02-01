package Investigate;

public class WordSearch2Ownapproach {
    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
        System.out.println(exist(board, word));
    }

    static boolean[][] visited;

    public static boolean exist(char[][] board, String word) {
        int count=0;
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++){
                if ((word.charAt(0) == board[i][j]) && dfsFill(board, word, i, j, 0)) {
                    return true;
                }
            }
        return false;
    }

    private static boolean dfsFill(char[][] grid,String word, int i, int j,int index){
        if (i >= grid.length || i < 0 || j >= grid[i].length || j < 0 || grid[i][j] != word.charAt(index)) {
            return false;
        }
            grid[i][j]='0';
            if(dfsFill(grid,word, i + 1, j,index+1) ||
            dfsFill(grid,word, i - 1, j,index+1) ||
            dfsFill(grid,word, i, j + 1,index+1) ||
            dfsFill(grid,word, i, j - 1,index+1)) return true;
        return false;
    }
}
