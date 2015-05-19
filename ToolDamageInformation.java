import java.util.Random;

/**
 * Created by Daniel on 5/18/2015.
 */
public class ToolDamageInformation {
    private static Random rng = new Random();
    public int mean;
    public int stdDev;

    public ToolDamageInformation(int mean) {
        this.mean = mean;
    }

    public ToolDamageInformation(int mean, int stdDev) {
        this.mean = mean;
        this.stdDev = stdDev;
    }

    public int getRandomDamage() {
        int damage =  (int)(mean + rng.nextGaussian() * stdDev);
        return (damage>0) ? damage : 0;
    }
}
