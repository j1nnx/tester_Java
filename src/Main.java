public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        var first = 78.2;
        var second = 82.7;
        var sums = first + second;
        System.out.println(sums);
        var overload = second - first;
        System.out.println(overload);

        System.out.println(second % first);

        var hours = 640;
        var workondays = 8;
        var workers = (hours / workondays);
        System.out.println("Всего работников в компании — " + workers + " человек");

        var sotrudincs = hours / (workers + 94);
        System.out.println("Если в компании работает " + (workers + 94) + " человек, то всего " + sotrudincs +
                                                    " часов работы может быть поделено между сотрудниками");
    }
}