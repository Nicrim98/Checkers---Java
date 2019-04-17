public class Pawn extends Piece { // to była klasa bishop, zostawiłem ją bo w sumie to pionki w warcabach
    // chodzą podobnie jak bishop w szachach

    private Square square;
    private Square wanted_square;

    private int color;

    public Pawn(Square square, int color) {
        this.color = color;
        this.square = square;
    }

    //@Override // nadpisujemy klase may_i_move z piece
    public boolean may_i_move() { // bishop metoda + metoda na zbicia

//        ///   for(int i=1; i<8; i++){ // tu ta 8 sprawi w pewnych przypadkach out of border naszej szachownicy wiec trzea to zedytowac potem
//        if (wanted_column == curr_column + 1 && wanted_row == curr_row + 1) {
//            return true;
//            //  break;
//        }
//        if (wanted_column == curr_column + 1 && wanted_row == curr_row - 1) {
//            return true;
//            //break;
//        }
//
//        if (wanted_column == curr_column - 1 && wanted_row == curr_row - 1) {
//            return true;
//            //  break;
//        }
//
//        if (wanted_column == curr_column - 1 && wanted_row == curr_row + 1) {
//            return true;
//            //  break;
//        } else return false;
//        //    break;
//
//    }
//
        return true;
    }
     public String toString() {

          String squareString;


          String[] list_of_pieces = {" ", "W", "B"};

          squareString = list_of_pieces[color];
          return squareString;

     }

}
