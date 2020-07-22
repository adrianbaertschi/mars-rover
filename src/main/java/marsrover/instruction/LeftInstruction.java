package marsrover.instruction;

import marsrover.Rover;

class LeftInstruction implements Instruction {

    @Override
    public String letter() {
        return "L";
    }

    @Override
    public void execute(Rover rover) {
        rover.turnLeft();
    }
}
