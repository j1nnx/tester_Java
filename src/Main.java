import java.time.LocalDate;

public class Main {
    public static String leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return year + " год является вискосным";
        } else {
            return year + " год не является вискосным";
        }
    }

    public static String getRecommended(int clientOs, int yearOs){
        String recomend = "";
        if (yearOs <= 2015){
            if (clientOs == 1){
                recomend = "Установите обелгчённую верисю приложения для Android по ссылке";
            } else if (clientOs == 0){
                recomend = "Установите обелгчённую верисю приложения для ios по ссылке";
            }
        } else {
            if (clientOs == 1){
                recomend = "Установите версию приложения для Android по ссылке";
            } else if (clientOs == 0) {
                recomend = "Установите версию приложения для ios по ссылке";
            }
        }
        return recomend;
    }
    public static String getDaysDelivery(int delivery){
        if (delivery <= 20){
            return "Потребуется дней: " + 1;
        } else if (delivery <= 60){
            return "Потребуется дней: " + 2;
        } else if (delivery <= 100){
            return "Потребуется дней: " + 3;
        } else {
            return "Доставка недоступна";
        }
    }

    public static void main(String[] args) {
        // Задание 1
        int year = 2021;
        System.out.println(leapYear(year));

        System.out.println(" ");
        //Задание 2
        int clientOs = 1;
        int yearOs = LocalDate.now().getYear();
        System.out.println(getRecommended(clientOs, yearOs));

        System.out.println(" ");
        // Задание 3
        int delivery = 73;
        System.out.println(getDaysDelivery(delivery));
    }
}