package tpu.ru.labs.lab5;

public class PetrolVehicle extends Vehicle {
    private String id;
    private String brand;
    private int fuel;

    public String getId() {
        return this.id;
    }
    public String getBrand() {
        return this.brand;
    }

    public PetrolVehicle(String id, String brand, int fuel) {
        this.id = id;
        this.brand = brand;
        this.fuel = fuel;
    }

    @Override
    public void refuel(int amount) {
        System.out.println(String.format("-------------------\nPetrol %s (#%s, fuel = %d) is preparing for fuelling...", this.getBrand(), this.getId(), this.fuel));
        if (this.fuel >= 100) {
            System.out.println("Vehicle is already fully fueled!");
        }
        else {
            this.fuel += amount;
            System.out.println("Vehicle has successfully fueled! Now fuel level is " + this.fuel);
        }
    }
}
