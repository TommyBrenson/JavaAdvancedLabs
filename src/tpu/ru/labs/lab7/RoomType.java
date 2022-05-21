package tpu.ru.labs.lab7;

public enum RoomType {
    SINGLE("Single"),
    DOUBLE("Double"),
    SUITE("Luxe");

    private String type;

    RoomType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
