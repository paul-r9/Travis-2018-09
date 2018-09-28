import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SampleTest {

    //    There are 2 players
    @Test
    public void onGameStartThereAreTwoPlayers() {

        // Arrange
        List<PlayerInstance> players = TicTacToe.startGame();

        // Act
        int actual = players.size();

        // Assert
        Assert.assertEquals(2, actual);
    }

    //    Players get a unique ID
    @Test
    public void allPlayersHaveAUniqueID() {

        // Arrange
        List<PlayerInstance> players = TicTacToe.startGame();

        // Act

        // Assert
        Assert.assertNotEquals(players.get(0).getPlayerNumber(),players.get(1).getPlayerNumber());
    }

    //    Players can't go twice
//    @Test
//    public void playersCannotGoTwiceInARow() {
//
//        // Arrange
//        List<PlayerInstance> players = TicTacToe.startGame();
//
//
//        // Act
//        int expected = 2;
//
//        // Assert
//        Assert.assertEquals(expected, actual);
//    }

    //    One Piece per space
    //    Game over when all fields in a column are taken
    //    Game over when all fields in a row are taken
    //    Game over when all fields in a diagonal are taken
    //    Game over when all fields are taken
}
