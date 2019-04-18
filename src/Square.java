public class Square{ // definicja pojedynczego kafelka, będzie potrzeba np. do sprawdzania czy figura stacjonuje na danym polu ;)

    private int column;
    private int row;
    private String piece_type;
    private int what_square = 0;

    private Piece piece = null;
    private Possition possition;

    public Square(int column, int row) {
        this.column = column;
        this.row = row;
    }


    public Square(String piece_type){
        this.piece_type = piece_type;
        if (piece_type.equals("W")){   // white pawn
            what_square = 1;
        }
        if (piece_type.equals("B")){   // black pawn
            what_square = -1;
        }
        if (piece_type.equals("WQ")){   // white queen
            what_square = 3;
        }
        if (piece_type.equals("BQ")){   // black queen
            what_square = 4;
        }
    }




    // Getter Pionka z danego square'a
    public Piece getPiece(){
        return piece;
    }

    // Umieszczenie pionka na polu
    public Piece putPiece(Piece p){
        Piece previous = this.piece;
        if( previous != null){
            previous.removeSquare();
        }
        this.piece = p;
        return previous;
    }

    // Usunięcie pionka z pola
    public Piece removePiece(){
        Piece previous = this.piece;
        if( previous != null){
            previous.removeSquare();
        }
        this.piece = null;
        return previous;
    }

    public int getColumn(){
        return column;
    }

    public int getRow(){
        return row;
    }

    @Override
    public String toString(){       // metoda z poprzedniego projektu pokerowego

        if(piece == null){
            return "-";
        }
        else
        return piece.toString();    // poprawiona metoda wyświetlania wzięta od Cecylii
    }                               // choć jeszcze do końca nie działa, możesz sobie podpatrzeću Cecylii, że tam jeszcze są odwołania w figurze do rodzaju figury
                                    // na razie nie wiem jeszcze jak to załatwić

    public Possition getPossition(){
        return possition;
    }

}


// public Piece setPiece(Piece type_of_piece, int column, int row){
//     return
//}
//public Piece getPiece();


/*    public String toString(){       // metoda z poprzednim pomysłem i wyświetlaniem pól

        String squareString;

        String[] list_of_rows = { "1", "2", "3", "4", "5", "6", "7", "8"};
        String[] list_of_columns = { "A", "B", "C", "D", "E", "F", "G", "H"};

        squareString = list_of_columns[column] + list_of_rows[row] + " ";
        return squareString ;

    }*/