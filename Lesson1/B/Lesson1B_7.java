package Lesson1.B;

import java.util.Arrays;

public class Lesson1B_7 {
    public static void main(String[] args) {
        Input input = new Input();

        Arrays.sort(input.getNums());

        System.out.println(LCM(input.getNums()));

        System.out.println(GCD(input.getNums()));

    }

    private static int LCM(int[] ints) {
        try {
            int res = 0;
            for (int i = 0; i < ints.length - 1; i++) {
                res = ints[i] * ints[i + 1] / GCD(ints);
            }
            return res;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Мало!");
        }
        return 0;
    }

    private static int GCD(int[] ints) {
        try {
            int[] x = new int[ints.length];
            for (int i = 0; i < ints.length - 1; i++) {
                while (ints[i] != 0 && ints[i + 1] != 0) {
                    if (ints[i] > ints[i + 1]) {
                        ints[i] = ints[i] % ints[i + 1];
                    } else {
                        ints[i + 1] = ints[i + 1] % ints[i];
                    }
                }
            }
            for (int a : ints) {
                if (a != 0) {
                    return a;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Мало!");
        }
        return 1;
    }
}
