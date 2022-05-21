package tpu.ru.labs.lab6;

public class HybridVehicleFactory implements AbstractCarFactory {
    private String id;
    private String brand;
    private int charge;
    private int fuel;

    public HybridVehicleFactory(String id, String brand, int fuel, int charge) {
        this.id = id;
        this.brand = brand;
        this.fuel = fuel;
        this.charge = charge;
    }

    public HybridVehicle createVehicle() {
        return new HybridVehicle(this.id, this.brand, this.fuel, this.charge);
    }
}
