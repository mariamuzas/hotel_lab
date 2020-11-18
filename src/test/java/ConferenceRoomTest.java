import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void setUp() {
        conferenceRoom = new ConferenceRoom("Board Room", 10);
        guest = new Guest ("Bob");
    }

    @Test
    public void roomHasName() {
        assertEquals("Board Room", conferenceRoom.getName());
    }
    @Test
    public void hasCapacity() {
        assertEquals(10, conferenceRoom.getCapacity());
    }
}
