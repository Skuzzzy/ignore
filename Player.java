/**
 * Created by Daniel on 5/18/2015.
 */
public abstract class Player {
    private String name;
    private Tool activeTool;
    private int health;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        activeTool = (new ToolFactory()).getDefaultTool();
    }

    public boolean isAlive() {
        return (health > 0);
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void removeHealth(int damage) {
        this.health = this.health - damage;
    }

    public void attackPlayer(Player other) {
        activeTool.useOnPlayer(this,other);
    }

    public String getName() {
        return this.name;
    }
}
