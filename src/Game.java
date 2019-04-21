import java.time.ZonedDateTime;
import java.util.Scanner;

public class Game {

    public static void main(String[] args){
        Board board = new Board();

        int white = 1;
        int black = -1;

        Player player_white = new Player("Marcin", board,12, white);
        Player player_black = new Player("Kuba", board,12, black);

        Scanner sc = new Scanner(System.in);
        Gameplay gameplay = new Gameplay();

        System.out.println("Kolumny i wiersze są nuemrowane od 1 do 8");

        while(!gameplay.isWinner(player_white, player_black)) {

            gameplay.getBoard(board);

            if(gameplay.getActiveplayer() == white){
                System.out.println("Kolej gracza białego");
            }
            if(gameplay.getActiveplayer() == black){
                System.out.println("Kolej gracza czarnego");
            }

            System.out.println("Podaj pozycje pionka, którego przesuwasz (kolumna (enter) rząd");
            int column_from = sc.nextInt() - 1;
            int row_from = sc.nextInt() - 1;
            System.out.println("Podaj pozycje na którą chcesz go przesunąć (kolumna (enter) rząd");
            int column_to = sc.nextInt() - 1;
            int row_to = sc.nextInt() - 1;

            gameplay.make_move(new Possition(row_from, column_from), new Possition(row_to, column_to));
        }
    }




}
