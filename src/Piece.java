public abstract class Piece { // pomysł na zrobienie wstepnie szkieletu figury, jak w przypadku pokera była karta

    private int color;

    protected Square square;

    // domyslny konstruktor do piece, jego brak powoduje blad konstruktora w klasie Pawn
    public Piece(){
    }

    //Tworzy nowego pionka
    public Piece(Square square, int color) {
        this.square = square;
        this.color = color;
    }

    // Sprawdza mozliwosc ruchu podając square na który chcemy się przemieścić
    // Zwraca true albo false
    public abstract Move may_i_move(Square square);

//        if(wanted_column == curr_column ){
//            return true;
//        }
//        else if(wanted_row == curr_row){
//            return true;
//        }
//
//

    public void make_move(Square square) {
        this.square.removePiece();
        this.square = square;
        this.square.putPiece(this);
    }

    // zagladnac jeszcze do klasy figure i podopisywac
    public Square removeSquare() {
        Square previous = this.square;
        this.square = null;
        return previous;
    }

    // Dostajemy kolor pionka
    public int getColor() {
        return color;
    }

    public Square getSquare(){
        return square;
    }

    public String toString(){

        String squareString;

        String[] list_of_pieces = { " ", "W", "B"};

        squareString = list_of_pieces[color];
        return squareString ;

    }
}
