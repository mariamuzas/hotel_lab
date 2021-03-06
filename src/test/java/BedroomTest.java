import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void setUp() {
        bedroom = new Bedroom(25, 4, "Double", 89.50);
        guest = new Guest("Jane");
    }

    @Test
    public void roomHasNumber() {
    assertEquals(25, bedroom.getRoomNumber());
    }

    @Test
    public void roomHasCapacity() {
    assertEquals(4, bedroom.getCapacity());
    }

    @Test
    public void roomHasType() {
    assertEquals("Double", bedroom.getType());
    }

    @Test
    public void bedroomCanAddGuest() {
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.guestsCount());
    }
}
