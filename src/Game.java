import java.util.Scanner;

public class Game {

        private static final int white = 1;
        private static final int black = -1;

    public static void main(String[] args){
        Board board = new Board();
        Player player1 = new Player("Marcin", 12, white);
        Player player2 = new Player("Kuba", 12, black);

        Scanner sc = new Scanner(System.in);
        Gameplay gameplay = new Gameplay();

        gameplay.getBoard(board);
        gameplay.make_move();
        gameplay.getBoard(board);


    }

}
