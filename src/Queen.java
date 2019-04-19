public class Queen extends Piece {


//    private int color=1; // bedziemy go inicjowac
//
//    private int curr_row=1;
//    private int curr_column=1;
//
//    private int wanted_row=2;
//    private int wanted_column=1;

    public Queen(Square square, int color){
        super(square,color);
    }

    public Queen(Queen newQueen, Square square){
        this(square, newQueen.getColor());
    }

    @Override
    public boolean may_i_move(Square square){
        if(square == null || square.equals(this.square)){
            return false;
        }

        // wprowadzić algorytm przesuwania

        return true;
    }
//    public boolean may_i_move(){
////----------------zachowania jak wieza---------------
//        if(wanted_column == curr_column ){
//            return true;
//        }
//        else if(wanted_row == curr_row){
//            return true;
//        }
/////-----------zachowania jak goniec------------
//        for(int i=1; i<8; i++){ // tu ta 8 sprawi w pewnych przypadkach out of border naszej szachownicy wiec trzea to zedytowac potem
//            if(wanted_column == curr_column + i && wanted_row == curr_row + i){
//                return true;
//                //  break;
//            }
//            if(wanted_column == curr_column + i && wanted_row == curr_row - i){
//                return true;
//                //break;
//            }
//
//            if(wanted_column == curr_column - i && wanted_row == curr_row - i){
//                return true;
//                //  break;
//            }
//
//            if(wanted_column == curr_column - i && wanted_row == curr_row + i){
//                return true;
//                //  break;
//            }
//
//        }
//        return false;
//    }

}

