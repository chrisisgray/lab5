import org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class Examples {
    EventGuests guestsLists = new EventGuests(new List());
    EventGuests guestsBSTs = new EventGuests(new EmptyBST());

    @Test
    public void guestListsTest() {
        assertEquals(0, guestsLists.guests.size(), 0.1);
    }
}
