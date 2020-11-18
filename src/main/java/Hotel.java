import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
    }

    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }
    public int numBedrooms() {
    return this.bedrooms.size();
    }

    public int numConferenceRooms() {
    return this.conferenceRooms.size();
    }

//    hotel has room
//    hotel checks in a guest in the room
//    bedroom.addguest()
//    the room has one guest int the ArrayList
//    The Hotel will be able check guests in/out of rooms.
}
