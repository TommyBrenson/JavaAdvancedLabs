package tpu.ru.labs.lab6;

public class ElectricVehicleFactory implements AbstractCarFactory {
    private String id;
    private String brand;
    private int charge;

    public ElectricVehicleFactory(String id, String brand, int charge) {
        this.id = id;
        this.brand = brand;
        this.charge = charge;
    }

    public ElectricVehicle createVehicle() {
        return new ElectricVehicle(this.id, this.brand, this.charge);
    }

}
