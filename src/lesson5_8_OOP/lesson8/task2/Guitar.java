package lesson5_8_OOP.lesson8.task2;

public class Guitar implements Instrument{
    private int numOfStrings;

    public Guitar() {
    }

    public Guitar(int numOfStrings) {
        this.numOfStrings = numOfStrings;
    }

    @Override
    public void play() {
        System.out.printf("Играет гитара, количество струн: %s\n", numOfStrings);
    }
}
