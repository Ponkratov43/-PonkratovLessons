package by.belhard.j20.Ponkratov.Lessons.lesson02;

public class Main {

    public static void main(String[] args) {

        float f = 2.0f;
        int a = 1;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(f + a);

        if (a == 5) {
            System.out.println("true");
        } else if (a == 4) {
            System.out.println("false");
        } else {
            System.out.println(a);
        }
        int b = a == 5 ? -1 : 1;
        System.out.println(b);
        System.out.println();

        int wh = 1;
        while (wh <= 5) {
            System.out.print(wh);
            wh++;
        }
        System.out.println();
        int t = 5;
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
            t = i;
        }
        System.out.println("\n" + t);
        for (int i = 1; i < 999; i++) {
            System.out.print(i);
            if (i == 2) break;
        }
    }
}
