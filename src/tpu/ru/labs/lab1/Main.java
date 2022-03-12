package tpu.ru.labs.lab1;
import tpu.ru.labs.lab1.RandomGeneratorClass;
import java.util.*;

public class Main {
    public static void main(String [] args) {
        Car car = null;
        List <Car> list = new ArrayList<> ();
        RandomGeneratorClass rng = new RandomGeneratorClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество объектов: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Dimensions dimensions =  new Dimensions(rng.getRandomNumber(2, 3), rng.getRandomNumber(1,2), rng.getRandomNumber(2, 3));
            Manufacturer manufacturer = new Manufacturer(rng.getRandomString(7), rng.getRandomString(6));
            BaseInfo baseInfo = new BaseInfo(manufacturer, rng.getRandomNumber(2, 5), rng.getRandomNumber(4, 7), rng.getRandomNumber(1500, 3000), rng.getRandomNumber(200, 300), rng.getRandomString(8), rng.getRandomString(5), rng.getRandomString(9));
            switch (rng.getRandomNumber(1, 4)) {
                case 1:
                    car = new Car(rng.getRandomString(12), dimensions, baseInfo);
                    break;
                case 2:
                    car = new TransportCar(rng.getRandomString(12), dimensions, baseInfo, rng.getRandomString(7), rng.getRandomNumber(4, 8));
                    break;
                case 3:
                    car = new CivilCar(rng.getRandomString(12), dimensions, baseInfo,  rng.getRandomString(7), rng.getRandomNumber(4, 8), rng.getRandomNumber(300, 450));
                    break;
                case 4:
                    car = new Truck(rng.getRandomString(12), dimensions, baseInfo,  rng.getRandomString(7), rng.getRandomNumber(4, 8), rng.getRandomNumber(4000, 10000));
                    break;
            }
            list.add(car);
        }

        for (Car x : list) {
            System.out.println("----------------------" + x.getDescription() + "======================");
        }
    }
}
