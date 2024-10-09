import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] array = {50, 100, 150, 450, 7000};
        int total = 0;
        for (int value : array) {
            total += value;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей.");
        System.out.println();
        System.out.println("Задание 2");
        int minWeight = 100;
        int maxWeight = 0;
        for (int k : array) {
            if (k < minWeight) {
                minWeight = k;
            }
            if (k > maxWeight) {
                maxWeight = k;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minWeight);
        ;
        System.out.println("Максимальная сумма трат за неделю составила " + maxWeight);
        System.out.println();
        System.out.println("Задание 3");
        int[] week = {50, 100, 150, 450, 7000};
        int totalW = 0;
        for (int j : week) {
            totalW += j;
        }
        float avg = totalW / 5f;
        System.out.println("Средняя сумма трат за месяц составила " + avg + " рублей");
        System.out.println();
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }



}








