import java.util.ArrayList;
import java.util.Collections;

public class Board { // utworzenie planszy do gry, z polami

    private final int width = 8;
    private final int height = 8;

    private Square[][] squares = new Square[width][height];



    private final int white = 1;
    private final int black = -1;

    public Board() {    // utworzenie planszy szachowej, ustawienie początkowe

        for (int column = 0; column < width; column++) {
            for (int row = 0; row < height; row++) {
                this.squares[column][row] = new Square(column, row);
                squares[column][row].putPiece(null);
            }
        }

        // nadpisanie ustawienie początkowego pionkami do gry zamiast pustych pól, które są tworzone powyżej

        for(int row = 0; row < 3; row++){  // białe pionki - początkowe ustawienie
            for(int column = 1; column < 8;column += 2){
                if (row % 2 == 0) {
                    this.squares[column][row] = new Square("W");
                    this.squares[column][row].putPiece(new Pawn(this,squares[column][row],white));
                }
                else {
                    this.squares[column-1][row] = new Square("W");
                    this.squares[column-1][row].putPiece(new Pawn(this,squares[column-1][row],white));
                }
            }
        }

        for(int row = 5; row < height; row++){  // białe pionki - początkowe ustawienie
            for(int column = 1; column < width; column += 2) {
                if (row % 2 == 1) {
                    this.squares[column-1][row] = new Square("B");
                    this.squares[column-1][row].putPiece(new Pawn(this,squares[column-1][row],black));
                }
                else {
                    this.squares[column][row] = new Square("B");
                    this.squares[column][row].putPiece(new Pawn(this,squares[column][row],black));
                }
            }
        }

    }
    public Square getSquare(int column, int row){   // zapewnia dostep do danego pola
        return squares[column][row];
    }

    public Square getSquare(Possition possition){   // zapewnia dostep do danego pola
        return squares[possition.get_column()][possition.get_row()];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


}

