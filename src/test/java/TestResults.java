import company.Mars.MarsRover;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestResults {

    @Test
    public void test() {
        MarsRover marsRover = new MarsRover();
        assertEquals(13, marsRover.getMinCountOfInstructions(26));
        assertEquals(2, marsRover.getMinCountOfInstructions(3));
        assertEquals(7, marsRover.getMinCountOfInstructions(5));
    }
}
