import org.junit.Assert;
import org.junit.Test;

public class SampleTest {

    @Test
    public void confirmBoardIsNotNull() {
        TicTacToe board = new TicTacToe();
        Assert.assertNotNull(board.board);
    }
    @Test
    public void playerX_MakesFirstMove() {
        // Arrange
        TicTacToe board = new TicTacToe();
        // Act
        board.takeTurn(3, 2);
        // Assert
        Assert.assertEquals(false, board.XTurn);
    }
    @Test
    public void playerX_Then_PlayerY_TakeTurns_TwoTurns() {
        // Arrange
        TicTacToe board = new TicTacToe();
        // Act
        boolean PlayerX = board.XTurn;
        board.takeTurn(3, 2);
        // Act
        boolean PlayerY = board.XTurn;
        board.takeTurn(2, 2);

        // Assert
        Assert.assertNotEquals(PlayerX, PlayerY);

    }

}
