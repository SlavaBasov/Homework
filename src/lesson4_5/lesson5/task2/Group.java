package lesson4_5.lesson5.task2;


public class Group {
    private String name;
    private Student[] students = new Student[4];

    public Group() {
    }

    public Group(String name) {
        this.name = name;
    }

    public Group(String name, Student[] students1) {
        this.name = name;
        this.students = students1;
    }

    public Group(String name, Student student1, Student student2, Student student3, Student student4) {
        this.name = name;
        this.students[0] = student1;
        this.students[1] = student2;
        this.students[2] = student3;
        this.students[3] = student4;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students1) {
        this.students = students1;
    }

    public void getInfo(){
        System.out.printf("Группа №%s:\n", name);
        for (int i = 0; i < students.length; i++){
            students[i].getInfo();
        }
    }
}
