/**
 * Created by Daniel on 5/18/2015.
 */
public class Test {
    public static void main(String[] args) {
        TestGame t = new TestGame();
        t.addPlayer(new Person("Daniel"));
        t.addPlayer(new Person("Tod"));
        t.addPlayer(new Person("Aaron"));
        t.addPlayer(new Person("C.J."));
        t.addPlayer(new Person("Tyler"));
        t.addPlayer(new Person("David"));
        t.runGame();
        EventList.getInstance().printEvents();
    }
}
