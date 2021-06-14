package lesson5_8_OOP.lesson8.task2;

public class Trumpet implements Instrument{
    private double diameter;

    public Trumpet() {
    }

    public Trumpet(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.printf("Играет труба, диаметр: %4.1f\n", diameter);
    }
}
