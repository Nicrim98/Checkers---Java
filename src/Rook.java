public class Rook extends Piece {

        // nie wiem czy będzie potrzebne, ale na razie zostawiam

    private Board board;
    private int curr_column;
    private int curr_row;
    private int wanted_column;
    private int wanted_row;
    private int color;

    public Rook(int curr_column, int curr_row, int color) {
        this.curr_column = curr_column;
        this.curr_row = curr_row;
        this.color = color;
    }

    // sprawdzanie poprawności ruchu,
    public boolean may_i_move(Board board, int wanted_column, int wanted_row){
        this.board = board;
        this.wanted_column = wanted_column;
        this.wanted_row = wanted_row;
        if(wanted_column == curr_column ){
            return true;
        }
        else if(wanted_row == curr_row){
            return true;
        }
        else return false;
    }

    // wykonanie ruchu po wcześniejszym sprawdzeniu may_i_move
    public void move(int curr_column, int curr_row, int wanted_column, int wanted_row){
        if(may_i_move(board,wanted_column,wanted_row)) {
            /*board.getSquare(curr_column, curr_row) = new Square("-");
            board.getSquare(wanted_column, wanted_row) = new Square("R");*/
            // zastanawiam się czemu to wyżej nie działa XD
        } else{
            // throw exception pasuje tu dopisać
        }
    }
}
