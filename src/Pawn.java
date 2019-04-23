public class Pawn extends Piece {

    public Pawn(Board board,  Square square, int color) {
        super(board, square, color);
    }

    @Override // nadpisujemy klase may_i_move z piece
    public boolean may_i_move(Square square) {
            if(!can_move_freely(square)){
                return false;
            }
        try {
            if(!can_square_jumped(square)){
                return false;
            }
        } catch (NoPieceTojumpover noPieceTojumpover) {
            noPieceTojumpover.printStackTrace();
        }
        return true;
    }


    public boolean can_move_freely(Square square){

      //    Possition possition = this.square.getPossition(this.square);
//          //  System.out.println(this.board.getSquare(possition).getPiece().getColor());
//            // Przy tym jest błąd typu Null pointer- this.square.getPossition(this.square)).getPiece().getColor());
//            // Poza tym possition.difference_rows(square.getPossition(square)) zwraca '0', a chyba powinno zwrócić '1'
//            if(possition.difference_rows(square.getPossition(square)) == 1 && Math.abs(possition.difference_columns(square.getPossition(square))) == 1){
//                return true;
//            }
        return false;
    }

    public boolean can_square_jumped(Square squareto) throws NoPieceTojumpover {
        Possition possition = this.square.getPossition(this.square);
        for(int i = -1; i <= 1; i+=2){
            for(int j = -1; j <=1; j+=2){
                if(possition.difference_rows(squareto.getPossition(squareto)) == 2 * i && possition.difference_columns(squareto.getPossition(squareto))==2*j){
                    Square square_jumped = this.board.getSquare(new Possition(square.getRow() + i, square.getColumn() + j));
                    if(square_jumped.getPiece() == null) return false;//throw new NoPieceTojumpover();
                    if(square_jumped.getPiece().getColor() == (this.getColor() * (-1))){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
