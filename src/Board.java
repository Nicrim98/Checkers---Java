public class Board { // utworzenie planszy do gry, z polami

    private Square[][] squares = new Square[8][8];


    public Board() {    // utworzenie planszy szachowej

        for(int column = 0; column < squares.length; column++){
            for(int row = 0; row < squares.length; row++){
                this.squares[column][row] = new Square(column, row);
            }
        }

    }
    public Square getSquare(int column, int row){   // zapewnia dostep do danego pola
        return squares[column][row];
    }

}
