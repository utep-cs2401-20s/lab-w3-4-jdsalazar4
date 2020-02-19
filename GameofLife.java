//constructors
    /*
    for each cell find neighbors, update state (lived/died)
     */


        //count live neighbors

        //return count



    /*
       r-1,c-1|r-1,c|r-1,c+1
         r,c-1| r,c |r,c+1
       r+1,c-1|r+1,c|r+1,c+1
     */



public class GameofLife {
    int size;
    int[][] board;
    int[][] previous;
    int row, col;

    public GameofLife() {

    }

    public GameofLife(int size) {
        this.size = size;
        int[][] board = new int[size][size];
        int[][] previous = new int[size][size];
    }


    public GameofLife(int[][] board) {
        this.size = board.length;
        this.previous = new int[this.size][this.size];
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                this.previous[i][j] = this.board[i][j];
            }
        }
        this.board = new int[size][size];
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                this.board[i][j] = board[i][j];
            }
        }
    }


    public void onestep() {//implements rules
        int neigh = 0;
        int i=0;
        int j=0;

        for (int m = -1; m <= 1; m++) {
            for (int n = -1; n <= 1; n++) {
                neigh += board[i + m][j + n];
            }
        }
        neigh -= board[i][j];

    }


    public int neighbors(int row, int col) {
        int neighbors = 0;
        if(board[row-1][col-1] == 1 && (row-1 >= 0) && (row-1 <= size) && (col-1 >= 0) && (col-1 <= size)){
            neighbors++;
        }
        if(board[row-1][col] == 1 && (row >= 0) && (row <= size) && (col >= 0) && (col <= size) ){
            neighbors++;
        }
        if(board[row][col-1] == 1 && (row >= 0) && (row <= size) && (col-1 >= 0) && (col-1 <= size) ){
            neighbors++;
        }
        if(board[row+1][col+1] == 1 && (row+1 >= 0) && (row+1 <= size) && (col+1 >= 0) && (col+1 <= size) ){
            neighbors++;
        }
        if(board[row+1][col] == 1 && (row+1 >= 0) && (row+1 <= size) && (col >= 0) && (col <= size) ){
            neighbors++;
        }
        if(board[row][col+1] == 1 && (row >= 0) && (row <= size) && (col+1 >= 0) && (col+1 <= size) ){
            neighbors++;
        }
        if(board[row-1][col+1] == 1 && (row-1 >= 0) && (row-1 <= size) && (col+1 >= 0) && (col+1 <= size)){
            neighbors++;
        }
        if(board[row+1][col-1] == 1 && (row+1 >= 0) && (row+1 <= size) && (col-1 >= 0) && (col-1 <= size) ){
            neighbors++;
        }
        return neighbors;
    }

    public void evolution(int n) {


        for (int i = 0; i < n; i++) {
            onestep();
        }
    }

}