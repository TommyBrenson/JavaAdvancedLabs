package tpu.ru.labs.lab7;

public class Room {
    private RoomType type;
    private int square;

    public Room(RoomType type, int square) {
        this.type = type;
        this.square = square;
    }

    public RoomType getType() {
        return this.type;
    }
    public void setType(RoomType type) {
        this.type = type;
    }

    public int getSquare() {
        return this.square;
    }
    public void setSquare(int square) {
        this.square = square;
    }
}
