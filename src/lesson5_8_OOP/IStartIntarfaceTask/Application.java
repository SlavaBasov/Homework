package lesson5_8_OOP.IStartIntarfaceTask;

public class Application {
    public static void main(String[] args) {
        IStart shuttle = new Shuttle();
        Spaceport spaceport = new Spaceport();
        spaceport.start(shuttle);

    }
}
