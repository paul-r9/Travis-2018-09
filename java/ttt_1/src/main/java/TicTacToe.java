public class TicTacToe {

    public String[][] board;
    public boolean XTurn = true;

    TicTacToe () {
        this.board = new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}};
    }

    public void takeTurn(int i, int i1) {
        String player = "X";
        if (!this.XTurn)
            player = "O";

        // check value of position


        this.XTurn = !this.XTurn;
    }

    public String getPos(int i, int i1) {
        return "O";
    }
}
