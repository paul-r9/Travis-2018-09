import org.junit.Assert;
import org.junit.Test;

public class SampleTest {

    @Test
    public void createBoard() {
        TicTacToe board = new TicTacToe();
        Assert.assertNotNull(board.board);
    }
}
