import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HotelTest {
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Hotel hotel;
    Guest guest;
    Guest guest1;
    Guest guest2;
    DiningRoom diningRoom;
    DiningRoom diningRoom1;

    @Before
    public void setUp() {
        bedroom = new Bedroom(25,4, "Double", 89.50);
        conferenceRoom = new ConferenceRoom("Board Room", 10);
        hotel = new Hotel();
        guest = new Guest("Bob");
        guest1 = new Guest("Mat");
        guest2 = new Guest("Mery");
        diningRoom = new DiningRoom("Fancy Food");
        diningRoom1 = new DiningRoom("Breakfast Room");
    }

    @Test
    public void checkHotelNumBedrooms() {
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.numBedrooms());
    }
    @Test
    public void checkHotelNumConferenceRoom() {
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.numConferenceRooms());
    }
    @Test
    public void canCheckInGuestToBedroom() {
        hotel.checkInGuestBedroom(guest, bedroom);
        assertEquals(1, bedroom.guestsCount());
    }

    @Test
    public void canCheckInGuestToConferenceRoom() {
        hotel.checkInGuestConferenceRoom(guest, conferenceRoom);
        assertEquals(1, conferenceRoom.guestsCount());
    }
    @Test
    public void canCheckOutGuestFromConferenceRoom() {
        hotel.checkInGuestConferenceRoom(guest, conferenceRoom);
        hotel.checkInGuestConferenceRoom(guest, conferenceRoom);
        hotel.checkInGuestConferenceRoom(guest, conferenceRoom);
        hotel.checkOutGuestConferenceRoom(guest, conferenceRoom);
        assertEquals(2, conferenceRoom.guestsCount());
    }

    @Test
    public void canCheckOutFromBedroom() {
        hotel.checkInGuestBedroom(guest, bedroom);
        hotel.checkInGuestBedroom(guest1, bedroom);
        hotel.checkInGuestBedroom(guest2, bedroom);
        hotel.checkOutGuestBedroom(guest, bedroom);
        assertEquals(2, bedroom.guestsCount());
    }

    @Test
    public void canCreateBooking() {
        hotel.bookRoom(bedroom, 4);
        assertEquals(1, hotel.getBookingCount());
    }

    @Test
    public void canAddDiningRoom() {
        hotel.addToDiningRoomHashMap(diningRoom);
        hotel.addToDiningRoomHashMap(diningRoom1);
        assertEquals(2, hotel.getDiningRoomList());
    }

    @Test
    public void getKeysOfDiningRooms() {
        hotel.addToDiningRoomHashMap(diningRoom);
        hotel.addToDiningRoomHashMap(diningRoom1);
        assertTrue(hotel.getKeyOfDiningRoom(diningRoom));
    }

//    @Test
//    public void checkDiningRoomsKeys() {
//        hotel.addToDiningRoomHashMap(diningRoom);
//        hotel.addToDiningRoomHashMap(diningRoom1);
//        assertEquals("[Breakfast Room, Fancy Food]", hotel.getDiningRoomsKey());
//    }


}
