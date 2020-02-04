package by.belhard.j20.ponkratov.homework.homework03;

public class Task1 {
    public static void main(String[] args) {

        int[] mass = new int[101];
        for (int i = 0; i < mass.length; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                mass[i] += i;
                System.out.print(i + " ");
                continue;
            }
        }
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            if ((i % 5 == 0 && i % 7 != 0) || (i % 7 == 0 && i % 5 != 0)) {
                mass[i] += i;
                System.out.print(i + " ");
                continue;
            }
        }
        System.out.println();

        byte[][] arrayBytes = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(arrayBytes[1][1]);
    }
}