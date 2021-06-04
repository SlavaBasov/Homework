package lesson4_5.lesson4;

public class PersonProgram {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(5);
        person.setName("Mike");
        person.displayInfo();

        Person person2 = new Person();
        person.setAge(7);
        person.setName("Carl");
        person.displayInfo();

        int result = Person.sum(5, 6);
        double resultDouble = Person.sum(3.5, 4.2);
        System.out.println(result);
        System.out.println(resultDouble);
        int extraResult = Person.sum(5,2,5,7,5,3,7);
        System.out.println(extraResult);

    }
}