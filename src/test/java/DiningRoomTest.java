import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest;

    @Before
    public void setUp() {
        diningRoom = new DiningRoom("Fancy Food");
        guest = new Guest("Hungry Harry");
    }

    @Test
    public void canAddGuestToDiningRoom() {
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.getGuests());
    }
}
