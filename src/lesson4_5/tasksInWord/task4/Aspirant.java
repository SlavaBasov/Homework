package lesson4_5.tasksInWord.task4;

public class Aspirant extends Student {
    private String sinceWork;
    private int scholarship;

    public Aspirant(String sinceWork) {
        this.sinceWork = sinceWork;
    }

    public Aspirant(String firstName, String lastName, String group, double averageMark, String sinceWork) {
        super(firstName, lastName, group, averageMark);
        this.sinceWork = sinceWork;
    }
    @Override
    public void printInfo(){
        System.out.printf("FirstName: %s\nLastName: %s\nGroup: %s\nAverageMark: %2.1f\nSinceWork: %s\n",
                getFirstName(), getLastName(), getGroup(), getAverageMark(), sinceWork);
    }

    public int getScholarship(){
        if(getAverageMark() == 5){
            scholarship = 200;
        } else {
            scholarship = 180;
        }
        System.out.println("Scholarship: " + scholarship);
        return scholarship;

    }

}
