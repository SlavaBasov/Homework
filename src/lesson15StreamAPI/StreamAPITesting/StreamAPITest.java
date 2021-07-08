package lesson15StreamAPI.StreamAPITesting;

import lesson13_CollectionsPractice.store1.Product;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPITest {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Paris", "London", "Minsk");
        Stream<String> citiesStream = cities.stream();
        citiesStream.filter(i-> i.length()>5)
                .forEach(System.out::println);

        Stream<Integer> numbersStream = Arrays.stream(new Integer[]{1, -1, 2, 4, 0, -5});
        IntStream numbersStream2 = IntStream.of(6, 2, 4, 6,-1, -5);
        DoubleStream doubleStream = DoubleStream.of(2.5, 4.3, 0.4);

        long num = numbersStream.filter(i-> i>0).count();
        System.out.println(num);

        System.out.print("Уникальные значения: ");
        numbersStream2.distinct().forEach(i -> System.out.print(i + " "));
        System.out.println();

        Stream<String> words = Stream.of("London", "Moscow");

        Stream<Phone> phoneStream = Stream.of(new Phone("Iphone", 1200), new Phone("Xiaomi", 500),
                new Phone("Samsung", 1000));
        //map
        phoneStream.map(i -> "Model: " + i.getName() + "    Price: " + i.getPrice())
                .forEach(System.out::println);

        //flatmap
        phoneStream = Stream.of(new Phone("Iphone", 1200), new Phone("Xiaomi", 500),
                new Phone("Samsung", 1000));
        phoneStream.flatMap(i -> Stream.of(
                String.format("название: %s  цена без скидки: %d", i.getName(), i.getPrice()),
                String.format("название: %s  цена со скидкой: %d", i.getName(), (int) (i.getPrice() - 0.1 * i.getPrice()))))
                .forEach(System.out::println);

        //сортировка
        List<Phone> phones = new ArrayList<Phone>();
        Collections.addAll(phones, new Phone("Iphone", 1200), new Phone("Xiaomi", 500),
                new Phone("Samsung", 1000));

        Stream<Phone> phonesStream = phones.stream();
        phonesStream.sorted(new PhoneComparator())
                .forEach(i-> System.out.println(i.getName()));


        //grooping
        Stream<Phone> phoneStream1 = Stream.of(new Phone("iPhone X", "Apple", 600),
                new Phone("Pixel 2", "Google", 500),
                new Phone("iPhone 8", "Apple",450),
                new Phone("Galaxy S9", "Samsung", 440),
                new Phone("Galaxy S8", "Samsung", 340));

        Map<String, List<Phone>> phoneByCompany = phoneStream1.collect(
                Collectors.groupingBy(Phone::getCompany));

        for(Map.Entry<String, List<Phone>> p: phoneByCompany.entrySet()){

        }


        phoneStream.close();
    }
}

class PhoneComparator implements Comparator<Phone> {
    @Override
    public int compare(Phone o1, Phone o2) {
        return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
    }
}
