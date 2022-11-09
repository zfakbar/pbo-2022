public class Board {
    int dimension;
    Symbol[][] square;

    public Board(int dimension) {
        this.dimension = dimension;
        square = new Symbol[dimension][dimension];
    }

    public void fillContent(int i, int j, Symbol symbol){
        this.square[i][j] = symbol;
    }

    void printBoard() {
        for (int i = 0; i < this.dimension; i++) {
            for (int j = 0; j < this.dimension; j++) {
                if (square[i][j] == Symbol.DOT) {
                    System.out.print(".");
                } else if (square[i][j] == Symbol.CROSS) {
                    System.out.print("x");
                } else {
                    System.out.print("o");
                }
            }
            System.out.println("");
        }
    }


    String markSymbol(Position position, Symbol symbol) {
        String error = "";

        return error;
    }

    boolean checkWin(Position position, Symbol symbol) {
        return false;
    }

}
