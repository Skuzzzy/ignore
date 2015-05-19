import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Daniel on 5/18/2015.
 */
public class TestGame {
    ArrayList<Player> players;
    Random rng;

    public TestGame() {
        this.players = new ArrayList<Player>();
        this.rng = new Random();
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    public void runGame() {
        while(getAlivePlayers().size() > 1) { // Last man standing
            tick();
        }
    }

    private ArrayList<Player> getAlivePlayers() {
        ArrayList<Player> alive = new ArrayList<Player>();
        for(Player p : players) {
            if(p.isAlive()){
                alive.add(p);
            }

        }
        return alive;
    }

    public void tick() {
        ArrayList<Player> activePlayers = getAlivePlayers();
        int p1 = rng.nextInt(activePlayers.size());
        int p2 = rng.nextInt(activePlayers.size());
        while(p2 == p1) {
            p2 = rng.nextInt(activePlayers.size());
        }
        activePlayers.get(p1).attackPlayer(activePlayers.get(p2));
    }
}
