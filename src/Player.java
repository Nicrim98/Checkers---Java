public class Player {

    private String name;
        private int num_pieces;
        private int color;

        private Board board;

        public Player(String name, Board board, int num_pieces, int color){
            this.name = name;
            this.num_pieces = num_pieces;
            this.color = color;
            this.board = board;
        }

        public String getName(){
            return name;
        }

        public int getNum_pieces() {
            return num_pieces;
        }

        public void decrease_num_pieces()  {
            this.num_pieces --;
        }

        public boolean can_player_move(Player player) {
            for (int row = 0; row < board.getHeight(); row++) {
                for (int column = 0; column < board.getWidth(); column++) {
                    if (board.getSquare(new Possition(row, column)).getPiece() != null && board.getSquare(new Possition(row, column)).getPiece().getColor() == player.getColor()) {
                       board.getSquare(new Possition(row, column)).getPiece().may_i_move();
                        //sprawdzenie ruchu pionka
                    }
                }
            }
            return false;
        }
        public int getColor() {
            return color;
        }
}
