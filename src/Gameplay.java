import javafx.geometry.Pos;

import javax.swing.text.Position;

public class Gameplay {

    private Board board;
    private final int white = 1;
    private final int black = -1;
    private int activeplayer = white;

    private int winner;

    public void getBoard(Board board) {
        this.board = board;
        for (int row = 0; row < board.getHeight(); row++) { // sprawdzenie poprawności wyświetlania szachownicy
               for (int column = 0; column < board.getWidth(); column++) {
                    System.out.print(board.getSquare(column,row));
                }
                System.out.println();
            }
    }

    public Gameplay(){
        this.board = new Board();
    }

    public void make_move(Possition p_from, Possition p_to) {
        if(validMove(p_from)) {
          //  if(board.getSquare(p_from).getPiece().may_i_move(board.getSquare(p_from))) {
                board.getSquare(p_to).putPiece(board.getSquare(p_from).getPiece());
                board.getSquare(p_from).removePiece();
                activeplayer = -1 * activeplayer;
           // } // funkcja sprawdzająca may_i_move klasy pawn nie działa jak powinna
            //      prawdopodobine mamy problemy ze sprawdzaniem metod w środku may_i_move czyli can_move_freely() i can_square_jumped()
        }
    }

    public boolean validMove(Possition p_from){
        System.out.println(board.getSquare(p_from.get_column(), p_from.get_row()).getPiece().getColor());
        if(board.getSquare(p_from) == null || this.board.getSquare(p_from).getPiece() == null ){
            return false;
        }
        if(board.getSquare(p_from.get_column(), p_from.get_row()).getPiece().getColor() != activeplayer) {
            return false;
        }
        return true;
    }

    public int getActiveplayer() {
        return activeplayer;
    }

    public boolean isWinner(Player player_white, Player player_black) {

        if (player_white.getNum_pieces() == 0) {
            winner = black;
            return true;
        }
        if (player_black.getNum_pieces() == 0) {
            winner = white;
            return true;
        }
        if (player_white.can_player_move(player_white) && !player_black.can_player_move(player_black)) {
            winner = white;
            return true;
        }
        if (!player_white.can_player_move(player_white) && player_black.can_player_move(player_black)) {
            winner = black;
            return true;
        }
        return false;
    }

}
