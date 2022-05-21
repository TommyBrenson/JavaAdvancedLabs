package tpu.ru.labs.lab5;

public class HybridVehicle extends Vehicle {
    private String id;
    private String brand;
    private int fuel;
    private int charge;

    public String getId() {
        return this.id;
    }
    public String getBrand() {
        return this.brand;
    }

    public HybridVehicle(String id, String brand, int fuel, int charge) {
        this.id = id;
        this.brand = brand;
        this.fuel = fuel;
        this.charge = charge;
    }

    @Override
    public void recharge(int amount) {
        System.out.println(String.format("-------------------\nHybrid %s (#%s, charge = %d) is preparing for charging...", this.getBrand(), this.getId(), this.charge));
        if (this.charge >= 100) {
            System.out.println("Vehicle is already fully charged!");
        }
        else {
            this.charge += amount;
            System.out.println("Vehicle has successfully charged! Now charge level is " + this.charge);
        }
    }

    @Override
    public void refuel(int amount) {
        System.out.println(String.format("-------------------\nHybrid %s (#%s, fuel = %d, charge = %d) is preparing for fuelling...", this.getBrand(), this.getId(), this.fuel, this.charge));
        if (this.fuel >= 100) {
            System.out.println("Vehicle is already fully fueled!");
        }
        else {
            this.fuel += amount;
            System.out.println("Vehicle has successfully fueled! Now fuel level is " + this.fuel);
        }
    }


}
