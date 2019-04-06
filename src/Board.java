import java.util.ArrayList;
import java.util.List;

public class Board { // utworzenie planszy do gry, z polami

    private Square[][] squares = new Square[8][8];

    private ArrayList pieces = new ArrayList<Piece>(); // Jak na razie jedyna arraylista

    private final int white = 1;
    private final int black = 1;

    public Board() {    // utworzenie planszy szachowej, ustawienie początkowe

        for(int column = 0; column < squares.length; column++){
            for(int row = 7; row >= 0; row--){
                this.squares[column][row] = new Square(column, row);
            }
        }
        // nadpisanie ustawienie początkowego pionkami do gry zamiast pustych pól, które są tworzone powyżej

        for(int row = 0; row < 3; row++){  // białe pionki - początkowe ustawienie
            for(int column = 1; column < 8; column++) {
                if (row % 2 == 0) {
                    this.squares[column][row] = new Square("W");
                    // dodać do array listy pieces - pionki
                }
                else {
                    this.squares[column-1][row] = new Square("W");
                }
            }
        }

        for(int row = 5; row < 8; row++){  // białe pionki - początkowe ustawienie
            for(int column = 1; column < 8; column++) {
                if (row % 2 == 1) {
                    this.squares[column-1][row] = new Square("B");
                    // dodać do array listy pieces - pionki
                }
                else {
                    this.squares[column][row] = new Square("B");
                }
            }
        }

    }
    public Square getSquare(int column, int row){   // zapewnia dostep do danego pola
        return squares[column][row];
    }

}
