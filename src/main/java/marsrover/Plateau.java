package marsrover;

import marsrover.instruction.Instruction;
import marsrover.instruction.InstructionParser;

import java.util.List;

public class Plateau {
    private final Rover rover;
    private final InstructionParser instructionParser = new InstructionParser();

    public Plateau(Rover rover) {
        this.rover = rover;
    }

    public void sendInstructions(String instructions) {
        List<Instruction> collect = instructionParser.parseInstructions(instructions);
        collect.forEach(instruction -> instruction.execute(rover));
    }

    public String printRover() {
        return rover.toString();
    }
}