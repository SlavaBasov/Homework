package lesson14.lambdasTest;
interface Operationable{
    int execute(int x, int y);
}

public class Example5 {
    public static void main(String[] args) {
        Operationable sum = action(1);
        Operationable minus = action(2);
        Operationable multiply = action(3);
        int a = sum.execute(4, 5);
        System.out.println(a);
    }
    private static Operationable action(int number){
        switch (number){
            case 1: return (x,y) -> x + y;
            case 2: return (x,y) -> x - y;
            case 3: return (x,y) -> x * y;
            default: return (x,y) -> 0;

        }
    }

}
