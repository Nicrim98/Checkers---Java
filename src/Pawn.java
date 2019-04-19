public class Pawn extends Piece { // to była klasa bishop, zostawiłem ją bo w sumie to pionki w warcabach
    // chodzą podobnie jak bishop w szachach

    private Square square;
    private Square wanted_square;
    private Board board;

    private int color;
    private int color_temp;



    public Pawn(Board board,  Square square, int color) {
        this.color = color;
        this.square = square;
        this.board = board;

    }

    //@Override // nadpisujemy klase   z piece
//    public boolean may_i_move(Square square, Square wanted_square) { // bishop metoda + metoda na zbicia
//        Possition possition = this.square.getPossition();
//
//        if(possition.difference_rows())

// tu ja cos kminie ot nich z ta klasa possition

    @Override // nadpisujemy klase may_i_move z piece
    public boolean may_i_move(Square square) {
            if (square == null || square.equals(this.square)){
                return false;
            }
            if(!can_move_freely(square)){
                return false;
            }
        return true;
    }




    public boolean can_move_freely(Square square){
        Possition pozycja = this.square.getPossition();
        if(pozycja.difference_rows(square.getPossition()) == square.getPiece().getColor() && Math.abs(pozycja.difference_columns(square.getPossition())) == 1){
            return true;
        }
        return false;
    }

    public Square square_jumped(Square squareto) throws NoPieceTojumpover {
        Possition possition = this.square.getPossition();
        for(int i = -1; i <= 1; i+=2){
            for(int j = -1; j <=1; j+=2){
                if(possition.difference_rows(squareto.getPossition()) == 2 * i && possition.difference_columns(squareto.getPossition())==2*j){
                    Square square_jumped = this.board.getSquare(new Possition(square.getRow() + i, square.getColumn() + j));
                    if(square_jumped.getPiece() == null) throw new NoPieceTojumpover();
                    if(square_jumped.getPiece().getColor() == this.getColor()*(-1)) return square_jumped;
                }
            }
        }
        return null;
    }


     public String toString() {

          String squareString;
          if(color == 1){
              color_temp = 1;
          }
          if(color == -1){
              color_temp = 2;
          }

          String[] list_of_pieces = {" ", "W", "B"};

          squareString = list_of_pieces[color_temp];
          return squareString;

     }

}
