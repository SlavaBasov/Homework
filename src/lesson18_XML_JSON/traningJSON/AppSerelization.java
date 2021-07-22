package lesson18_XML_JSON.traningJSON;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringWriter;

public class AppSerelization {
    public static void main(String[] args) throws IOException {
        Cat cat = new Cat();
        cat.setName("Murka");
        cat.setAge(5);
        cat.setWeight(4);


        StringWriter writer = new StringWriter();

        ObjectMapper mapper = new ObjectMapper();

        mapper.writeValue(writer, cat);

        String result = writer.toString();
        System.out.println(result);


        Cat2 cat2 = new Cat2();
        cat2.name = "Markiz";
        cat2.age = 4;
        cat2.weight = 3;
        StringWriter writer2 = new StringWriter();

        ObjectMapper mapper2 = new ObjectMapper();

        mapper2.writeValue(writer2, cat2);

        result = writer2.toString();
        System.out.println(result);

    }
}
