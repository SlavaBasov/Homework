package lesson18_XML_JSON.traningJSON;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringReader;

public class AppDeserelization {
    public static void main(String[] args) throws IOException {
        String jsonString = "{ \"name\":\"Murka\", \"age\":5, \"weight\":4}";
        StringReader reader = new StringReader(jsonString);

        ObjectMapper mapper = new ObjectMapper();
        Cat cat = mapper.readValue(reader, Cat.class);
        System.out.println(cat);
    }
}
