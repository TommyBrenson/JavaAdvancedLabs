package tpu.ru.labs.lab2;
import java.util.concurrent.*;
import java.util.Scanner;
public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер склада: ");
        Storage storage = new Storage(sc.nextInt());

        Producer producer = new Producer("Producer", storage);
        Consumer consumer = new Consumer("Consumer", storage);
        producer.start();
        consumer.start();
    }

}
