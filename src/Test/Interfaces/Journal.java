package Test.Interfaces;

public class Journal implements Printable{
    private String title;
    private String format;

    public Journal() {
    }

    public Journal(String title, String format) {
        this.title = title;
        this.format = format;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "title='" + title + '\'' +
                ", format='" + format + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println(toString());
    }
}
