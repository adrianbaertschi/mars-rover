package marsrover.instruction;

import marsrover.Rover;

public interface Instruction {
    String code();

    void execute(Rover rover);
}

