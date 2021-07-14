package lesson16;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        Job programmer = new Job("Programmer", 1000);
        Job teacher = new Job("Teacher", 500);
        Job doctor = new Job("Doctor", 800);
        Job driver = new Job("Driver", 600);


        Employee employee1 = new Employee("Vasiliy", 40, new HashSet<Job>(Arrays.asList(driver)));
        Employee employee2 = new Employee("Maria", 23, new HashSet<Job>(Arrays.asList(doctor, teacher)));
        Employee employee3 = new Employee("Antonina", 20, new HashSet<Job>(Arrays.asList(driver)));
        Employee employee4 = new Employee("Dmitry", 32, new HashSet<Job>(Arrays.asList(programmer)));
        Employee employee5 = new Employee("Viacheslav", 23, new HashSet<Job>(Arrays.asList(programmer, teacher)));
        Employee employee6 = new Employee("Victor", 32, new HashSet<Job>(Arrays.asList(programmer, teacher)));
        Employee employee7 = new Employee("Nicolay", 43, new HashSet<Job>(Arrays.asList(doctor,driver)));
        Employee employee8 = new Employee("Dmitry", 33, new HashSet<Job>(Arrays.asList(programmer, doctor, teacher)));
        Employee employee9 = new Employee("Veronica", 33, new HashSet<Job>(Arrays.asList(doctor, teacher)));
        Employee employee10 = new Employee("Sam", 43, Set.of(teacher));

       /* System.out.println("Эксперемент-----------------");
        List<Integer> im =  employee2.getJob().stream().map(Job::getSalary).collect(Collectors.toList());
        ArrayList<Integer> in = (ArrayList<Integer>) im;
        Iterator<Integer> iterator = in.iterator();
        int num = 0;
        while (iterator.hasNext()){
            num = iterator.next();
            System.out.println(num);
        }


        System.out.println("Эксперемент-----------------");*/


        List<Employee> employeeList = List.of(employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8, employee9, employee10);
/*
        //Map<Set<Job>, List<Employee>> list = employeeList.stream().collect(Collectors.groupingBy(Employee::getJob));
        Map<Object, List<Employee>> list2 = employeeList.stream().collect(Collectors.groupingBy(i->i.getJob().stream().map(Job::getSalary)));

        //  list2.entrySet().stream().sorted(Comparator.comparing()).forEach(System.out::println);
        System.out.println("Эксперемент2-----------------");*/


        //посчитать работников возрастом больше 30
        long numberOver30 = employeeList.stream().filter(i-> i.getAge()>30).count();
        System.out.println("Over 30: " + numberOver30);

        //вывести на экран всех сотрудников у кого в имени содержится "V" и "T"
        System.out.println("2===========================");

        employeeList.stream().filter(i->{
            return i.getName().toUpperCase().contains("T") && i.getName().toUpperCase().contains("V");
        }).forEach(System.out::println);

        //вывести только уникальные имена и отсортировать их по имени
        System.out.println("Уникальные имена");
        employeeList.stream()
                .map(Employee::getName)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        //вывести только уникальный возраст и отсортировать его
        System.out.println("Уникальный возраст");
        employeeList.stream()
                .map(Employee::getAge)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        //вывести сотрудников у кого больше 1 работы
        System.out.println("Сотрудники у которых больше двух работ:");
        List<Employee> employees = employeeList.stream()
                .filter(i-> i.getJob().size() >= 2)
                .collect(Collectors.toList());

        employees.forEach(System.out::println);

        //отсортировать по имени и вывести сотрудников
        System.out.println("\nОтсортированные по имени сотрудники");
        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);

        //отсортировать по количеству работ и вывести сотрудников
        System.out.println("\nОтсортированные по количеству работ сотрудники");
        employeeList.stream()
                .sorted(Comparator.comparing(x-> x.getJob().size()))
                .forEach(System.out::println);

        //вывести статистику по зарплате (ср, макс, мин, общая сумма)
        System.out.println("\nСтатистика по зарплате----------------");
        System.out.println("Минимальная зарплата: ");
        IntSummaryStatistics statistics = employeeList.stream()
                .map(Employee::getJob)
                .flatMap(Collection::stream)
                .mapToInt(Job::getSalary)
                .summaryStatistics();

        System.out.printf("Statistic max average: \n" +
                "max: %d\n" +
                "min: %d\n" +
                "middle: %f\n" +
                "summary: %d\n", statistics.getMax(), statistics.getMin(), statistics.getAverage(), statistics.getSum());


        //сгруппировать по названию работы
        Map<Object, List<Employee>> map = employeeList.stream()
                .collect(Collectors.groupingBy(employee -> employee.getJob().stream().map(Job::getName), Collectors.toList()));

        for(Map.Entry<Object, List<Employee>> e: map.entrySet()){
            System.out.println(e.getKey().toString());
            for (Employee l: e.getValue()){
                System.out.printf("Employee: %s, age- %d\n", l.getName(), l.getAge());
            }
        }


//ПРОРЕШАТЬ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //посчитать зп всех сотрудников
       // Map<String, Integer> statistics1 = employeeList.stream()
       //         .collect(Collectors.toMap(, Collectors.summingInt(i->i.)



      //  Map<String, List<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getJob));
      //  Map<String> =employeeList.stream().collect(Collectors.groupingBy(Employee::getJob))
        //посчитать зп по каждой работе(мапа ключ - название работы, значение IntsummaryStatistic)

    }
}
