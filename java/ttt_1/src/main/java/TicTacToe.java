public class TicTacToe {

    public String[][] board;
    public boolean XTurn = true;

    TicTacToe () {
        this.board = new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}};
    }

    public void takeTurn(int x, int y) {
        String player = "X";
        if (!this.XTurn)
            player = "O";

        // check value of position
        getPos(x, y);

        board[x - 1][y - 1] = player;

        this.XTurn = !this.XTurn;
    }

    public String getPos(int i, int i1) {
        return "O";
    }
}
