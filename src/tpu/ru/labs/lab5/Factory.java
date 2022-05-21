package tpu.ru.labs.lab5;

public class Factory {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        // В фабричном методе необходимо каждый раз указывать тип создаваемого объекта при его создании
        Vehicle electric = carFactory.getVehicle("electric", "41jda-238onda28", "Nissan", 0, 141);
        Vehicle hybrid = carFactory.getVehicle("hybrid", "5182d-12pjaacz21", "Lotus", 21, 77);
        Vehicle petrol = carFactory.getVehicle("petrol", "1421d-12c213z99", "Honda", 110, 0);

        electric.recharge(44);
        hybrid.recharge(32);
        petrol.refuel(30);

    }
}
