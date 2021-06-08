package lesson5_8_OOP.lesson7.task6.com.company.professions;

public class Driver {
    private String name;
    private double drivingStage;

    public Driver() {
    }

    public Driver(String name, double drivingStage) {
        this.name = name;
        this.drivingStage = drivingStage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDrivingStage() {
        return drivingStage;
    }

    public void setDrivingStage(double drivingStage) {
        this.drivingStage = drivingStage;
    }
}
