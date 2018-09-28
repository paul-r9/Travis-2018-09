import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

    public static final int NUM_PLAYERS = 2;
    public static PlayerInstance THIS_MOVE;
    public static PlayerInstance NEXT_MOVE;

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static List<PlayerInstance> startGame() {

        List<PlayerInstance> players = new ArrayList<>();

        for (int p = 1; p <= NUM_PLAYERS; p++) {
            PlayerInstance player = new PlayerInstance();
            player.setPlayerNumber(p);
            players.add(player);
        }

        return players;
    }
}
