import java.util.ArrayList;

public class ConferenceRoom {
    private int capacity;
    private ArrayList<Guest> guests;
    private String name;

    public ConferenceRoom(String name, int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }
    public int getGuestsNum() {
        return guests.size();
    }
}