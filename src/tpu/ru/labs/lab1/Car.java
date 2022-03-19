package tpu.ru.labs.lab1;

public class Car implements Fuelable {
    private String regno;
    private Dimensions dimensions;
    private BaseInfo generalInfo;

    public Car(String regno, Dimensions dimensions, BaseInfo generalInfo) {
        this.regno = regno;
        this.dimensions = dimensions;
        this.generalInfo = generalInfo;
    }

    public String getRegno() {
        return regno;
    }
    public void setRegno(String regno) {
        this.regno = regno;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public BaseInfo getGeneralInfo() {
        return generalInfo;
    }
    public void setGeneralInfo(BaseInfo generalInfo) {
        this.generalInfo = generalInfo;
    }


    protected int fuel;

    public void refuel(int amount) {
        this.fuel += amount;
    }
    public int checkFuel() {
        return this.fuel;
    }

    public String getDescription() {
        return String.format("\nИнформация о машине (базовый класс Car):\n    | Регистрационный номер: %s\n    " +
                "| Габариты: %d x %d x %d\n    | Производитель: %s (%s)\n    | Количество дверей: %d\n    " +
                "| Название модели: %s\n    | Поколение: %s\n    | Дата сборки: %s\n    | Количество мест: %d\n    " +
                "| Масса: %d кг.\n    | Максимальная скорость: %d км/ч\n", this.regno, this.dimensions.getLength(), this.dimensions.getHeight(), this.dimensions.getWidth(), this.generalInfo.getManufacturer().getName(), this.generalInfo.getManufacturer().getLocation(), this.generalInfo.getNumOfDoors(), this.generalInfo.getModelName(), this.generalInfo.getGeneration(), this.generalInfo.getProductionDate(), this.generalInfo.getNumOfSeats(), this.generalInfo.getWeight(), this.generalInfo.getMaxSpeed());
    }
}

class Dimensions {
    private int length;
    private int width;
    private int height;

    public Dimensions(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}
class BaseInfo {
    private Manufacturer manufacturer;
    private int numOfDoors;
    private int numOfSeats;
    private int weight;
    private int maxSpeed;
    private String modelName;
    private String generation;
    private String productionDate;

    public BaseInfo(Manufacturer manufacturer, int numOfDoors, int numOfSeats, int weight, int maxSpeed, String modelName, String generation, String productionDate) {
        this.manufacturer = manufacturer;
        this.numOfDoors = numOfDoors;
        this.numOfSeats = numOfSeats;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.modelName = modelName;
        this.generation = generation;
        this.productionDate = productionDate;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }
    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }
    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxSpeed() { return maxSpeed; }
    public void setMaxSpeed(int maxSpeed) { this.maxSpeed = maxSpeed; }

    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getGeneration() {
        return generation;
    }
    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public String getProductionDate() {
        return productionDate;
    }
    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }
}
class Manufacturer {
    private String name;
    private String location;

    public Manufacturer(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}