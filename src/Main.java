public class Main {
    public static void main(String[] args) {
        // Задание 1
        int desire = 2_459_000;
        int total = 0;
        int amount = 15000;
        double percent = 1D / 100;
        int month = 0;
        while (total < desire) {
            total += amount;
            total = (int) (total * (1 + percent));
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей.");
        }

        // Задание 2
        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number = number + 1;
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();


        // Задание 3
        int population = 12_000_000;
        for (byte i = 1; i < 11; i++) {
            int birth = population / 1000 * 17;
            int death = population / 1000 * 8;
            population = population + birth - death;
            System.out.println("Год " + i + " численность населения составляет " + population);
        }

        // Задание 4
        int startCapital = 15000;
        for (int i = 1; startCapital < 12_000_000; i++) {
            startCapital = startCapital + (startCapital / 100 * 7);
            System.out.println("Месяц " + i + ", сумма накоплений " + startCapital);
        }

        // Задание 5
        int startCapital1 = 15000;
        for (int i = 1; startCapital1 < 12_000_000; i++) {
            startCapital1 = startCapital1 + (startCapital1 / 100 * 7);
            if (i % 6 == 0)
                System.out.println("Месяц " + i + ", сумма накоплений " + startCapital1);
        }

        // Задание 6
        int startCapital2 = 15000;
        for (byte month1 = 0; month1 <= 9 * 12; month1++) {
            startCapital2 = startCapital2 + (startCapital2 / 100 * 7);
            if (month1 % 6 == 0 && month1 > 0) {
                System.out.println("Сумма накоплений " + startCapital2);
            }
        }

        // Задание 7
        int Friday = 5;
        for (int currentDay = Friday; currentDay <= 31; currentDay+=7) {
            System.out.println("Сегодня пятница " + currentDay + "-е число. Необходимо подготовить отчет!");
        }

        // Задание 8
        int period = 79;
        int startS = 0;
        int currentYear = 2024;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = startS; year < end; year += period) {
            if (year > start) {
                System.out.println(year);
            }
        }



            }
        }




