package lesson18_XML_JSON;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws JAXBException, IOException {

        Book book1 = new Book("546546", "Властелин колец", 1997);
        Book book2 = new Book("899459", "Ведьмак", 1987);
        Book book3 = new Book("665133", "Гарри поттер", 1996);
        Book book4 = new Book("546546", "Битва престолов", 1998);
        book1.bookList.addAll(List.of(book2,book3,book4));
        book2.bookList.addAll(List.of(book1,book3,book4));
        book3.bookList.addAll(List.of(book1,book2,book4));
        book4.bookList.addAll(List.of(book1,book2,book3));

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        /*StringWriter writer = new StringWriter();

        JAXBContext context = JAXBContext.newInstance(Book.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        marshaller.marshal(book1, writer);

        String result = writer.toString();
        System.out.println(result);*/

        //JSON================================================
        StringWriter writer1 = new StringWriter();
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(writer1, book1);
        String bookJSON = writer1.toString();
        System.out.println(bookJSON);

    }
}
