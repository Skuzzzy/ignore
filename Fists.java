/**
 * Created by Daniel on 5/18/2015.
 */
public class Fists implements Tool {

    ToolDamageInformation dmgInfo;

    public Fists() {
        dmgInfo = new ToolDamageInformation(10,5);
    }

    public void useOnPlayer(Player self, Player other) {
        int damage = dmgInfo.getRandomDamage();
        other.removeHealth(damage);
        if(other.getHealth() < 0) {
            EventList.getInstance().addEvent(new StringEvent(self.getName() + " punched " + other.getName() + " to death"));
        } else {
            EventList.getInstance().addEvent(new StringEvent(self.getName() + "(" + self.getHealth() + ")" + " punches " + other.getName() + " for " + damage + " leaving them at (" + other.getHealth() + ")"));
        }

    }
}
