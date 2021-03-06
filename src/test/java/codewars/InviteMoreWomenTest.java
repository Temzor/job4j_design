package codewars;

import ru.codewars.eightkyu.InviteMoreWomen;
import org.junit.Test;

import static org.junit.Assert.*;

public class InviteMoreWomenTest {
    @Test
    public void basicTests() {
        assertTrue(InviteMoreWomen.inviteMoreWomen(new int[] {1, -1, 1}));
        assertFalse(InviteMoreWomen.inviteMoreWomen(new int[] {-1, -1, -1}));
        assertFalse(InviteMoreWomen.inviteMoreWomen(new int[] {1, -1}));
        assertTrue(InviteMoreWomen.inviteMoreWomen(new int[] {1, 1, 1}));
    }

}