package tpu.ru.labs.lab7;

import java.util.*;

public class Main {
    public static void main(String [] args) {
        // Array
        Floor firstFloor = new Floor(new Room[]{new Room(RoomType.DOUBLE, 22), new Room(RoomType.SUITE, 44), new Room(RoomType.SUITE, 50)});
        // ArrayList
        Floor secondFloor = new Floor((List<Room>)new ArrayList<Room>(Arrays.asList(new Room(RoomType.SINGLE, 18), new Room(RoomType.SINGLE, 20))));
        // LinkedList
        Floor thirdFloor = new Floor(new LinkedList<Room>(Arrays.asList(new Room(RoomType.DOUBLE, 32), new Room(RoomType.DOUBLE, 32), new Room(RoomType.SINGLE,  20))));
        // Vector
        Floor fourthFloor = new Floor(new Vector<Room>(Arrays.asList(new Room(RoomType.SUITE, 70), new Room(RoomType.SUITE, 100))));

        Building building = new Building(new Floor[]{firstFloor, secondFloor, thirdFloor, fourthFloor});
        RoomType type = RoomType.SUITE;

        System.out.println(String.format("-----------------------------\nTotal square of building: %d", building.getTotalSquare()));
        System.out.println(String.format("-----------------------------\nTotal square of %s rooms: %d", type.getType(), building.getTotalSquareByType(type)));
    }
}
