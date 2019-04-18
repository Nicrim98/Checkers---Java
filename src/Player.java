public class Player {

    private String name;
        private int num_pieces;
        private int color;

        public Player(String name, int num_pieces, int color){
            this.name = name;
            this.num_pieces = num_pieces;
            this.color = color;
        }

        public String getName(){
            return name;
        }

        public int getNum_pieces() {
            return num_pieces;
        }

//        public boolean czyMaFigury(){
//            return liczbaFigur > 0;
//        }

        public void decrease_num_pieces()  {
            this.num_pieces --;
        }


}
