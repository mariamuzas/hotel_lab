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

    public void checkInGuestBedroom(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
    }

    public void checkInGuestConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.addGuest(guest);
    }
    
    public void checkOutGuestConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.removeGuest(guest);    
    }
    public void checkOutGuestBedroom(Guest guest, Bedroom bedroom) {
        bedroom.removeGuest(guest);
    }
    
//    hotel has room
//    hotel checks in a guest in the room
//    bedroom.addGuest()
//    the room has one guest int the ArrayList
//    The Hotel will be able check guests in/out of rooms.
}
