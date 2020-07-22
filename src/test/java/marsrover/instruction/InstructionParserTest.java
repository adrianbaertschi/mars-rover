package marsrover.instruction;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class InstructionParserTest {

    @Test
    public void parseOneInstruction() {
        List<Instruction> list = new InstructionParser().parseInstructions("M");
        assertThat(list)
                .hasSize(1)
                .first().isInstanceOf(MoveInstruction.class);
    }

    @Test
    public void parseMultipleInstructions() {
        List<Instruction> list = new InstructionParser().parseInstructions("MLRM");
        assertThat(list)
                .extracting("class")
                .containsExactly(MoveInstruction.class, LeftInstruction.class, RightInstruction.class, MoveInstruction.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseInvallidinstructionThrowsException() {
        new InstructionParser().parseInstructions("MLRU");
    }
}