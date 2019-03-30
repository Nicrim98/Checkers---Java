public class Pawn extends Piece {

    private int column;
    private int row;
    private int color=1;

    public Pawn(int column, int row, int color) {
        this.column = column;
        this.row = row;
        this.color = color;
    }
// ogolnie pomysl mam taki ze kierujemy do funcki obecna kolumne i wiersz
    // podajemy tez na jaka chce sie ruszyc i sprawdzamy czy moze
    // swietnie podejda tutaj wyjatki

    // to jest algorytm dla tych pionkow ponizej

    ///// można chyba będzie uproscić ten algorytm, ponieważ pionek jak jest inicjalizowany to od razu wiadomo
    ///// na jakim jest miejscu, no bo jest przyporządkowny więc by było curr_row = row (powyżej)

    private int curr_row=1;
    private int curr_column=1;

    private int wanted_row=2;
    private int wanted_column=1;

    public boolean may_i_move() {
        if (color==1) { // wersja dla pionkow z dolu ----- zamienimy na final

            if (wanted_column == curr_column && wanted_row == curr_row-1 ) {
                return  true;
            }
        }
        else if(color==2) { // wersja dla pionkow z gory----- zamienimy na final

            if (wanted_column == curr_column && wanted_row == curr_row+1 ) {
                return  true;
            }
        }

        else return false;

        return false; // nie jestem do tego przekonany ale inteliJ bardzo to tu chce
    }
}






