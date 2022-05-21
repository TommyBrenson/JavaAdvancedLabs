package tpu.ru.labs.lab3;

public class PetrolCarDecorator extends CarDecorator {

    public PetrolCarDecorator(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void refuel() {
        System.out.println(String.format("-----------------------------------\nPetrol car %s %s has been successfully refueled!", decoratedCar.getGeneralInfo().getManufacturer().getName(), decoratedCar.getGeneralInfo().getModelName()));
    }
}
