import org.junit.Assert;
import org.junit.Test;

public class SampleTest {

    //    There are 2 players
    @Test
    public void onGameStartThereAreTwoPlayers() {

        // Arrange
        // Not Sure

        // Act
        int actual = TicTacToe.startGame();

        // Assert
        Assert.assertEquals(2, actual);
    }

    //    Players can't go twice
    //    One Piece per space
    //    Game over when all fields in a column are taken
    //    Game over when all fields in a row are taken
    //    Game over when all fields in a diagonal are taken
    //    Game over when all fields are taken
}
