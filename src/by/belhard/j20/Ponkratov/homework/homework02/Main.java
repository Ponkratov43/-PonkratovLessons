package by.belhard.j20.Ponkratov.homework.homework02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//Task 2
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter the radius: ");
        float r = sc.nextInt();
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
        } else if (deg <= 15) {
            System.out.println("Put on a windbreaker\n");
        } else if (deg < 20) {
            System.out.println("Put on a sweater\n");
        } else if (deg < 30) {
            System.out.println("Put on your shirt\n");
        } else if (deg > 30) {
            System.out.println("Don’t wear anything\n");
        }
        System.out.println("////////////////////");
//Task 4
        System.out.println("Введите зарплаты трёх человек: ");
        Scanner s1 = new Scanner(System.in);

        int salary1 = s1.nextInt();
        int salary2 = s1.nextInt();
        int salary3 = s1.nextInt();

        int max = 0, min = 0, raz = 0;
        if (salary1 > salary2 && salary1 > salary3)
            max = salary1;
        if (salary1 < salary2 && salary1 < salary3)
            min = salary1;

        if (salary2 > salary1 && salary2 > salary3)
            max = salary2;
        if (salary2 < salary1 && salary2 < salary3)
            min = salary2;

        if (salary3 > salary1 && salary3 > salary2)
            max = salary3;
        if (salary3 < salary1 && salary3 < salary2)
            min = salary3;

        raz = max - min;
        System.out.println("Минимальная: " + min + "\n" + "Максимальная: " + max + "\n" + "Средняя зарплата: " + raz);

        System.out.println("////////////////////");
//Task5
        int a = 2;
        int n = 5;
        int res = 1;
        for(int i = 1; i<=n; i++) {
            res = res * a;
            System.out.print(res + "  ");
        }
        System.out.println("\n///////////////////");

//Task 6
        float startSum = 100f;
        float proc = 10f;
        float procnalog = 1f;
        int years = 5;
        float nalog = (startSum * procnalog) / 100 * years;
        for (int i = 1; i <= years; i++) {
            startSum = (startSum / 100 * proc + startSum) - (nalog / 10);
            System.out.println("На счету будет: " + startSum + " бел р");
        }
        System.out.println();
        System.out.println("////////////////////");
    }
}
