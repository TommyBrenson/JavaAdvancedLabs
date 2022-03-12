package tpu.ru.labs.lab2;
import tpu.ru.labs.lab1.RandomGeneratorClass;

public class Consumer extends Thread {
    Storage storage;

    Consumer(String name, Storage storage) {
        super(name);
        this.storage = storage;
    }

    public synchronized void run() {
        System.out.printf("Поток %s запущен...\n", Thread.currentThread().getName());
        while(true) {
            try {
                sleep(RandomGeneratorClass.getRandomNumber(150, 450));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            storage.get();
        }
    }
}
