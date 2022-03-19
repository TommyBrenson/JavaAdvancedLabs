package tpu.ru.labs.lab1;

public class TransportCar extends Car {
    private String bodyType;
    private int numOfWheels;

    public TransportCar(String regno, Dimensions dimensions, BaseInfo generalInfo, String bodyType, int numOfWheels) {
        super(regno, dimensions, generalInfo);
        this.bodyType = bodyType;
        this.numOfWheels = numOfWheels;
    }

    @Override
    public String getDescription() {
        return String.format("\nИнформация о машине (класс TransportCar):\n    | Регистрационный номер: %s\n    " +
                "| Габариты: %d x %d x %d\n    | Производитель: %s (%s)\n    | Количество дверей: %d\n    " +
                "| Название модели: %s\n    | Поколение: %s\n    | Дата сборки: %s\n    | Количество мест: %d\n    " +
                "| Масса: %d кг.\n    | Максимальная скорость: %d км/ч\n    | Тип кузова: %s\n    | Количество колес: %d\n",  this.getRegno(), this.getDimensions().getLength(), this.getDimensions().getHeight(), this.getDimensions().getWidth(), this.getGeneralInfo().getManufacturer().getName(), this.getGeneralInfo().getManufacturer().getLocation(), this.getGeneralInfo().getNumOfDoors(), this.getGeneralInfo().getModelName(), this.getGeneralInfo().getGeneration(), this.getGeneralInfo().getProductionDate(), this.getGeneralInfo().getNumOfSeats(), this.getGeneralInfo().getWeight(), this.getGeneralInfo().getMaxSpeed(), this.getBodyType(), this.getNumOfWheels());
    }

    public String getBodyType() {
        return bodyType;
    }
    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }
    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }
}
