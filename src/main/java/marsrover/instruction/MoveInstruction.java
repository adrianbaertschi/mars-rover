package marsrover.instruction;

import marsrover.Rover;

class MoveInstruction implements Instruction {

    @Override
    public String code() {
        return "M";
    }

    @Override
    public void execute(Rover rover) {
        rover.move();
    }
}
