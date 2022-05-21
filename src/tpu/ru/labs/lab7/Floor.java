package tpu.ru.labs.lab7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Floor {
    private Object rooms;
    private Iterator<Room> iterator;

    public Floor (Room[] rooms) {
        this.rooms = rooms;
        this.iterator = new ArrayIterator<Room>(rooms);
    }

    public Floor(List<Room> rooms) {
        this.rooms = rooms;
        this.iterator = new CollectionIterator<Room>(rooms);
    }
    public Floor (ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public int getTotalSquare() {
        int square = 0;
        while (iterator.hasNext()) {
            square += iterator.current().getSquare();
        }
        iterator.resetIndex();
        return square;
    }

    public int getTotalSquareByType(RoomType type) {
        int square = 0;
        while(iterator.hasNext()) {
            Room current = iterator.current();
            if (current.getType() == type) {
                square += current.getSquare();
            }
        }
        iterator.resetIndex();
        return square;
    }
}
