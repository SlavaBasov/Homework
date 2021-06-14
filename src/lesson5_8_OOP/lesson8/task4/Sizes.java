package lesson5_8_OOP.lesson8.task4;

public enum Sizes {
    XXS(32){
        @Override
        public void getDescription(){
            System.out.println("Детский размер");
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    private int euroSize;

    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public void getDescription(){
        System.out.println("Взрослый размер");
    }

}
