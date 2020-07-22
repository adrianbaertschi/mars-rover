package marsrover;

import marsrover.instruction.InstructionParser;

public class Plateau {
    private final Rover rover;
    private final InstructionParser instructionParser = new InstructionParser();

    public Plateau(Rover rover) {
        this.rover = rover;
    }

    public void sendInstructions(String instructions) {
        instructionParser.parseInstructions(instructions).forEach(instruction -> instruction.execute(rover));
    }

    public String printRover() {
        return rover.toString();
    }
}