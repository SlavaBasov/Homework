package lesson4_5.tasksInWord.task4;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;
    private int scholarship;

    public Student() {
    }

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public void printInfo(){
        System.out.printf("FirstName: %s\nLastName: %s\nGroup: %s\n", firstName, lastName, group, averageMark);
    }

    public int getScholarship(){
        if(averageMark == 5){
            scholarship = 100;
        } else {
            scholarship = 80;
        }
        System.out.println("Scholarship: " + scholarship);
        return scholarship;
    }

    public void setScholarship(int scholarship){
        this.scholarship = scholarship;
    }
}
