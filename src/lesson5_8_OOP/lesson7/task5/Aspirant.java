package lesson5_8_OOP.lesson7.task5;

public class Aspirant extends Student{
    private String sinceWork;

    public Aspirant() {
    }

    public Aspirant(String sinceWork) {
        this.sinceWork = sinceWork;
    }

    public Aspirant(String firstName, String lastName, String group, double averageMark, String sinceWork) {
        super(firstName, lastName, group, averageMark);
        this.sinceWork = sinceWork;
    }

    public String getSinceWork() {
        return sinceWork;
    }

    public void setSinceWork(String sinceWork) {
        this.sinceWork = sinceWork;
    }

    @Override
    public int getScolarship(){
        if(super.getAverageMark() == 5){
            return 200;
        } else {
            return 180;
        }
    }
}
