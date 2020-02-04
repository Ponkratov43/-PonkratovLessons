package by.belhard.j20.ponkratov.homework.homework02;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//Task 2
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter the radius: ");
        double r = sc.nextInt();
        if (r > 0) {
            double area = 3.1415f + (r * r);
            double c = (3.1415f * 2) * r;
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
        } else if (deg <= 20) {
            System.out.println("Put on a sweater\n");
        } else if (deg <= 30) {
            System.out.println("Put on your shirt\n");
        } else if (deg > 30) {
            System.out.println("Don’t wear anything\n");
        }
        System.out.println("////////////////////");
//Task 4
        System.out.println("Введите зарплаты трёх человек: ");
        Scanner s1 = new Scanner(System.in);

        BigInteger salary1 = s1.nextBigInteger();
        BigInteger salary2 = s1.nextBigInteger();
        BigInteger salary3 = s1.nextBigInteger();

        BigInteger maxNum, minNum;

        maxNum = salary1.max(salary2.max(salary3));
        minNum = salary1.min(salary2.max(salary3));


        System.out.println("Минимальная: " + minNum + "\n" + "Максимальная: "
                + maxNum + "\n" + "Средняя зарплата: " + (maxNum.subtract(minNum)));

        System.out.println("////////////////////");

        int sal1 = 100, sal2 = 200, sal3 = 300;
        int max = Math.max(Math.max(sal1, sal2), sal3);
        int min = Math.min(Math.min(sal1, sal2), sal3);
        System.out.println("Difference: " + (max - min));

//Task5
        int a = 2;
        int n = 5;
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * a;
            System.out.print(res + "  ");
        }
        System.out.println("\n///////////////////");

//Task 6
        System.out.println("Введите сумму: ");
        double startSum = s1.nextDouble();
        System.out.println("Введите процент: ");
        double proc = s1.nextDouble();
        System.out.println("Процент налога банка: ");
        double procnalog = s1.nextDouble();
        System.out.println("На сколько лет? ");
        int years = s1.nextInt();
        double nalog = (startSum * procnalog) / 100 * years;
        for (int i = 1; i <= years; i++) {
            startSum = (startSum / 100 * proc + startSum) - (nalog / 10);
            System.out.println("На счету будет: " + startSum + " бел р");
        }
        System.out.println();
        System.out.println("////////////////////");
    }
}
