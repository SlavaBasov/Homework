package lesson2;
/*1)Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
        день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
        суммарный путь пробежит спортсмен за 7 дней?*/
public class Task_1 {
    public static void main(String[] args) {
        double distance = 10;
        double percent = 0.1;
        double totalDistance = distance;
        System.out.printf("В 1 день пробежал: %10.2f\n", distance);

        for(int i = 2; i <= 7; i++){
            distance += distance * percent;
            totalDistance += distance;
            System.out.printf("В %d день пробежал: %10.2f\n", i, distance);

        }
        System.out.printf("Всего пробежал: %10.2f\n", totalDistance);
    }
}
