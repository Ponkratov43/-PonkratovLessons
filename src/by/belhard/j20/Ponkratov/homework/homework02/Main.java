package by.belhard.j20.Ponkratov.homework.homework02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//Task 2
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter the radius: ");
        int r = sc.nextInt();
        if (r > 0) {
            float area = 3.1415f + (r * r);
            float c = (3.1415f * 2) * r;
            System.out.println("Radius= " + r + "\n" + "Area= " + area + "\n" + "Circumference= " + c + "\n");

        } else
            System.out.println("Error. Radius less than zero. Please, try again.");
        System.out.println("////////////////////");

//Task 3
        System.out.println("How many degrees outside ?");
        Scanner sc1 = new Scanner(System.in);
        int deg = sc1.nextInt();
        if (deg < 10) {
            System.out.println("Put on a jacket\n");
        } else if (deg <= 10 || deg <= 15) {
            System.out.println("Put on a windbreaker\n");
        } else if (deg == 16 || deg < 20) {
            System.out.println("Put on a sweater\n");
        } else if (deg == 21 || deg < 30) {
            System.out.println("Put on your shirt\n");
        } else if (deg > 30) {
            System.out.println("Don’t wear anything\n");
        }
        System.out.println("////////////////////");
//Task 4
        int salary1 = 400;
        int salary2 = 200;
        int salary3 = 300;
        int max = 0, min = 0, raz = 0;
        if (salary1 > salary2 && salary1 > salary3)
            max = salary1;
        if (salary1 < salary2 && salary1 < salary3)
            min = salary1;

        if (salary2 > salary1 && salary2 > salary3)
            max = salary2;
        if (salary2 < salary1 && salary2 < salary3)
            min = salary2;

        if (salary3 > salary1 && salary3 > salary1)
            max = salary3;
        if (salary3 < salary1 && salary3 < salary1)
            min = salary3;

        raz = max - min;
        System.out.println(raz + "\n");
        System.out.println("////////////////////");
//Task5
        int a = 2;
        int n = 3;

        if (n < 0)
            System.out.println("Error.\n");
        for (int i = 1; i <= n; i++) {
            a *= n - 1;
            System.out.println(a);
        }
        System.out.println();
        System.out.println("////////////////////");

//Task 6
        float startSum = 100f;
        float proc = 10f;
        float procnalog = 1f;
        int years = 5;
        float nalog = (startSum * procnalog) / 100 * years;
        System.out.println(nalog / 10 + " - Это налог, который банк забирает ежегодно");
        System.out.println(nalog + " - Это налог, который банк заберёт за " + years + " лет");
        for (int i = 1; i <= years; i++) {
            startSum = startSum / 100 * proc + startSum;
            System.out.println(startSum + " бел р");
        }
        System.out.println();
        System.out.println("////////////////////");
    }
}
