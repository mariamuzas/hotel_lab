import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Booking> bookings;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.bookings = new ArrayList<>();
        this.diningRooms = new HashMap<>();
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

    public Booking bookRoom(Bedroom bedroom, int nights) {
        Booking newBooking = new Booking(bedroom, nights);
        this.bookings.add(newBooking);
        return newBooking;
    }

    public int getBookingCount() {
        return this.bookings.size();
    }

    public void addToDiningRoomHashMap(DiningRoom diningRoom){
        String name = diningRoom.getName();
        this.diningRooms.put(name, diningRoom);
    }

    public boolean getKeyOfDiningRoom(DiningRoom diningRoom){
        return this.diningRooms.containsKey(diningRoom.getName());
    }

    public int getDiningRoomList() {
        return this.diningRooms.size();
    }

    public HashMap<String, DiningRoom> getDiningRooms() {
        return diningRooms;
    }

//    public Collection<String> getDiningRoomsKey() {
//        return this.diningRooms.keySet();
//    }

    //    Hotel will have a HashMap based collection of DiningRooms.
//            Hint ^
//    HashMap<String, DiningRoom>
//    The String here could be from calling .getName() on the instance of DiningRoom
}
