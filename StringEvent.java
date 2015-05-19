/**
 * Created by Daniel on 5/18/2015.
 */
public class StringEvent implements EventLoggable {
    String eventString;

    public StringEvent(String s) {
        eventString = s;
    }

    public String getEventString() {
        return eventString;
    }

    public void printEvent() {
        System.out.println(eventString);
    }
}
