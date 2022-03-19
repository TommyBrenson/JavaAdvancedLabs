package tpu.ru.labs.lab1;

public class Truck extends TransportCar {
    private int loadCapacity;

    public Truck(String regno, Dimensions dimensions, BaseInfo generalInfo, String bodyType, int numOfWheels, int loadCapacity) {
        super(regno, dimensions, generalInfo, bodyType, numOfWheels);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String getDescription() {
        return String.format("\nИнформация о машине (класс CivilCar):\n    | Регистрационный номер: %s\n    " +
                "| Габариты: %d x %d x %d\n    | Производитель: %s (%s)\n    | Количество дверей: %d\n    " +
                "| Название модели: %s\n    | Поколение: %s\n    | Дата сборки: %s\n    | Количество мест: %d\n    " +
                "| Масса: %d кг.\n    | Максимальная скорость: %d км/ч\n    | Тип кузова: %s\n    | Количество колес: %d\n    | Грузоподъемность: %d л.\n",  this.getRegno(), this.getDimensions().getLength(), this.getDimensions().getHeight(), this.getDimensions().getWidth(), this.getGeneralInfo().getManufacturer().getName(), this.getGeneralInfo().getManufacturer().getLocation(), this.getGeneralInfo().getNumOfDoors(), this.getGeneralInfo().getModelName(), this.getGeneralInfo().getGeneration(), this.getGeneralInfo().getProductionDate(), this.getGeneralInfo().getNumOfSeats(), this.getGeneralInfo().getWeight(), this.getGeneralInfo().getMaxSpeed(), this.getBodyType(), this.getNumOfWheels(), this.getLoadCapacity());
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }
    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

}
