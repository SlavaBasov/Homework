package lesson5_8_OOP.IStartIntarfaceTask;

public class Spaceport {

    public void start(IStart iStart){
        if(!iStart.checkSystem()){
            System.out.println("Предстартовая проверка провалена");
        } else {
            iStart.startEngines();
            for (int i = 10; i >= 0 ; i--) {
                System.out.println(i);
            }
            iStart.start();
        }

    };
}
