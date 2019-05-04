package Lesson1.B;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int[] x = new int[n];

    void input() {
        for (int i = 0; i < x.length; i++) {
            x[i] = scanner.nextInt();
        }
    }
}
