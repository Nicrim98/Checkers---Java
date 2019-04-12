public class Pawn extends Piece { // to była klasa bishop, zostawiłem ją bo w sumie to pionki w warcabach
    // chodzą podobnie jak bishop w szachach

    private int curr_row = 1;
    private int curr_column = 1;

    private int wanted_row = 2;
    private int wanted_column = 1;

    private int color;

    public Pawn(int curr_column, int curr_row, int color) {
        this.color = color;
        this.curr_row = curr_row;
        this.curr_column = curr_column;
    }

    public boolean may_i_move() { // bishop metoda + metoda na zbicia

        ///   for(int i=1; i<8; i++){ // tu ta 8 sprawi w pewnych przypadkach out of border naszej szachownicy wiec trzea to zedytowac potem
        if (wanted_column == curr_column + 1 && wanted_row == curr_row + 1) {
            return true;
            //  break;
        }
        if (wanted_column == curr_column + 1 && wanted_row == curr_row - 1) {
            return true;
            //break;
        }

        if (wanted_column == curr_column - 1 && wanted_row == curr_row - 1) {
            return true;
            //  break;
        }

        if (wanted_column == curr_column - 1 && wanted_row == curr_row + 1) {
            return true;
            //  break;
        } else return false;
        //    break;

    }

    public String toString() {       // metoda z poprzedniego projektu pokerowego

        String squareString;

        String[] list_of_possible_squares = {" ", "W", "B"};

        squareString = list_of_possible_squares[color] + " ";
        return squareString;

    }
}
