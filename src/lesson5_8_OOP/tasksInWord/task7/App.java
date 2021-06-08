package lesson5_8_OOP.tasksInWord.task7;

public class App {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,5);
        Circle circle = new Circle(1, 8);
        Shape[] shapes = {rectangle, circle};
        for(Shape shape: shapes){
            shape.draw();
        }
        circle.equal(rectangle);

    }
}
