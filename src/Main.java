import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;

        float[] floatWeight = {1.57f, 7.654f, 9.986f};

        int[] month = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        // Задание 2
        for (int i = 0; i <= weight.length - 1; i++) {
            if (i != weight.length - 1) {
                System.out.printf(weight[i] + ", ");
            } else {
                System.out.println(weight[i]);
            }
        }

        for (int i = 0; i <= floatWeight.length - 1; i++) {
            if (i != floatWeight.length - 1) {
                System.out.printf(floatWeight[i] + ", ");
            } else {
                System.out.println(floatWeight[i]);
            }
        }
        for (int i = 0; i <= month.length - 1; i++) {
            if (i != month.length - 1) {
                System.out.printf(month[i] + ", ");
            } else {
                System.out.println(month[i]);
            }
        }

        // Задание 3
        for (int i = weight.length - 1; 0 <= i; i--) {
            if (i != 0) {
                System.out.printf(weight[i] + ", ");
            } else {
                System.out.println(weight[i]);
            }
        }
        for (int j = floatWeight.length - 1; 0 <= j; j--) {
            if (j != 0) {
                System.out.printf(floatWeight[j] + ", ");
            } else {
                System.out.println(floatWeight[j]);
            }
        }
        for (int i = month.length - 1; 0 <= i; i--) {
            if (i != 0) {
                System.out.printf(month[i] + ", ");
            } else {
                System.out.println(month[i]);
            }
        }

        // Задание 4
        for (int i = 0; i <= weight.length - 1; i++) {
            if (weight[i] % 2 != 0) {
                weight[i] += 1;
            }
        }
        //результат преобразования
        System.out.println(Arrays.toString(weight));


    }
}








