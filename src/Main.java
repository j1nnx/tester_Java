import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        // Задание 1 и 2, пример 1:
        int clientOS = 0;
        int clientDeviceYear = 2014;
        if (clientOS == 0)
            if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        // пример 2:
        int clientO = 1;
        int clientDeviceYea = 2017;
        if (clientO == 0)
            if (clientDeviceYea < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        if (clientO == 1) {
            if (clientDeviceYea < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        // Задание 3 пример 1:
        int year = 2020;
        if (year >= 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("Год должен быть больше, чем 1584");
        }
        // пример 2:
        int yearS = 2023;
        if (yearS >= 1584) {
            if ((yearS % 4 == 0 && yearS % 100 != 0) || yearS % 400 == 0) {
                System.out.println(yearS + " год является високосным");
            } else {
                System.out.println(yearS + " год не является високосным");
            }
        } else {
            System.out.println("Год должен быть больше, чем 1584");
        }
        // пример 3:
        int yearSO = 1125;
        if (yearSO >= 1584) {
            if ((yearSO % 4 == 0 && yearSO % 100 != 0) || yearSO % 400 == 0) {
                System.out.println(yearSO + " год является високосным");
            } else {
                System.out.println(yearSO + " год не является високосным");
            }
        } else {
            System.out.println("Год должен быть больше, чем 1584");
        }

        // Задание 4 пример 1
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Км до вас: " + deliveryDistance + " Потребуется дней для доставки: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Км до вас: " + deliveryDistance + " Потребуется дней для доставки: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Км до вас: " + deliveryDistance + " Потребуется дней для доставки: 3");
        } else if (deliveryDistance > 100) {
            System.out.println("Извините мы не можем вам доставить, вы находитесь слишком далеко");
        }
        // пример 2:
        int deliveryDistance1 = 15;
        if (deliveryDistance1 < 20) {
            System.out.println("Км до вас: " + deliveryDistance1 + " Потребуется дней для доставки: 1");
        } else if (deliveryDistance1 >= 20 && deliveryDistance1 < 60) {
            System.out.println("Км до вас: " + deliveryDistance1 + " Потребуется дней для доставки: 2");
        } else if (deliveryDistance1 >= 60 && deliveryDistance1 <= 100) {
            System.out.println("Км до вас: " + deliveryDistance1 + " Потребуется дней для доставки: 3");
        } else if (deliveryDistance1 > 100) {
            System.out.println("Извините мы не можем вам доставить, вы находитесь слишком далеко");
        }
        // пример 3
        int deliveryDistance2 = 40;
        if (deliveryDistance2 < 20) {
            System.out.println("Км до вас: " + deliveryDistance2 + " Потребуется дней для доставки: 1");
        } else if (deliveryDistance2 >= 20 && deliveryDistance2 < 60) {
            System.out.println("Км до вас: " + deliveryDistance2 + " Потребуется дней для доставки: 2");
        } else if (deliveryDistance2 >= 60 && deliveryDistance2 <= 100) {
            System.out.println("Км до вас: " + deliveryDistance2 + " Потребуется дней для доставки: 3");
        } else if (deliveryDistance2 > 100) {
            System.out.println("Извините мы не можем вам доставить, вы находитесь слишком далеко");
        }
        // прмиер 4
        int deliveryDistance3 = 152;
        if (deliveryDistance3 < 20) {
            System.out.println("Км до вас: " + deliveryDistance3 + " Потребуется дней для доставки: 1");
        } else if (deliveryDistance3 >= 20 && deliveryDistance3 < 60) {
            System.out.println("Км до вас: " + deliveryDistance3 + " Потребуется дней для доставки: 2");
        } else if (deliveryDistance3 >= 60 && deliveryDistance3 <= 100) {
            System.out.println("Км до вас: " + deliveryDistance3 + " Потребуется дней для доставки: 3");
        } else if (deliveryDistance3 > 100) {
            System.out.println("Извините мы не можем вам доставить, вы находитесь слишком далеко");
        }

        // Задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Не корректное значение введи ещё раз!");
        }
    }
}