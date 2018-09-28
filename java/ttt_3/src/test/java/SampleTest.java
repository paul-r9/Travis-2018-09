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

}
