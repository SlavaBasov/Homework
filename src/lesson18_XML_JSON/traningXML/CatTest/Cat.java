package lesson18_XML_JSON.traningXML.CatTest;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "cat")
@XmlRootElement
class Cat
{
    public String name;
    public int age;
    public int weight;

    Cat()
    {
    }
}