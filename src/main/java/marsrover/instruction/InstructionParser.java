package marsrover.instruction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InstructionParser {
    private final List<Instruction> instructionList = List.of(
            new MoveInstruction(),
            new LeftInstruction(),
            new RightInstruction());

    public List<Instruction> parseInstructions(String instructionCodes) {
        return Arrays.stream(instructionCodes.split(""))
                .map(this::findInstruction)
                .collect(Collectors.toList());
    }

    private Instruction findInstruction(String instructionCode) {
        return this.instructionList.stream()
                .filter(instruction -> instruction.code().equals(instructionCode))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Illegal instruction: " + instructionCode));
    }
}