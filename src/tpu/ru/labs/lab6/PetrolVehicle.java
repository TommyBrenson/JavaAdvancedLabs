package tpu.ru.labs.lab6;

public class PetrolVehicle extends Vehicle {
    private int fuel;

    PetrolVehicle(String id, String brand, int fuel) {
        super(id, brand);
        this.fuel = fuel;
    }

    public int getFuel() {
        return this.fuel;
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
