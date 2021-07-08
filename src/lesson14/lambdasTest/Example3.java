package lesson14.lambdasTest;

public class Example3 {
    public static void main(String[] args) {
        Expression func = i -> i%2==0;
        Expression func2 = i -> i > 5;
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(sum(numbers, func));
        System.out.println(sum(numbers, func2));

    }

    private static int sum(int[] numbers, Expression func){
        int result = 0;
        for(int i: numbers){
            if(func.isEqual(i)){
                result += i;
            }
        }
        return result;
    }
}

interface Expression{
    boolean isEqual(int i);
}
