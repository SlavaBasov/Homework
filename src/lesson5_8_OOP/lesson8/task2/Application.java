package lesson5_8_OOP.lesson8.task2;

public class Application {
    public static void main(String[] args) {

        Instrument guitar = new Guitar(6);
        Instrument drum = new Drum("большой");
        Instrument trumpet = new Trumpet(40);

        Instrument[] instruments = {guitar, drum, trumpet};

        for (Instrument i: instruments){
            i.play();
        }
    }
}
