package lesson5_8_OOP.tasksInWord.task1;

public class Phone {
    private int number;
    private String model;
    private int weight;

    public Phone(){
    }

    public Phone(int number) {
        this.number = number;
    }

    public Phone(int number, String model) {
        this(number);
        this.model = model;
    }

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void displayInfo(){
        System.out.printf("Number: %d   Model: %s   Weight: %d\n", number, model, weight);
    }

    public void receiveCall(String nameIn){
        System.out.println("Звонит " + nameIn);
    }

    public void receiveCall(String nameIn, int numberIn){
        System.out.println("Звонит " + nameIn + ".   Номер телефона: " + numberIn);
    }

    public void sendMessage(int... number){
        for (int i: number){
            System.out.println("Сообщение отправлено на номер " + i);
        }
    }

}
