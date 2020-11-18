import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {
    Booking booking;
    Bedroom bedroom;

    @Before
    public void setUp(){
        bedroom = new Bedroom(25,4, "Double");
        booking = new Booking(bedroom, 5);
    }

    @Test
    public void canCheckTypeBedroomBooked(){
        assertEquals("Double", booking.getBedroom().getType());
    }

    @Test
    public void canCheckNumNightsBooked() {
        assertEquals(5, booking.getNightsBooked());
    }

}
