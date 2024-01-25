import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println("     Задание 1");

        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        double[] array1 = {1.57, 7.654, 9.986};

        boolean[] array2 = new boolean[5];
        array2[4] = true;

        System.out.println("     Задание 2");


        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + " , ");
            } else {
                System.out.println(array[i]);
            }
        }
        for (int i = 0; i < array1.length; i++) {
            if (i != 0) {
                if (i != array1.length - 1) {
                    System.out.print(" , " + array1[i]);
                } else {
                    System.out.println(" , " + array1[i]);
                }
            } else {
                System.out.print(array1[i]);
            }
        }
        for (int i = 0; i < array2.length; i++) {
            if (i != array2.length - 1) {
                System.out.print(array2[i] + " , ");
            } else {
                System.out.println(array2[i]);
            }
        }

        System.out.println("     Задание 3");

        for (int i = array.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(array[i] + " , ");
            } else {
                System.out.println(array[i]);
            }
        }

        for (int i = array1.length - 1; i >= 0; i--) {
            if (i != array1.length - 1) {
                if (i != 0) {
                    System.out.print(" , " + array1[i]);
                } else {
                    System.out.println(" , " + array1[i]);
                }
            } else {
                System.out.print(array1[i]);
            }
        }

        for (int i = array2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array2[i]);
            } else {
                System.out.print(array2[i] + " , ");
            }
        }

        System.out.println("     Задание 4");

        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] % 2 != 0) {
                array[i] = array[i] + 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}