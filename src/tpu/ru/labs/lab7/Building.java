package tpu.ru.labs.lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Building {
    private Object floors;
    private Iterator<Floor> iterator;

    public Building(Floor[] floors) {
        this.floors = floors;
        this.iterator = new ArrayIterator<Floor>(floors);
    }

    public Building(List<Floor> floors) {
        this.floors = floors;
        this.iterator = new CollectionIterator<Floor>(floors);
    }

    public int getTotalSquare() {
        int square = 0;
        System.out.println("Square by each floor:\n-----------------------------");
        while(iterator.hasNext()) {
            int tmp = iterator.current().getTotalSquare();
            System.out.println(String.format("Floor %d: %d", iterator.getIndex(), tmp));
            square += tmp;
        }
        iterator.resetIndex();
        return square;
    }

    public int getTotalSquareByType(RoomType type) {
        int square = 0;
        while(iterator.hasNext()) {
            Floor current = iterator.current();
            square += current.getTotalSquareByType(type);
        }

        iterator.resetIndex();
        return square;
    }
}
