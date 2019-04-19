import java.time.ZonedDateTime;
import java.util.Scanner;

public class Game {

        private static final int white = 1;
        private static final int black = -1;

        private static int winner;

        private static Player player_white;
        private static Player player_black;
        private static Board board;

    public static void main(String[] args){
        board = new Board();
        player_white = new Player("Marcin", board,12, white);
        player_black = new Player("Kuba", board,12, black);

        Scanner sc = new Scanner(System.in);
        Gameplay gameplay = new Gameplay();

        while(!isWinner()) { // program działa dopóki nie ma zwycięzcy ;)

            gameplay.getBoard(board);
            if(gameplay.getActiveplayer() == white){
                System.out.println("Kolej gracza białego");
            }
            if(gameplay.getActiveplayer() == black){
                System.out.println("Kolej gracza czarnego");
            }
            System.out.println("Podaj pozycje pionka, którego przesuwasz (kolumna (enter) rząd");
            int column_from = sc.nextInt();
            int row_from = sc.nextInt();
            System.out.println("Podaj pozycje na którą chcesz go przesunąć (kolumna (enter) rząd");
            int column_to = sc.nextInt();
            int row_to = sc.nextInt();
            gameplay.make_move(new Possition(row_from, column_from), new Possition(row_to, column_to));
        }
    }
    public static boolean isWinner(){

        if(player_white.getNum_pieces() == 0){
            winner = black;
            return true;
        }
        if(player_black.getNum_pieces() == 0){
            winner = white;
            return true;
        }
        if(player_white.can_player_move(player_white) && !player_black.can_player_move(player_black)){
            winner = white;
            return true;
        }
        if(!player_white.can_player_move(player_white) && player_black.can_player_move(player_black)){
            winner = black;
            return true;
        }

        return false;
    }

}
