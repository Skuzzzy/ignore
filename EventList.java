import java.util.ArrayList;

/**
 * Created by Daniel on 5/18/2015.
 */

/*
    EventList is a singleton
 */
public class EventList {

    private static EventList instance = null;

    ArrayList<EventLoggable> events;

    public EventList() {
        events = new ArrayList<EventLoggable>();
    }

    public void printEvents() {
        for(EventLoggable event : events) {
            event.printEvent();
        }
    }

    public void addEvent(EventLoggable event) {
        events.add(event);
    }

    public void addEvent(ArrayList<EventLoggable> eventList) {
        events.addAll(eventList);
    }

    public static EventList getInstance() {
        if(instance == null) {
            instance = new EventList();
        }
        return instance;
    }
}
