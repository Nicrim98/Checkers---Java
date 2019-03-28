import java.util.ArrayList;
import java.util.List;

public class Board { // utworzenie planszy do gry, z polami

    private Square[][] squares = new Square[8][8];

    private ArrayList pieces = new ArrayList<Piece>();

    public Board(int color) {    // utworzenie planszy szachowej

        for(int column = 0; column < squares.length; column++){
            for(int row = 0; row < squares.length; row++){
            //    this.squares[column][row] = new Square(column, row);
                // po stworzeniu klasy abstract początkowa inicljalizacja szachownicy coś szwankuje;
            }
        }

        if(color == 1){ // wybór gry białymi figurami
            for(int row = 0; row < squares.length; row++){  // inicjalizacja pionków na planszy
                pieces.add(new Pawn(2,row));
            }
        }

    }
    public Square getSquare(int column, int row){   // zapewnia dostep do danego pola
        return squares[column][row];
    }

}
