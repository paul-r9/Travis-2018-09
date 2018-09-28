public class TicTacToe {

    public static String[][] board = new String[3][3];
    public boolean XTurn = true;

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public void takeTurn(int i, int i1) {
        String player = "X";
        if (!this.XTurn)
            player = "O";

        this.XTurn = !this.XTurn;
    }
}
