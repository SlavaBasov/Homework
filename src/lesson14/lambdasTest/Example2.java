package lesson14.lambdasTest;

import java.util.function.BinaryOperator;

public class Example2 {
    public static void main(String[] args) {
        Operationable2<String> sum1 = (x,y) -> x + y;
        System.out.println(sum1.calculate("Вася ", "Пупкин"));
        BinaryOperator<Integer> sum2 = (x,y) -> x + y;
        System.out.println(sum2.apply(40, 15));
    }
}

interface Operationable2<T>{
    public T calculate(T x, T y);
}
