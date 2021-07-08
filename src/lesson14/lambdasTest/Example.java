package lesson14.lambdasTest;

public class Example {
    public static void main(String[] args) {
        Operationable1 sum = (x,y)-> x+y;
        System.out.println(sum.operation(10, 20));
        Operationable1 minus = (x,y)-> x-y;
        Operationable1 multiply = (x,y) -> x*y;
        Operationable1 division = (x,y) -> x/y;
        System.out.println(minus.operation(4, 2));
        System.out.println(multiply.operation(45, 24));
        System.out.println(division.operation(45,5));


    }
}
@FunctionalInterface
interface Operationable1{
    int operation(int x,int y);
}
