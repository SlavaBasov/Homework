package lesson14.functionalIntarfaces;

public class Example {
    public static void main(String[] args) {
        Car car = new Car("Audi", 5000, false);
        Car car2 = new Car("KIA", 6000, true);
        printTest(car, c->c.isFullDrive());
        printTest(car, c-> c.isFullDrive());
    }

    private static void printTest(Car car, CheckCar check){
        if(check.test(car)){
            System.out.println(car);
        }
    }
}



