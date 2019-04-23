public class Queen extends Piece {


    public Queen(Board board, Square square, int color){
        super(board,square,color);
    }

    @Override
    public boolean may_i_move(Square square){
        if(square == null || square.equals(this.square)){
            return false;
        }

        // wprowadzić algorytm przesuwania

        return true;
    }

    @Override
    public boolean can_move_freely(Square square){
        return true;
    }
}

