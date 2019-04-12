import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Board { // utworzenie planszy do gry, z polami

    private final int width = 8;
    private final int height = 8;

    private Square[][] squares = new Square[width][height];

    private ArrayList<Piece> pieces = new ArrayList<Piece>(); // Jak na razie jedyna arraylista

    private final int white = 1;
    private final int black = 1;

    public Board() {    // utworzenie planszy szachowej, ustawienie początkowe

        for (int column = 0; column < width; column++) {
            for (int row = 0; row < height; row++) {
                this.squares[column][row] = new Square(column, row);
                pieces.add(null);   // arraylista zawiera same nulle, poniewaz jeszcze nie ma obiektow
            }
        }

        // nadpisanie ustawienie początkowego pionkami do gry zamiast pustych pól, które są tworzone powyżej

        for(int row = 0; row < 3; row++){  // białe pionki - początkowe ustawienie
            for(int column = 1; column < 8;column += 2){
                if (row % 2 == 0) {
                    this.squares[column][row] = new Square("W");
                    pieces.add(new Pawn(column, row, white));   // dodajemy pionka do listy czyli na koniec
                    Collections.swap(pieces, (row*8)+column, 64);   // zamieniamy miejscami z danym nullem
                    pieces.remove(64);                  // usuwamy nulla na końcu żeby wciąż mieć tylko obiekty od 0-63
                }
                else {
                    this.squares[column-1][row] = new Square("W");
                    pieces.add(new Pawn(column, row, white));
                    Collections.swap(pieces, (row*8)+(column-1), 64);
                    pieces.remove(64);
                }
            }
        }

        for(int row = 5; row < height; row++){  // białe pionki - początkowe ustawienie
            for(int column = 1; column < width; column += 2) {
                if (row % 2 == 1) {
                    this.squares[column-1][row] = new Square("B");
                    pieces.add(new Pawn(column, row, white));
                    Collections.swap(pieces, (row*8)+(column-1), 64);
                    pieces.remove(64);
                }
                else {
                    this.squares[column][row] = new Square("B");
                    pieces.add(new Pawn(column, row, white));
                    Collections.swap(pieces, (row*8)+column, 64);
                    pieces.remove(64);
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

    public ArrayList<Piece> getPieces() {
        return pieces;
    }
}

