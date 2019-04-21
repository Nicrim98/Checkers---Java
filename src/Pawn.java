public class Pawn extends Piece {

    private Square square;
    private Board board;

    private int pawn_color = 0;
    private int color_temp;


    public Pawn(Board board,  Square square, int color) {
        this.pawn_color = color;
        this.square = square;
        this.board = board;
    }

    @Override
    public int getColor() {
        return pawn_color;
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

        Possition possition = this.square.getPossition(this.square);

        if(possition.difference_rows(square.getPossition(square)) == board.getSquare(this.square.getPossition(this.square)).getPiece().getColor() && Math.abs(possition.difference_columns(square.getPossition(square))) == 1){
            return true;
        }
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

     public String toString() {

          String squareString;
          if(pawn_color == 1){
              color_temp = 1;
          }
          if(pawn_color == -1){
              color_temp = 2;
          }

          String[] list_of_pieces = {" ", "W", "B"};

          squareString = list_of_pieces[color_temp];
          return squareString;

     }
}
