package lesson14;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class LocalDateTimeTesting {
    public static void main(String[] args) {
        //LocalDate
        LocalDate newYear2001 = LocalDate.of(2001, 1, 1);
        LocalDate newYear2002 = LocalDate.of(2002, 12, 1);
        System.out.println(newYear2001.equals(newYear2002));
        System.out.println(newYear2001.isAfter(newYear2002));
        System.out.println(newYear2001.isBefore(newYear2002));
        System.out.println(newYear2001.get(ChronoField.DAY_OF_MONTH) + " " + newYear2001.getMonth() + " " + newYear2001.getYear());
        System.out.println(newYear2001.getDayOfYear());
        System.out.println(newYear2002.getDayOfYear());
        LocalDate today = LocalDate.now();
        System.out.println(today.getDayOfYear() + " " + today.getYear() + " " + today.getMonth() + " " + today.lengthOfMonth() + " " +
                today.getDayOfWeek() + " " + today.plusMonths(2) + " " + today.toString());
        System.out.println(today.minusDays(2));

        System.out.println("------------------------------------------");
        //LocalTime

        LocalTime time = LocalTime.now();
        System.out.println(time);
        time = LocalTime.of(5, 12, 43);
        System.out.println(time);
        time = LocalTime.of(17, 45);
        System.out.println(time);
        LocalTime time2 = LocalTime.of(17, 23, 44);
        boolean a = time.isAfter(time2);
        System.out.println(a);
        a = time.isBefore(time2);
        System.out.println(a);
        a = time.equals(time2);
        System.out.println(a);
        System.out.println(time2.get(ChronoField.HOUR_OF_DAY) + " " + time2.get(ChronoField.MINUTE_OF_HOUR) + " " + time2.get(ChronoField.SECOND_OF_MINUTE));
        try {
            time = LocalTime.of(5, 23, 62);
            System.out.println(time);
        } catch (DateTimeException e){
            System.out.println(e.getMessage());
            time  = time.with(ChronoField.SECOND_OF_MINUTE, 52);
            System.out.println(time);
        }
        System.out.println("------------------------------------------");
        //LocalDateTime

        LocalDateTime dateTime = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(dateTime);
        dateTime = LocalDateTime.now(ZoneId.of("Europe/Minsk"));
        System.out.println(dateTime);
        /*for(int i = 0; i < 100; i++){
            System.out.println(dateTime);
        }*/
        LocalDateTime dateTime1 = LocalDateTime.MAX;
        System.out.println(dateTime1);
        dateTime1 = LocalDateTime.MIN;
        System.out.println(dateTime1);
        dateTime = LocalDateTime.of(1996, 2, 7, 9, 0);
        System.out.println(dateTime);

        System.out.println("------------------------------------------");
        //Instant
        Instant now = Instant.now();
        System.out.println(now);
        Instant instant = now.with(ChronoField.NANO_OF_SECOND, 45);
        System.out.println(instant);
        Instant fiveSecondAfterEpoch = Instant.ofEpochSecond(5);
        System.out.println(fiveSecondAfterEpoch);
        long seconds = now.getEpochSecond();
        System.out.println(seconds);

        System.out.println("------------------------------------------");
        //Period
        Period period = Period.between(newYear2001, newYear2002);
        System.out.println(period.getMonths());
        Period period2y = Period.ofYears(5);

        //Duration

        Duration duration = Duration.of(5, ChronoUnit.SECONDS);
        System.out.println(duration.getSeconds());

        //Formatter
        System.out.println("------------------------------------------");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("");



    }
}
