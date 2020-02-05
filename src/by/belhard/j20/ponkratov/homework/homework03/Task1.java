package by.belhard.j20.ponkratov.homework.homework03;

public class Task1 {
    public static void main(String[] args) {

        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                arr[i] +=i;
                System.out.print(i + " ");
                continue;
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if ((i % 5 == 0 && i % 7 != 0) || (i % 7 == 0 && i % 5 != 0)) {
               arr[i] += i;
                System.out.print(i + " ");
                continue;
            }
        }
        System.out.println();
    }
}