package tpu.ru.labs.lab6;

public class ElectricVehicle extends Vehicle {
    private int charge;

    ElectricVehicle(String id, String brand, int charge) {
        super(id, brand);
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
