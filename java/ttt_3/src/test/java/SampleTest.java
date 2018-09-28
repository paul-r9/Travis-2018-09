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
        String board = ttt.getBoard();
        Assert.assertEquals("", board);
    }
}
