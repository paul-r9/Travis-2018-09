import java.lang.reflect.Array;

public class TicTacToe {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    char[] board;

    public char[] getBoard() {
        return board;
    }

    public Boolean isWin() {
        return (board[0] == 'X' && board[1] == 'X' && board[2] == 'X');
    }

    public void setBoard(char[] input) {
        board = input;
    }
}
