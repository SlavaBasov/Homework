package lesson5_8_OOP.tasksInWord.task5.com.company.professions;

import lesson5_8_OOP.tasksInWord.task2.Person;

public class Driver extends Person{
    private double drivingExp;

    public Driver() {
    }

    public Driver(String fullName, double drivingExp) {
        setFullName(fullName);
        this.drivingExp = drivingExp;
    }

    public double getDrivingExp() {
        return drivingExp;
    }

    public void setDrivingExp(double drivingExp) {
        this.drivingExp = drivingExp;
    }

    @Override
    public String toString() {
        return String.format("Имя водителя: %s\t Стаж вождения: %2.1f\n");
    }
}
