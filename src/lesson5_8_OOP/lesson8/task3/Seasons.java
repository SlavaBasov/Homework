package lesson5_8_OOP.lesson8.task3;

public enum Seasons {
    WINTER(-10),
    SPRING(5),
    SUMMER(15){
        @Override
        public void getDescription(){
            System.out.println("Теплое время года");
        }
    },
    AUTUMN(6);

    private int middleTemp;

    Seasons(int i) {
        middleTemp = i;
    }

    public int getMiddleTemp() {
        return middleTemp;
    }

    public void setMiddleTemp(int middleTemp) {
        this.middleTemp = middleTemp;
    }

    public void print(){
        System.out.printf("Name: %s     Class: %s    Value: %s   Ordinal: %s\n", super.name(), super.getClass(),
                Seasons.valueOf(super.name()), super.ordinal());
    }

    public static void printFavorite(Seasons seasons){
        switch (seasons){
            case WINTER: System.out.println("Я люблю зиму, средняя температура зимой: " + seasons.getMiddleTemp()); break;
            case SPRING: System.out.println("Я люблю весну, средняя температура весной: " + seasons.getMiddleTemp()); break;
            case SUMMER: System.out.println("Я люблю лето, средняя температура летом: " + seasons.getMiddleTemp()); break;
            case AUTUMN: System.out.println("Я люблю осень, средняя температура осенью: " + seasons.getMiddleTemp()); break;

        }
    }

    public void getDescription(){
        System.out.println("Холодное время года");
    }
}
