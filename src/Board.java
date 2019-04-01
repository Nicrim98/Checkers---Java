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

        for(int column = 0; column < squares.length; column++){  // inicjalizacja pionków na planszy
            pieces.add(new Pawn(column,6, white));
            pieces.add(new Pawn(column, 1, black));
            squares[column][6] = new Square("P"); // tworzenie pionków białych i czarych
            squares[column][1] = new Square("P");
        }
        squares[0][7] = new Square("R"); // tworzenie wież oraz figur białych
        squares[7][7] = new Square("R");
        squares[1][7] = new Square("N");
        squares[6][7] = new Square("N");
        squares[2][7] = new Square("B");
        squares[5][7] = new Square("B");
        squares[4][7] = new Square("Q");
        squares[3][7] = new Square("K");

        squares[0][0] = new Square("R"); // tworzenie wież oraz figur czarnych
        squares[7][0] = new Square("R");
        squares[1][0] = new Square("N");
        squares[6][0] = new Square("N");
        squares[2][0] = new Square("B");
        squares[5][0] = new Square("B");
        squares[3][0] = new Square("Q");
        squares[4][0] = new Square("K");

// ta konstrukcja square[][] = new Square zapewnia wyświetlanie na konsoli chyba jest spoko
// teraz jak patrzę na ten kod to przy inicjalizacji Pawns w pętli mam pieces.add tak jakby dodawanie
// pionków jako obiektów do listy Pieces i chyba pasuje to zrobić ze wszystkimi figurami
    }
    public Square getSquare(int column, int row){   // zapewnia dostep do danego pola
        return squares[column][row];
    }

}
