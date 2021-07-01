package lesson13_CollectionsPractice.store1.Utilits;

public enum Type {
    Bestseller(10),
    Regular(0),
    Special(5);

    private int value;

    Type(int i) {
       value = i;
    }

    public int getNum() {
        return value;
    }


}
