import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {
    Booking booking;
    Bedroom bedroom;

    @Before
    public void setUp(){
        bedroom = new Bedroom(25,4, "Double", 89.50);
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
    
    @Test 
    public void canGetTotalBill() {
        assertEquals( 447.5, booking.getBill(), 0.01);
    }

}
