package by.belhard.j20.ponkratov.homework.homework03;

public class Task3 {

    public static void main(String[] args) {

        set(4, 5);

    }

    static void set(int n, int intStart) {

        final int[][] arr = new int[n][];
        for (int row = 0; row < n; row++) {
            int count = row + 1;
            arr[row] = new int[count];
        }

        int valueSet = intStart;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row ; col++) {
                arr[row][col] = valueSet;
                valueSet *= 2;
            }
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                int valuePrint = arr[row][col];
                System.out.print(String.format("%1d ", valuePrint));
            }
            System.out.println();

        }

    }
}

