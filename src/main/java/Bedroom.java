import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;

    public Bedroom(int roomNumber, int capacity, String type) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.type = type;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }
    public int guestsCount() {
        return guests.size();
    }

    public void addGuest(Guest guest) {
        if (getCapacity() > guestsCount()){
            this.guests.add(guest);
        }
    }
    
    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }
}
