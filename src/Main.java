import java.time.LocalDate;
public class Main {
    public static String checkingYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return year + " год ялвяется високосным";
        } else
            return year + " год не является висконсоым";
    }

    public static String appVersion(int number, int YearReal){
        int currentYear = LocalDate.now().getYear();
        String yourTelephon;
        String version;
        if (number == 0){
            yourTelephon = "IOS";
        } else {
            yourTelephon = "Android";
        }
        if (YearReal == currentYear) {
            version = "обычную версию";
        } else {
            version = "облегчённую версию";
        }
        return "Установите " + version + "версию приложиения для " + yourTelephon + " по ссылке";
    }

    public static String deliveryDistanceBank(int deiliveryDistance) {
        if (deiliveryDistance < 20) {
            return "Потребуется дней: " + 1;
        } else if (deiliveryDistance >= 20 && deiliveryDistance < 60) {
            return "Потребуется дней: " + 2;
        } else if (deiliveryDistance >= 60 && deiliveryDistance < 100) {
            return "Потребуется дней: " + 3;
        } else {
            return "Извините мы не можем вам доставить";
        }
    }

    public static void main(String[] args) {
        int year = 2021;
        System.out.println(checkingYear(year));
        int yourTelephon = 0;
        int YearReal = 2014;
        System.out.println(appVersion(yourTelephon, YearReal));
        int deiliveryDistance = 52;
        System.out.println(deliveryDistanceBank(deiliveryDistance));
        }
}









