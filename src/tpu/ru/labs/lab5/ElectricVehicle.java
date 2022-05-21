package tpu.ru.labs.lab5;

public class ElectricVehicle extends Vehicle {
    private String id;
    private String brand;
    private int charge;

    public String getId() {
        return this.id;
    }
    public String getBrand() {
        return this.brand;
    }

    public ElectricVehicle(String id, String brand, int charge) {
        this.id = id;
        this.brand = brand;
        this.charge = charge;
    }

    @Override
    public void recharge(int amount) {
        System.out.println(String.format("-------------------\nElectric %s (#%s, charge = %d) is preparing for charging...", this.getBrand(), this.getId(), this.charge));
        if (this.charge >= 100) {
            System.out.println("Vehicle is already fully charged!");
        }
        else {
            this.charge += amount;
            System.out.println("Vehicle has successfully charged! Now charge level is " + this.charge);
        }
    }
}
