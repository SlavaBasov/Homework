package lesson11.task4;

import java.io.*;

public class Serialize {
    public static void serializeOut(Car car){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Lesson11Task4Serialize.txt"))){
            oos.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void serializeOut(Car car, String fileName){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
            oos.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Car serializeIn(String fileName){
        Car car = new Car();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
            car = (Car) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return car;
    }
}
