package tpu.ru.labs.lab6;

public class CarFactory {
    public static Vehicle getVehicle(AbstractCarFactory factory) {
        return factory.createVehicle();
    }
}
