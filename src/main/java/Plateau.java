public class Plateau {
    private final Rover rover;

    public Plateau(Rover rover) {
        this.rover = rover;
    }

    public void sendInstructions(String instructions) {
        instructions.chars().forEach(this::execute);
    }

    private void execute(int instruction) {
        switch ((char) instruction) {
            case 'M' -> rover.move();
            case 'L' -> rover.turnLeft();
            case 'R' -> rover.turnRight();
            default -> throw new IllegalArgumentException("Illegal instruction: " + instruction);
        }
    }

    public String roverAsString() {
        return rover.toString();
    }
}
