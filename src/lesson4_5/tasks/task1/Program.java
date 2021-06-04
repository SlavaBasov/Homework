package lesson4_5.tasks.task1;

public class Program {
    public static void main(String[] args) {
        Phone phone = new Phone(375232643, "Nokia Lumia 8", 8);
        Phone phone1 = new Phone(158999957, "Iphone 11", 7);
        Phone phone2 = new Phone();
        phone2.setNumber(464664896);
        phone2.setModel("Xiaomi Redmi 9");
        phone2.setWeight(9);

        phone.displayInfo();
        phone1.displayInfo();
        phone2.displayInfo();
        System.out.println();

        phone.receiveCall("Max");
        System.out.println(phone.getNumber());

        phone.receiveCall("Tom", 465669887);
        phone.sendMessage(151661618, 984894894, 498498489, 448949489);


    }


}
