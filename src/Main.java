public class Main {
    public static void main(String[] args) {
        byte bytee1 = 125;
        short shortee = 129;
        int inte = 49175;
        long longe = 195000L;
        float floate = 2.35f;
        double doublee = 2.5445455;

        System.out.println("Значение переменной " + "byte" + " с типом " + "Целочисленные " + "равно " + bytee1);
        System.out.println("Значение переменной " + "short" + " с типом " + "Целочисленные " + "равно " + shortee);
        System.out.println("Значение переменной " + "int" + " с типом " + "Целочисленные " + "равно " + inte);
        System.out.println("Значение переменной " + "long" + " с типом " + "Целочисленные " + "равно " + longe);
        System.out.println("Значение переменной " + "float" + " с типом " + "С плавающей точокй " + "равно " + floate);
        System.out.println("Значение переменной " + "doublee" + " с типом " + "Целочисленные " + "равно " + doublee);
        float num1 = 27.12f;
        long num2 = 987675549L;
        double num3 = 2.786;
        short num4 = 569;
        short num5 = -159;
        short num6 = 27897;
        byte num7 = 67;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);

        int ludmelaPavlovna = 23;
        int annaSergeevna = 27;
        int ecaterinaAndreevna = 30;
        int paper = 480;
        int total = paper / (ludmelaPavlovna + annaSergeevna + ecaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + total + " листов бумаги");

        int bootleMinute = 16 / 2;
        int minute20 = 20 * bootleMinute;
        int day = (24 * 60) * bootleMinute;
        int day3 = (3 * 24 * 60) * bootleMinute;
        int month = (30 * 24 * 60) * bootleMinute;
        System.out.println("За 20 минут машина произвела " + minute20 + " штук бутылок.");
        System.out.println("За 1 день машина произвела " + day + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + day3 + " штук бутылок.");
        System.out.println("За 1 месяц машина произвела " + month + " штук бутылок.");

        int allColor = 120;
        int white = 2;
        int brown = 4;
        int schollClass = allColor / (white + brown);
        int whilteColor = 20 * white;
        int brownColor = 20 * brown;
        System.out.println("В школе, где " + schollClass + " классов, нужно " + whilteColor + " банок белой краски и "
                + brownColor + " банок коричневой краски");

        int bananas = 5;
        int milk = 200;
        int iceCream = 2;
        int eggs = 4;
        int totalBreakfast = (bananas * 80) + (milk / 100 * 105) + (iceCream * 100) + (eggs * 70);
        System.out.println(totalBreakfast + " г. " + (totalBreakfast / 1000) + " кг.");

        int totalWeight = 7 * 1000;
        int daysWeight250 = totalWeight / 250;
        int daysWeight500 = totalWeight / 500;
        int totalAvg = (daysWeight250 + daysWeight500) / 2;
        System.out.println("По 250 г в день: " + daysWeight250 + " дней.");
        System.out.println("По 500 г в день: " + daysWeight500 + " дней.");
        System.out.println("Среднее количество дней: " + totalAvg + " день.");

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kritinaSalary = 76230;
        int mashaCount = mashaSalary / 100 * 10;
        int denisCount = denisSalary / 100 * 10;
        int kristinaCount = kritinaSalary / 100 * 10;
        System.out.println("Маша теперь получает " + (mashaSalary + mashaCount) + " рублей. Годовой доход вырос на "
                + (mashaCount * 12) + " рублей.");
        System.out.println("Денис теперь получает " + (denisSalary + denisCount) + " рублей. Годовой доход вырос на "
                + (denisCount * 12) + " рублей.");
        System.out.println("Кристина теперь получает " + (kritinaSalary + kristinaCount) + " рублей. Годовой доход вырос на "
                + (kristinaCount * 12) + " рублей.");
    }
}