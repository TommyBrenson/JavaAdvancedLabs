package tpu.ru.labs.lab6;

abstract class Vehicle {
    private String id;
    private String brand;

    Vehicle(String id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    public String getId() {
        return this.id;
    }
    public String getBrand() {
        return this.brand;
    }

    public void refuel(int amount) {};
    public void recharge(int amount) {};
}
