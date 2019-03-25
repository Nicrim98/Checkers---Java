public class Game {
    // chwilowo tymczasowy main, wrzucam sobie różne rzeczy, aby sprawdzić czy funkcjonalności działają :)
    public static void main(String[] args) {
        System.out.println(" Sprawdzam czy zadziała system z dzieleniem projektu XD");
        System.out.println(" No i XD działa, supcio !");

        Board board = new Board();

        for (int column = 0; column < 8; column++) { // sprawdzenie poprawności wyświetlania szachownicy
            for (int row = 0; row < 8; row++) {
                System.out.println(board.getSquare(column,row));
            }
        }
    }
}
