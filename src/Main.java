import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println(getPeriodFromJavaBirthday());

//        LocalDateTime time1 = LocalDateTime.now();
//        LocalDateTime time2 = LocalDateTime.now().minusDays(10800);
//
//        System.out.println(time1);
//        System.out.println(time1.until(time2, ChronoUnit.HOURS));

//        long timeFrom1970 = System.currentTimeMillis();
//        System.out.println(timeFrom1970);

//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now.toEpochSecond(ZoneOffset.ofHours(3)));

//        LocalDateTime now = LocalDateTime.ofEpochSecond(System.currentTimeMillis()/1000,
//                0, ZoneOffset.ofHours(3));
//        System.out.println(now);

//        long start = System.currentTimeMillis();
//
//        String line = "";
//        for (int i = 0; i < 100000; i++) {
//            line += Math.random();
//        }
//        System.out.println(System.currentTimeMillis() - start);


//        LocalDate today = LocalDate.now();
//        System.out.println(today);
//
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);
//
//        LocalDate birthday = LocalDate.of(1986, 12, 18);
//        System.out.println(birthday.plusYears(18));
//
//        LocalDateTime nowNY = LocalDateTime.now(ZoneId.of("America/New_York"));
//        System.out.println(nowNY);
//
////        String date = "13/03/2023";
////        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
////        LocalDate localDate = LocalDate.parse (date, formatter);
////        System.out.println(localDate);
//
//
////        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
//        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
//        LocalDateTime now2 = LocalDateTime.now();
//        System.out.println(formatter.format(now2));
//
//        LocalDateTime time1 = LocalDateTime.now();
//        LocalDateTime time2 = LocalDateTime.now().minusDays(2);
//        if (time1.isAfter(time2)) {
//            System.out.println("time1 is after time2");
//        }
//        System.out.println(time1);
//
//        System.out.println(time1.until(time2, ChronoUnit.HOURS));

//        int number = 987654321;
//        float value = number;
//        System.out.println(value);

//        long now = System.currentTimeMillis();
//        int seconds = (int) (now / 1000);
//        System.out.println(seconds);

//        double param = 0.75;
//        int value = (int) param;
//        System.out.println(value);


        RemoteControl control = new RemoteControl();
        int temp = control.getTemperature();

        AirConditioner conditioner = new AirConditioner();
        conditioner.setTemperature(temp);


//        UsageAnalytics analytics = new UsageAnalytics();
////        analytics.countVisit();
////        analytics.countVisit();
//        int visits = analytics.countVisit();
//        System.out.println("Всего посещений: " + visits);


//        MoneyCalculator money = new MoneyCalculator();
//
//        money.calculateCassetteCount(1999);
//        System.out.println(money);
//
//        money.calculateCassetteCount(2000);
//        System.out.println(money);
//
//        money.calculateCassetteCount(2001);
//        System.out.println(money);
//
//        money.calculateCassetteCount(2500);
//        System.out.println(money);
//
//        money.calculateCassetteCount(4000);
//        System.out.println(money);
//
//        money.calculateCassetteCount(4001);
//        System.out.println(money);
    }

    public static String getPeriodFromJavaBirthday () {
        LocalDate birthday = LocalDate.of(1995, 5, 23);
        Period period = birthday.until(LocalDate.now());
        return period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days";
    }
}