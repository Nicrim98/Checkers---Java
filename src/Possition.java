import java.util.Objects;

public class Possition {
        private int row, column;

        public Possition(int row, int column){
            this.row = row;
            this.column = column;
        }

        public int get_row(){
            return row;
        }

        public int get_column() {
            return column;
        }

        public int difference_rows(Possition possition){
            return possition.row - this.row;
        }
        public int difference_columns(Possition possition){
            return possition.column - this.column;
        }


        public boolean equals(Object o){
            if(o == null || !(o instanceof Possition)){
                return false;
            }
            Possition possition = (Possition)o;
            return difference_rows(possition) == 0 && difference_columns(possition) == 0;
        }

//        public int hashCode() {
//            return Objects.hash(row, column);
//        }

        public Possition add(int row, int column){
            return new Possition(this.row+row, this.column+column);
        }

    }
