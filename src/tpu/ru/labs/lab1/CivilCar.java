package tpu.ru.labs.lab1;

public class CivilCar extends TransportCar {
    private int trunkVol;

    public CivilCar(String regno, Dimensions dimensions, BaseInfo generalInfo, String bodyType, int numOfWheels, int trunkVol) {
        super(regno, dimensions, generalInfo, bodyType, numOfWheels);
        this.trunkVol = trunkVol;
    }

    @Override
    public String getDescription() {
        return String.format("\nИнформация о машине (класс CivilCar):\n    | Регистрационный номер: %s\n    " +
            "| Габариты: %d x %d x %d\n    | Производитель: %s (%s)\n    | Количество дверей: %d\n    " +
            "| Название модели: %s\n    | Поколение: %s\n    | Дата сборки: %s\n    | Количество мест: %d\n    " +
            "| Масса: %d кг.\n    | Максимальная скорость: %d км/ч\n    | Тип кузова: %s\n    | Количество колес: %d\n    | Объем багажника: %d л.\n",  this.getRegno(), this.getDimensions().getLength(), this.getDimensions().getHeight(), this.getDimensions().getWidth(), this.getGeneralInfo().getManufacturer().getName(), this.getGeneralInfo().getManufacturer().getLocation(), this.getGeneralInfo().getNumOfDoors(), this.getGeneralInfo().getModelName(), this.getGeneralInfo().getGeneration(), this.getGeneralInfo().getProductionDate(), this.getGeneralInfo().getNumOfSeats(), this.getGeneralInfo().getWeight(), this.getGeneralInfo().getMaxSpeed(), this.getBodyType(), this.getNumOfWheels(), this.getTrunkVol());

    }

    public int getTrunkVol() {
        return trunkVol;
    }
    public void setTrunkVol(int trunkVol) {
        this.trunkVol = trunkVol;
    }
}
