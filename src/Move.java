public class Move {

    public static final char Square_seperator = '-';
    public static final char Square_x_seperator = 'x';

    private Square square_from;
    private Square square_to;
    private Square square_taken;

//    public static Move have_to_move(String s, Game game){
//        if( s == null){
//            return null;
//        }
//
//        char sep = s.charAt(2);
//    }
//    // nie wiem o co tu chodzi to na razie zostawiam nie dokończone

    public Move(Square square_from, Square square_to){
        this.square_from = square_from;
        this.square_to = square_to;
    }

    public Move(Square square_from, Square square_to, Square square_taken){
        this.square_from = square_from;
        this.square_to = square_to;
        this.square_taken = square_taken;
    }

    public boolean checkMove(Square s1, Square s2){
        if(s1 != null){
            if(!s1.equals(s2)){
                return false;
            }
        }
        else {
            if (s2 != null) {
                return false;
            }
        }
        return true;
    }

    // funkcja equals zwróci true jeśli pola from, to i taken są true
    @Override
    public boolean equals(Object object){
        if(object instanceof Move){
            Move move = (Move)object;

            if(!checkMove(this.square_from, move.square_from)){
                return false;
            }
            if(!checkMove(this.square_to, move.square_to)){
                return false;
            }
            if(!checkMove(this.square_taken, move.square_taken)){
                return false;
            }
            return true;
        }
        return false;
    }
}