package Lesson1.B;

import java.util.Scanner;

class Input {
    private Scanner scanner = new Scanner(System.in);

    private int n = scanner.nextInt();
    int[] x = new int[n];

    void input() {
        for (int i = 0; i < x.length; i++) {
            x[i] = scanner.nextInt();
        }
    }
}
