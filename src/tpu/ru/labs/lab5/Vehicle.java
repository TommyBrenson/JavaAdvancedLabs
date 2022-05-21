package tpu.ru.labs.lab5;

public abstract class Vehicle {

    public abstract String getId();
    public abstract String getBrand();

    public void refuel(int amount) {};
    public void recharge(int amount) {};

}
