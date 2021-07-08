package lesson14.lambdasTest;

import java.util.Scanner;
import java.util.function.*;

public class InputIntarfaces {
    public static void main(String[] args) {
        //Predicate
        //Функциональный интерфейс Predicate<T> проверяет соблюдение некоторого условия. Если оно соблюдается, то возвращается значение true. В качестве параметра лямбда-выражение принимает объект типа T:
        Predicate<Integer> isPositive = i -> i > 0;
        System.out.println(isPositive.test(5));

        //BinaryOperator
        //BinaryOperator<T> принимает в качестве параметра два объекта типа T, выполняет над ними бинарную операцию и возвращает ее результат также в виде объекта типа T:
        BinaryOperator<Integer> sum = (x,y) -> x + y;
        System.out.println(sum.apply(4, 24));

        //UnaryOperator
        //UnaryOperator<T> принимает в качестве параметра объект типа T, выполняет над ними операции и возвращает результат операций в виде объекта типа T:
        UnaryOperator<String> trim = x -> x.trim();
        String s = "   Java is coool    ";
        s = trim.apply(s);
        System.out.println(s);

        //Function
        //Функциональный интерфейс Function<T,R> представляет функцию перехода от объекта типа T к объекту типа R:
        Function<Integer, String> convert = x -> String.valueOf(x) + " долларов";
        System.out.println(convert.apply(5));

        //Consumer
        //выполняет некоторое действие над объектом типа T, при этом ничего не возвращая:
        Consumer<Integer> printer = i -> System.out.printf("%d долларов\n", i);
        printer.accept(500);

        //Supplier
        //не принимает никаких аргументов, но должен возвращать объект типа T:
        Supplier<UserInt> userFactory = ()-> {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите имя: ");
            String name = in.nextLine();
            return new UserInt(name);
        };
        UserInt user1 = userFactory.get();
        UserInt user2 = userFactory.get();

        System.out.println("Имя user1: " + user1.getName());
        System.out.println("Имя user2: " + user2.getName());


    }

}
class UserInt{
    private String name;

    public UserInt(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
