package lesson5_8_OOP.lesson8.task2;

public class Drum implements Instrument{
    private String size;

    public Drum() {
    }

    public Drum(String size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.printf("Играет барабан, размер: %s\n", size);
    }
}
