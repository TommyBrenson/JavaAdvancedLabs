package tpu.ru.labs.lab3;

abstract class CarDecorator implements Decorator {

    Car decoratedCar;

    public CarDecorator(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    @Override
    public String getDescription() {
        return this.decoratedCar.getDescription();
    }
}
