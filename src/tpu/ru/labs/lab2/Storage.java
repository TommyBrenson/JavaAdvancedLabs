package tpu.ru.labs.lab2;
import java.util.LinkedList;

public class Storage {
    private int capacity;
    private LinkedList<Product> products = new LinkedList<Product>();

    public Storage(int capacity) {
        this.capacity = capacity;
    }

    public void addProduct(Product product) {
        products.add(product);
    }
    public void removeProduct() {
        products.remove();
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public LinkedList<Product> getProducts() {
        return products;
    }
    public void setProducts(LinkedList<Product> products) {
        this.products = products;
    }

    public synchronized void get() {
            while (products.size() < 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("Thread has been interrupted.");
                }
            }
            removeProduct();
            System.out.printf("Потребитель купил 1 товар (товаров на складе: %d)\n", products.size());
            notify();
    }

    public synchronized void put() {
            while (products.size() >= capacity) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("Thread has been interrupted.");
                }
            }
            addProduct(new Product());
            System.out.printf("Производитель произвел 1 товар (товаров на складе: %d)\n", products.size());
            notify();
    }


}

class Product {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}