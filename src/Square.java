public class Square { // definicja pojedynczego kafelka, będzie potrzeba np. do sprawdzania czy figura stacjonuje na danym polu ;)

    private int column;
    private int row;

    public Square(int column, int row) {
        this.column = column;
        this.row = row;
    }

    public String toString(){       // metoda z poprzedniego projektu pokerowego

        String squareString;

        String[] list_of_rows = { "1", "2", "3", "4", "5", "6", "7", "8"};
        String[] list_of_columns = { "A", "B", "C", "D", "E", "F", "G", "H"};

        squareString = list_of_columns[column] + " " + list_of_rows[row];
        return squareString;
    }
}