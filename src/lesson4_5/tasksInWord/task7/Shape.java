package lesson4_5.tasksInWord.task7;

public abstract class Shape {
    String color;
    String name = "Фигура";

    public abstract void draw();

    public String getName(){
        return name;
    }

    public abstract void equal(Shape shape);
}
