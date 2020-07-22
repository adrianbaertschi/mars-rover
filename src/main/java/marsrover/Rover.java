package marsrover;

public class Rover {
    private int x;
    private int y;
    private Direction direction;

    public Rover(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = Direction.valueOf(String.valueOf(direction));
    }

    public void move() {
        switch (this.direction) {
            case N -> this.y++;
            case E -> this.x++;
            case S -> this.y--;
            case W -> this.x--;
        }
    }

    public void turnRight() {
        this.direction = direction.rightOf();
    }

    public void turnLeft() {
        this.direction = direction.leftOf();
    }

    @Override
    public String toString() {
        return x + " " + y + " " + direction;
    }
}
