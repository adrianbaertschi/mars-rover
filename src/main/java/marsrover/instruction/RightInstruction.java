package marsrover.instruction;

import marsrover.Rover;

class RightInstruction implements Instruction {

    @Override
    public String code() {
        return "R";
    }

    @Override
    public void execute(Rover rover) {
        rover.turnRight();
    }
}
