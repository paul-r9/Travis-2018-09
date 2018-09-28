import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.lang.reflect.Array;

public class SampleTest {

    @Test
    public void confirmBoardIsNotNull() {
        TicTacToe board = new TicTacToe();
        Assert.assertNotNull(board.board);
    }
    @Test
    public void confirmBoardValuesAreEmptyStrings() {
        TicTacToe board = new TicTacToe();

        String[] expected = new String[]{"", "", ""};

        Assert.assertEquals(expected, board.board[0]);
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
    @Test
    public void addThingsToBoard() {
        //Arrange
        TicTacToe board = new TicTacToe();

        //Act
        board.takeTurn(3, 2);


        // Assert
        Assert.assertEquals("X", board.board[2][1]);


    }
    @Ignore
    @Test
    public void cannotChooseSameSpaceAndDoesntChangeTurns() {
        //Arrange
        TicTacToe board = new TicTacToe();

        //Act
        // x = True
        board.takeTurn(3, 2);
        // x = False
        board.takeTurn(3, 2);
        // x = False

        //Assert
        Assert.assertFalse(board.XTurn);
    }


}
