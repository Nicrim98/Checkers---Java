import java.util.Scanner;

public class Game {
    // chwilowo tymczasowy main, wrzucam sobie różne rzeczy, aby sprawdzić czy funkcjonalności działają :)
    public static void main(String[] args) {

        Scanner which_color = new Scanner(System.in);
        System.out.println("White(1) or Black(2)");
        int color = Integer.parseInt(which_color.nextLine());

        Board board = new Board(color);

        for (int column = 0; column < 8; column++) { // sprawdzenie poprawności wyświetlania szachownicy
            for (int row = 0; row < 8; row++) {
                System.out.println(board.getSquare(column,row));
            }
        }
    }
}
