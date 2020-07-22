package marsrover.instruction;

import marsrover.Rover;

class LeftInstruction implements Instruction {

    @Override
    public String code() {
        return "L";
    }

    @Override
    public void execute(Rover rover) {
        rover.turnLeft();
    }
}
