import java.util.ArrayList;
import java.util.List;

public class Board { // utworzenie planszy do gry, z polami

    private Square[][] squares = new Square[8][8];

    private ArrayList pieces = new ArrayList<Piece>();

    public Board(int color) {    // utworzenie planszy szachowej

        for(int column = 0; column < squares.length; column++){
            for(int row = 7; row >= 0; row--){
                this.squares[column][row] = new Square(column, row);
            }
        }

        if(color == 1){ // wybór gry białymi figurami
            for(int column = 0; column < squares.length; column++){  // inicjalizacja pionków na planszy
                pieces.add(new Pawn(column,6, color));
                squares[column][6] = new Square("P"); // tworzenie pionków
            }
            squares[0][7] = new Square("R"); // tworzenie wież
            squares[7][7] = new Square("R");
            squares[1][7] = new Square("N");
            squares[6][7] = new Square("N");
            squares[2][7] = new Square("B");
            squares[5][7] = new Square("B");
            squares[4][7] = new Square("Q");
            squares[3][7] = new Square("K");

        }

    }
    public Square getSquare(int column, int row){   // zapewnia dostep do danego pola
        return squares[column][row];
    }

}
