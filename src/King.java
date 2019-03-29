public class King extends Piece{


    private int color=1; // bedziemy go inicjowac

    private int curr_row=1;
    private int curr_column=1;

    private int wanted_row=2;
    private int wanted_column=1;

    public boolean may_i_move(){

        if(wanted_column == curr_column ){
            if( wanted_row == curr_row + 1 || wanted_row == curr_row -1){
                return true;
            }
        }
        else if(wanted_column == curr_column - 1 || wanted_column == curr_column + 1){
            if( wanted_row == curr_row || wanted_row == curr_row + 1 || wanted_row == curr_row - 1)
            return true;
        }

        else return false;

        return false;
    }
        }
