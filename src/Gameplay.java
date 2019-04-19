import javafx.geometry.Pos;

import javax.swing.text.Position;

public class Gameplay {

//    private final Player player2;
//    private final Player player1;
    private Board board;
    private final int white = 1;
    private final int black = -1;
    private int activeplayer = 1;

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
//        this.player1 = new Player("player1", 12, white);
//        this.player2 = new Player("player2", 12, black);

    }
    public void make_move(Possition p_from, Possition p_to) {

        board.getSquare(p_to).putPiece(board.getSquare(p_from).getPiece());
        board.getSquare(p_from).removePiece();


    }

    public boolean validMove(Possition p_from, Possition p_to){
        if(this.board.getSquare(p_from) == null || this.board.getSquare(p_from).getPiece() == null ){
            return false;
        }
        if(this.board.getSquare(p_from).getPiece().getColor() != activeplayer){
            return false;
        }
        else{
            return true;
        }
    }
//    public void make_move(Possition p_from, Possition p_to) {
//        if(this.board.getSquare(p_from) == null || this.board.getSquare(p_from).getPiece() == null );
//        if(this.board.getSquare(p_from).getPiece().getColor() != activeplayer) throw new WybranaFiguraZlegoGraczaException();
//        if(this.board.zrobRuchOrazCzyByloBicie(board.getSquare(p_from), board.getSquare(p_to)))this.gracze.get(this.kolorObecnegoGracza).zmniejszLiczbeFigur();
//        activeplayer = activeplayer * (-1);
//    }
    
    
}
