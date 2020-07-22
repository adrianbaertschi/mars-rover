package marsrover.instruction;

import marsrover.Rover;

public interface Instruction {
    String letter();

    void execute(Rover rover);
}

