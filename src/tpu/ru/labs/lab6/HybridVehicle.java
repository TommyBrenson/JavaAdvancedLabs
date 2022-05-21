package tpu.ru.labs.lab6;

public class HybridVehicle extends Vehicle {
    private int fuel;
    private int charge;
    private boolean isPetrol = true;

    public HybridVehicle(String id, String brand, int fuel, int charge) {
        super(id, brand);
        this.fuel = fuel;
        this.charge = charge;
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

    @Override
    public void recharge(int amount) {
        System.out.println(String.format("-------------------\nHybrid %s (#%s, fuel = %d, charge = %d) is preparing for charging...", this.getBrand(), this.getId(), this.fuel, this.charge));
        if (this.charge >= 100) {
            System.out.println("Vehicle is already fully charged!");
        }
        else {
            this.charge += amount;
            System.out.println("Vehicle has successfully charged! Now charge level is " + this.charge);
        }
    }
}
