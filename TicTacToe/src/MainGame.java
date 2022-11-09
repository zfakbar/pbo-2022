import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        Board board = new Board(3);

        boolean nextPlayer = false;


        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        for (int i = 0; i < board.dimension; i++) {
            for (int j = 0; j < board.dimension; j++) {
                System.out.println("[" + i + "][" + j + "]");
                board.fillContent(i,j,getSymbol(sc.nextInt()) );
            }
        }
        board.printBoard();

        TicTacToe ticTacToe = new TicTacToe();


    }

    static Symbol getSymbol(int check) {
        if (check == 0) {
            return Symbol.CIRCLE;
        } else if (check == 1) {
            return Symbol.DOT;
        } else if (check == 2) {
            return Symbol.CROSS;
        }else{
            return null;
        }
    }
}
