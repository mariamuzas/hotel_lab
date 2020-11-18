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

    public int guestsCount() {
        return guests.size();
    }

    public void addGuest(Guest guest) {
    if (getCapacity() > guestsCount()) {
        this.guests.add(guest);
        }
    }

    public void removeGuest(Guest guest) {
    if (this.guests.contains(guest)) {
        this.guests.remove(guest);
        }
    }
}
