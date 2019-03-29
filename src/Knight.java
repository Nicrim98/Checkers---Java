public class Knight extends Piece {


    private int color=1; // bedziemy go inicjowac

    private int curr_row=1;
    private int curr_column=1;

    private int wanted_row=2;
    private int wanted_column=1;

//    public boolean may_i_move() {
//        if (color==1) { // wersja dla pionkow z dolu ----- zamienimy na final
//
//            if (wanted_column == curr_column && wanted_row == curr_row-1 ) {
//                return  true;
//            }
//            else return false;
//        }
//        else if(color==2) { // wersja dla pionkow z gory----- zamienimy na final
//
//            if (wanted_column == curr_column && wanted_row == curr_row+1 ) {
//                return  true;
//            }
//            else return false;
//        }
//
//        else return false;
//    }
//

    public boolean may_i_move(){ /// ogolnie trzeba dodac przypadek kiedy na wanted_polu stoi twoja figura bo wtedy tez nie moze sie ruszyc!

        if(wanted_column == curr_column - 1 || wanted_column == curr_column + 1 ){
            if(wanted_row == curr_row + 2 || wanted_row == curr_row - 2){
                return true;
            }
        }
        else if(wanted_column == curr_column - 2 || wanted_column == curr_column + 2){
            if(wanted_row == curr_row + 1 || wanted_row == curr_row - 1){
                return true;
            }
        }
        else return false;

        return false; // nie jestem do tego przekonany ale inteliJ bardzo to tu chce

    }

}
