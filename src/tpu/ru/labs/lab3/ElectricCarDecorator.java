package tpu.ru.labs.lab3;

public class ElectricCarDecorator extends CarDecorator {

    public ElectricCarDecorator(Car decoratedCar) {
        super(decoratedCar);
    }


    @Override
    public void refuel() {
        System.out.println(String.format("-----------------------------------\nElectric car %s %s has been successfully recharged!", decoratedCar.getGeneralInfo().getManufacturer().getName(), decoratedCar.getGeneralInfo().getModelName()));
    }
}
