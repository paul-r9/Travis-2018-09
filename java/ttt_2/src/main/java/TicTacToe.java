import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

    public static final int NUM_PLAYERS = 2;

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static int startGame() {

        List<PlayerInstance> players = new ArrayList<>();

        for (int p = 0; p < NUM_PLAYERS; p++) {
            PlayerInstance player = new PlayerInstance();
            players.add(player);
        }

        return players.size();
    }
}
