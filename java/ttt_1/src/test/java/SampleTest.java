import org.junit.Assert;
import org.junit.Test;

public class SampleTest {

    @Test
    public void createBoard() {
        TicTacToe board = new TicTacToe();
        Assert.assertNotNull(board.board);
    }
    @Test
    public void playersTakeTurns() {
        // Arrange
        TicTacToe board = new TicTacToe();
        // Act
        board.takeTurn(3, 2);
        // Assert
        Assert.assertEquals(false, board.XTurn);


    }
}
