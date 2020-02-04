package by.belhard.j20.ponkratov.homework.homework03;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 8, 15, 21, 4, 25, 1, 7};
        System.out.println("До сортировки");
        System.out.println(Arrays.toString(arr));
        System.out.println();

        double sum = Arrays.stream(arr).sum();
        double average = sum / arr.length;
        Arrays.sort(arr);

        System.out.println("После сортировки");
        System.out.println(Arrays.toString(arr));
        System.out.println();

        double mediana = 0;
        if (arr.length % 2 == 0) {
            mediana = (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2.0;
        } else {
            mediana = arr[arr.length / 2];
        }

        System.out.println("Сумма : " + sum + "|| Среднее: " + average + "|| Медиана: " + mediana);
    }
}
