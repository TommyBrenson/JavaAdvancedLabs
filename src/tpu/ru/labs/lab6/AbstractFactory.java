package tpu.ru.labs.lab6;

public class AbstractFactory {
    public static void main(String [] args) {

        // Фабрика сама определяет какой объект создать, полагаясь на переданную ей конкретную фабрику (тип объекта)
        Vehicle hybrid = CarFactory.getVehicle(new HybridVehicleFactory("ad214-98298da", "BMW", 12, 110));
        Vehicle electric = CarFactory.getVehicle(new ElectricVehicleFactory("23122-231kzc", "Nissan", 4));
        Vehicle petrol = CarFactory.getVehicle(new PetrolVehicleFactory("221d2-59439f", "Renault", 120));

        hybrid.refuel(12);
        hybrid.recharge(42);

        electric.recharge(100);

        petrol.refuel(21);
    }
}
