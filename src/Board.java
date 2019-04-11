import java.util.ArrayList;
import java.util.List;

public class Board { // utworzenie planszy do gry, z polami

    private final int width = 8;
    private final int height = 8;

    private Square[][] squares = new Square[width][height];

    private ArrayList pieces = new ArrayList<Piece>(); // Jak na razie jedyna arraylista

    private final int white = 1;
    private final int black = 1;

    public Board() {    // utworzenie planszy szachowej, ustawienie początkowe

        for (int column = 0; column < width; column++) {
            for (int row = 0; row < height; row++) {
                this.squares[column][row] = new Square(column, row);
            }
        }

        // nadpisanie ustawienie początkowego pionkami do gry zamiast pustych pól, które są tworzone powyżej

        for(int row = 0; row < 3; row++){  // białe pionki - początkowe ustawienie
            for(int column = 1; column < 8;column += 2){
                if (row % 2 == 0) {
                    this.squares[column][row] = new Square("W");
                    // dodać do array listy pieces - pionki
                }
                else {
                    this.squares[column-1][row] = new Square("W");
                }
            }
        }

        for(int row = 5; row < height; row++){  // białe pionki - początkowe ustawienie
            for(int column = 1; column < width; column += 2) {
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

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

