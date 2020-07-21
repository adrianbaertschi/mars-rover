import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlateauTest {

    @Test
    public void start() {
        final Rover rover = new Rover(1, 2, 'N');
        final Plateau plateau = new Plateau(rover);

        assertEquals("1 2 N", plateau.roverAsString());
    }

    @Test
    public void firstMove() {
        final Rover rover = new Rover(1, 2, 'N');
        final Plateau plateau = new Plateau(rover);

        plateau.sendInstructions("M");
        assertEquals("1 3 N", plateau.roverAsString());
    }

    @Test
    public void multipleMoves() {
        final Rover rover = new Rover(1, 2, 'E');
        final Plateau plateau = new Plateau(rover);

        plateau.sendInstructions("MMM");
        assertEquals("4 2 E", plateau.roverAsString());
    }

    @Test
    public void moveAndTurn() {
        final Rover rover = new Rover(1, 2, 'E');
        final Plateau plateau = new Plateau(rover);

        plateau.sendInstructions("ML");
        assertEquals("2 2 N", plateau.roverAsString());
    }

    @Test
    public void exampleFromGithub1() {
        final Rover rover = new Rover(1, 2, 'N');
        final Plateau plateau = new Plateau(rover);

        plateau.sendInstructions("LMLMLMLMM");

        assertEquals("1 3 N", plateau.roverAsString());
    }

    @Test
    public void exampleFromGithub2() {
        final Rover rover = new Rover(3, 3, 'E');
        final Plateau plateau = new Plateau(rover);

        plateau.sendInstructions("MMRMMRMRRM");

        assertEquals("5 1 E", plateau.roverAsString());
    }
}
