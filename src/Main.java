public class Main {
    public static void main(String[] args) {
        int age = 19;
        int age2 = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то, он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " то,  он не достиг совершеннолетия, " + "нужно немного подождать.");
        }
        if (age2 >= 18) {
            System.out.println("Если возраст человека равен " + age2 + " то, он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age2 + " то, он не достиг совершеннолетия, " + "нужно немного подождать.");
        }

        int weather = 6;
        int weather1 = 4;
        if (weather <= 5) {
            System.out.println("На улице " + weather + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + weather + " градусов, можно идти без шапки");
        }
        if (weather1 <= 5) {
            System.out.println("На улице " + weather1 + " градуса, нужно надеть шапку");
        } else {
            System.out.println("На улице " + weather1 + " градуса, можно идти без шапки");
        }

        int speed = 75;
        int speed1 = 55;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " км/ч, придется заплатить штраф");
        } else {
            System.out.println("Скорость не превышена ты красавчик");
        }
        if (speed1 <= 60) {
            System.out.println("Если скорость " + speed1 + " км/ч, можно ездить спокойно");
        } else {
            System.out.println("Ты привысил скорость придётся заплатить штраф");
        }

        int kid = 5;
        int child = 9;
        int schoolBoy = 21;
        int worker = 37;
        if (kid <= 6 && kid >= 2) {
            System.out.println("Если возраст человека равен " + kid + ", то ему нужно ходить в детский сад");
        } else {
            System.out.println("Ты ходишь в школу!");
        }
        if (child >= 7 && child <= 17) {
            System.out.println("Если возраст человека равен " + child + ", то ему нужно ходить в школу.");
        } else {
            System.out.println("Ты не ходишь в школу!");
        }
        if (schoolBoy >= 18 && schoolBoy <= 24) {
            System.out.println("Если возраст человека равен " + schoolBoy + ", то ему нужно ходить в университет.");
        } else {
            System.out.println("Ты не ходишь в университет!");
        }
        if (worker > 24) {
            System.out.println("Если возраст человека равен " + worker + ", то ему нужно ходить на работу.");
        } else {
            System.out.println("Ты не достиг возраста, чтобы работать!");
        }

        int childAtraction = 4;
        int schollBoyAtraction = 9;
        int bigestMan = 19;
        if (childAtraction < 5) {
            System.out.println("Если возраст ребенка равен " + childAtraction + ", то ему нельзя кататься на аттракционе");
        } else {
            System.out.println("Можно кататься");
        }
        if (schollBoyAtraction >= 5 && schollBoyAtraction < 14) {
            System.out.println("Если возраст ребенка равен " + schollBoyAtraction + ", то ему можно кататься на аттракционе в сопровождении родителей");
        } else {
            System.out.println("Тебе нельзя кататься!");
        }
        if (bigestMan >= 14) {
            System.out.println("Если возраст ребенка равен " + bigestMan + ", то ему можно кататься без сопровождения взрослого");
        } else {
            System.out.println("Тебе нельзя кататься!");
        }

        int passenge = 90;
        int vagon = 60;
        int train = 102;
        if (passenge <= train) {
            if (passenge <= vagon) {
                System.out.println("В вагоне есть место, сидячее");
            } else {
                System.out.println("В вагоне есть место, стоячее");
            }
        } else {
            System.out.println("Вагон уже полностью заполнен");
        }


        int one = 59;
        int two = 83;
        int three = 19;
        if (one > two && one > three) {
            System.out.println("Самое большое число: " + one);
        } else if (two > one && two > three) {
            System.out.println("Самое большое число: " + two);
        } else {
            System.out.println("Самое большое число: " + three);
        }
    }

}