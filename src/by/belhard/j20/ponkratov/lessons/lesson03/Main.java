package by.belhard.j20.ponkratov.lessons.lesson03;

public class Main {
    public static void main(String[] args) {
        int a = 3;
        int res = 0;

        switch (a) {
            case 1:
                res = a;
                break;
            case 2:
                res = a;
                break;
            case 3:
                res = a;
                break;
        }
        System.out.println(res);
        System.out.println();

        //ArrayExample

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
            System.out.println(arr[i]);
        }

        String[] array = {"one", "two", "three"};

        for (String str : array) {
            if (str.equals("two"))
                continue;
            System.out.println(str);
        }
        int[][] array1 = new int[3][];
        array1[0] = new int[3];
        array1[1] = new int[]{4, 5};
        array1[2] = new int[1];

        int[][] table = new int[8][8];

        for (int i = 2; i >= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                table[i - 2][j - 2] = i * j;
            }
        }
        for (int[] imerArray : table) {
            for (int i : imerArray) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        String[] strArr = {"a2124", "b", "c", "d", "e2134141"};
        String result = "";
        for (String s : strArr) {
            if (s.length() <= 3)
                result += s;
        }
        System.out.println(result);
        System.out.println();

        String name = "asd";
        System.out.printf("I am %d years old. %s", 30, name);

        System.out.println();

        int n = 9;
        int gap = n - 1;
        String result1;

        for (int i = 1; i <= n; i++) {
            result1 = " ";
            for (int g = 0; g < gap; g++) {
                result1 += " ";
            }
            for (int j = 0; j < i; j++) {
                result1 += i + "";
            }
            System.out.println(result1);
            gap--;
        }
    }
}
