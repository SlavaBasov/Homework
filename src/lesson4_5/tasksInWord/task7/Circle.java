package lesson4_5.tasksInWord.task7;

import java.awt.*;

public class Circle extends Shape{
    private int x;
    private int y;
    private String name = "Круг";

    public Circle() {
    }

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        for(int i = 0; i < y; i++){
            System.out.println();
        }
        for (int i = 0; i < x; i++){
            System.out.print(" ");
        }
        System.out.println(name);
    }

    @Override
    public void equal(Shape shape){
        if(shape.getName().equals(this.name)){
            System.out.println("Фигуры одинаковые");
        } else {
            System.out.println("Фигуры разные");
        }
    }



}
