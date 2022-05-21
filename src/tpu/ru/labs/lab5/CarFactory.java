package tpu.ru.labs.lab5;

public class CarFactory {

    Vehicle getVehicle(String type, String id, String brand, int fuel, int charge) throws RuntimeException{
        switch (type.toUpperCase()) {
            case "ELECTRIC":
                return new ElectricVehicle(id, brand, charge);
            case "PETROL":
                return new PetrolVehicle(id, brand, fuel);
            case "HYBRID":
                return new HybridVehicle(id, brand, fuel, charge);
            default:
                System.out.println("Sorry, there's no such type of vehicle!");
                throw new RuntimeException();

        }
    }
}
