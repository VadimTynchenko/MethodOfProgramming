package Lesson1.B;

import java.util.Scanner;

public class Lesson1B_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }

        System.out.print("Четные: ");
        for (int value : x) {
            even(value);
        }

        System.out.println();

        System.out.print("Не четные: ");
        for (int value : x) {
            odd(value);
        }
    }

    private static void even(int x) {
        if ((x % 2) == 0) {
            System.out.print(x + " ");
        }
    }

    private static void odd(int x) {
        if ((x % 2) != 0) System.out.print(x + " ");
    }
}
