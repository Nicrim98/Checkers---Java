public class Queen extends Piece {


    public Queen(Square square, int color){
        //super(square,color);
    }

    public Queen(Queen newQueen, Square square){
        this(square, newQueen.getColor());
    }

    @Override
    public boolean may_i_move(Square square){
        if(square == null || square.equals(this.square)){
            return false;
        }

        // wprowadzić algorytm przesuwania

        return true;
    }
}

