import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverTest {

    @Test
    public void move_north_increase_y() {
        Rover rover = new Rover(1, 1, 'N');
        rover.move();
        assertEquals("1 2 N", rover.toString());
    }

    @Test
    public void move_east_increase_x() {
        Rover rover = new Rover(1, 1, 'E');
        rover.move();
        assertEquals("2 1 E", rover.toString());
    }

    @Test
    public void move_south_decrease_y() {
        Rover rover = new Rover(1, 1, 'S');
        rover.move();
        assertEquals("1 0 S", rover.toString());
    }

    @Test
    public void move_west_decrease_x() {
        Rover rover = new Rover(1, 1, 'W');
        rover.move();
        assertEquals("0 1 W", rover.toString());
    }

    @Test
    public void turn_right_change_direction() {
        Rover rover = new Rover(1, 1, 'W');
        rover.turnRight();
        assertEquals("1 1 N", rover.toString());
    }

    @Test
    public void turn_left_change_direction() {
        Rover rover = new Rover(1, 1, 'W');
        rover.turnLeft();
        assertEquals("1 1 S", rover.toString());
    }

    @Test
    public void turn_360_back_to_start() {
        Rover rover = new Rover(1, 1, 'N');
        rover.turnLeft();
        rover.turnLeft();
        rover.turnLeft();
        rover.turnLeft();
        assertEquals("1 1 N", rover.toString());
    }

}