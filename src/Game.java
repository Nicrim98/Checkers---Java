import java.time.ZonedDateTime;
import java.util.Scanner;

public class Game {

        private static final int white = 1;
        private static final int black = -1;

        private static Player player_white;
        private static Player player_black;

    public static void main(String[] args){
        Board board = new Board();
        player_white = new Player("Marcin", board,12, white);
        player_black = new Player("Kuba", board,12, black);

        Scanner sc = new Scanner(System.in);
        Gameplay gameplay = new Gameplay();

        while(!isWinner()) { // program działa dopóki nie ma zwycięzcy ;)
            gameplay.getBoard(board);
            gameplay.make_move();
            gameplay.getBoard(board);
        }
    }
    public static boolean isWinner(){

        if(player_white.getNum_pieces() == 0){
            return true;
        }
        if(player_black.getNum_pieces() == 0){
            return true;
        }
        if(!this.plansza.czyGraczMozeSieRuszyc(this.kolorObecnegoGracza))return this.kolorObecnegoGracza.opposite();
        // chyba trzeba dopisaćtutaj jedną metodę
        return false;
    }

}
