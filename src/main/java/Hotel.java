import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Booking> bookings;

    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.bookings = new ArrayList<>();
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
//    Create a bookRoom method in your Hotel.
//    This should book a given Bedroom for a number of nights.
//    This should return a new Bookin object.
}
