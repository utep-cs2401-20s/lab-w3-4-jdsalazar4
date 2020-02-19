public class TorusGameOfLife extends GameofLife {
    //  retype constructos
    // inherit: neighbors, onestep, evolution
   public TorusGameOfLife(int[][] board){
       super(board);
   }
    @Override
    public int neighbors(int row, int col){
        int neighbors = 0;
        if(board[(row+size-1)%size][(col+size-1)%size]==1){
            neighbors++;
        }
        if(board[(row+size-1)%size][col]==1) {
            neighbors++;
        }
        if(board[row][(row+size-1)%size]==1){
            neighbors++;
        }
        if(board[(row+size+1)%size][(col+size+1)%size]==1){
            neighbors++;
        }
        if(board[(row+size+1)%size][col]==1) {
            neighbors++;
        }
        if(board[row][(row+size+1)%size]==1){
            neighbors++;
        }
        if(board[(row+size-1)%size][(col+size+1)%size]==1){
            neighbors++;
        }
        if(board[(row+size+1)%size][(col+size-1)%size]==1){
            neighbors++;
        }
        return neighbors;
    }

}
        //use modulus(%)
        // 2 % 7 = 2
        //  8 % 7 = 1
        //  9 % 7 = 2
        // -1 % 7 = 6
        /*
            if size = 7
            r = 2   2%7=2
            r = 6
            6 % 7 = 6
            (6+1) % 7 = 0
            (6-1) %
        */





