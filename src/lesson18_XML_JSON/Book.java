package lesson18_XML_JSON;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;



@XmlType(propOrder = {"vendorCode", "title", "year", "bookList"}, name = "book")
@XmlRootElement

public class Book {
    private String vendorCode;
    private String title;
    private int year;
    List<Book> bookList;

    public Book() {
    }

    public Book(String vendorCode, String title, int year) {
        this.vendorCode = vendorCode;
        this.title = title;
        this.year = year;
        bookList = new ArrayList<>();
    }

    public Book(String vendorCode, String title, int year, List<Book> bookList) {
        this.vendorCode = vendorCode;
        this.title = title;
        this.year = year;
        this.bookList = bookList;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
