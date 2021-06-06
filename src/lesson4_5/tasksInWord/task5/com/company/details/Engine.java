package lesson4_5.tasksInWord.task5.com.company.details;

import java.util.SplittableRandom;

public class Engine {
    private double capacity;
    private String manufacturer;

    public Engine() {
    }

    public Engine(double capacity, String manufacturer) {
        this.capacity = capacity;
        this.manufacturer = manufacturer;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
