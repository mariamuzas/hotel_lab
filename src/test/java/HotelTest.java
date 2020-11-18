import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Hotel hotel;

    @Before
    public void setUp() {
        bedroom = new Bedroom(25,4, "Double");
        conferenceRoom = new ConferenceRoom("Board Room", 10);
        hotel = new Hotel();
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
}
