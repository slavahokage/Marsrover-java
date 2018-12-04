import company.Mars.MarsRover;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestResults {

    @Test
    public void test1() {
        MarsRover marsRover = new MarsRover();
        assertEquals(13, marsRover.getMinCountOfInstructions(26));
    }

    @Test
    public void test2() {
        MarsRover marsRover = new MarsRover();
        assertEquals(2, marsRover.getMinCountOfInstructions(3));
    }


    @Test
    public void test3() {
        MarsRover marsRover = new MarsRover();
        assertEquals(7, marsRover.getMinCountOfInstructions(5));
    }

    @Test
    public void test4() {
        MarsRover marsRover = new MarsRover();
        assertEquals(5, marsRover.getMinCountOfInstructions(6));
    }
}
