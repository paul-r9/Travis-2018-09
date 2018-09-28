import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;

public class SampleTest {

    @Test
    public void exampleTest() {
        Assert.assertTrue("Example of a passing assertion", true);
//        Assert.fail("break travis");
    }

    @Test
    public void newBoardIsEmpty() {
        TicTacToe ttt = new TicTacToe();
        char[] board = ttt.getBoard();
        Assert.assertNull(board);
    }

    @Test
    public void canPopulateBoard() {
        TicTacToe ttt = new TicTacToe();
        ttt.setBoard(new char[]{'X',' ',' ',' ',' ',' ',' ',' ',' '});
        char[] board = ttt.getBoard();
        Assert.assertEquals('X', board[0]);
    }

    @Test
    public void canEvaluateHorizontalWinForXFirstRow() {
        TicTacToe ttt = new TicTacToe();
        ttt.setBoard(new char[]{'X','X','X',' ',' ',' ',' ',' ',' '});
        Boolean win = ttt.isWin();
        Assert.assertTrue(win);
    }

    @Test
    public void canEvaluateHorizontalNotWinForXFirstRow() {
        TicTacToe ttt = new TicTacToe();
        ttt.setBoard(new char[]{'X', ' ', 'X', ' ', ' ', ' ', ' ', ' ', ' '});
        Boolean win = ttt.isWin();
        Assert.assertFalse(win);
    }

    @Test
    public void canEvaluateHorizontalWinForOFirstRow() {
        TicTacToe ttt = new TicTacToe();
        ttt.setBoard(new char[]{'O', 'O', 'O', ' ', ' ', ' ', ' ', ' ', ' '});
        Boolean win = ttt.isWin();
        Assert.assertTrue(win);
    }

    
}
